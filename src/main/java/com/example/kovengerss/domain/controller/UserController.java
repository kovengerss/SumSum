package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.dao.BoardDAO;
import com.example.kovengerss.domain.service.BoardService;
import com.example.kovengerss.domain.service.PointService;
import com.example.kovengerss.domain.service.ReplyService;
import com.example.kovengerss.domain.service.UserService;
import com.example.kovengerss.domain.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TASK			        URL			           METHOD		PARAMETER		      FORM	    URL이동
//관리자로그인	        adminLogin		        post		모든항목			      필요	    adminpage
//로그인			        login			        post		모든항목			      필요	    main
//회원가입		        sign			        post		모든 항목			  필요  	    choice
//연애선택		        love		    	    post		모든 항목			  필요	    main
//결혼선택		        marry			        post		모든 항목			  필요	    main
//글작성			        /board/boardWrite		post		모든 항목			  필요	    /board/board
//글목록			        /board/boardList		get		    boardNum,boardField   없음	    /board/boardList
//어필목록		        /board/appilBoardList	get		    boardNum,boardField	  없음	    /board/appilBoardList
//리뷰목록		        /board/reviewBoardList	get		    boardNum,boardField	  없음	    /board/reviewBoardList
//쪽지보내기		        pick			        post		모든항목			      필요	    pick
//쪽지발신함		        letter			        get		    letterToNum		      필요	    letter
//쪽지수신목록		    letter			        get		    letterFromNum		  없음	    letter
//마이페이지전체정보    	myPage			        get		    userNum			      없음	    myPage
//마이페이지 글목록	    myPageText		        get		    boardNum		      없음	    myPageText
//마이페이지 답장목록	    myPageAnswer		    get		    replyNum		      없음	    myPageAnswer
//마이페이지 매칭인     	myPageMatching		    get			                      없음	    myPageMatching
//마이페이지 포인트내역	myPagePoint		        get		    pointNum		      없음	    myPagePoint
//포인트 결제		        myPagePoint		        post		모든항목			      필요	    myPagePoint
//블랙리스트     		    adminpage               get         blackListNum          없음       adminpage
//@RestController api 확인시 기존 Conroller 어노테이션 주석하고 이거 활성
@Controller
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final BoardService boardService;
    private final ReplyService replyService;
    private final PointService pointService;

    // 공통적으로 사용하는 키는 static 으로 선언해준다.
    private static final String USER_SESSION_KEY = "userId";
    //회원가입
    @GetMapping("sign")
    public void signUpForm(){
    }
    @GetMapping("checkId")
    @ResponseBody
    public boolean checkId(String userId){
        if(userService.checkId(userId)){
            return true;
        }return false;
    }

    @PostMapping("sendCode")
    @ResponseBody
    public Object sendCode(@RequestBody Map<String, Object> map){
        map.put("userPhoneNum", map.get("userPhoneNum"));
        userService.sendSms(map);
        return map;
    }


    @PostMapping("sign")
    public String userInsert(UserVO userVO){
        log.info("----------------------------");
        log.info("Insert............. : " + userVO);
        log.info("----------------------------");
        userService.userInsert(userVO);
        return "redirect:/login";
    }

    //로그인
    @GetMapping("login")
    public String loginForm(){
        return "login";
    }
    @PostMapping("login")
    public String login(String userId, String userPw, HttpServletRequest req){
        UserVO userVO = userService.login(userId, userPw);
        HttpSession session = req.getSession();
        Integer userNum = userVO.getUserNum();
        String userName = userVO.getUserName();
        session.setAttribute("userNum",userNum);
        session.setAttribute("userList",userVO);
        session.setAttribute("userName",userName);

        return "redirect:/main";
    }

    // 메인페이지
    @GetMapping("main")
    public String home(Model model, HttpSession session){
        // 잔여 포인트
        String userCount = String.valueOf(userService.getUserTotalCount());
        UserVO userVO = (UserVO) session.getAttribute("userList");
        if (userVO != null) {
            Integer point = userService.getUserPoint(userVO.getUserNum());
            model.addAttribute("point", point);
        }

        // 메인 후기 글 가져오기
        BoardVO reviewBoardVO = new BoardVO();
        reviewBoardVO.setBoardField("후기");
        Criteria criteria= new Criteria();
        model.addAttribute("reviewBoardList", boardService.getList(reviewBoardVO,criteria));

        // 메인 어필하기 글 가져오기
        BoardVO applicationBoardVO = new BoardVO();
        applicationBoardVO.setBoardField("어필하기");
        model.addAttribute("appilcationBoardList", boardService.getList(applicationBoardVO,criteria));

        model.addAttribute("count", userCount);
        model.addAttribute("session", session);
        log.info("총 이용자수 : " + "count");

        return "/main";
    }

    //마이페이지 전체정보
    @GetMapping("myPage")
    public void getMyPage(){

    }
    //마이페이지 글 목록
    @GetMapping("myPageText")
    public String getMyPageList(HttpSession httpSession, Model model){
        UserVO userVO = (UserVO) httpSession.getAttribute("userList");

        if (userVO != null) {
            Integer point = userService.getUserPoint(userVO.getUserNum());
            model.addAttribute("point", point);
            List<BoardVO> boardVOList = boardService.findAllByUserVO(userVO);
            model.addAttribute("boardVOList", boardVOList);
        }

        return "/myPageText";
    }

    //마이페이지 댓글 목록
    @GetMapping("myPageAnswer")
    public String getMyPageAnswerList(HttpSession httpSession, Model model){
            UserVO userVO = (UserVO) httpSession.getAttribute("userList");
        if (userVO != null) {
            Integer point = userService.getUserPoint(userVO.getUserNum());
            model.addAttribute("point", point);
            List<ReplyVO> replyVOList = replyService.findReplyByUserVO(userVO);
            model.addAttribute("replyVOList", replyVOList);
        }
            
        return "/myPageAnswer";
    }

    //마이페이지 포인트
    @GetMapping("myPagePoint")
    public String getPointSelect(Model model, HttpSession session){
        UserVO userVO = (UserVO) session.getAttribute("userList");
        Integer point = userService.getUserPoint(userVO.getUserNum());

        // 충전 내역 가져오기 where POINT_WAY = 'SAVE'
        List<Point> savePointList = pointService.findAllByUserNumAndSave(userVO.getUserNum());
        // 충전 내역 가져오기 where POINT_WAY = 'USE'
        List<Point> usePointList = pointService.findAllByUserNumAndUse(userVO.getUserNum());

        model.addAttribute("point", point);
        model.addAttribute("userVO", userVO);
        model.addAttribute("savePointList", savePointList);
        model.addAttribute("usePointList", usePointList);
        return "myPagePoint";
    }

    //연애 선택
    @PostMapping("love")
    public void getLove(){

    }

    //결혼 선택
    @PostMapping("marry")
    public void getMarry(){

    }

    //회원 탈퇴
    @PostMapping("/user/delete")
    public String deleteUser(String userPw, HttpSession httpSession, Model model, RedirectAttributes rttp){
        UserVO userVO = (UserVO) httpSession.getAttribute("userList");
        log.info("deleteUser : " + userPw + userVO.getUserId());
        boolean isSuccess = userService.userDeleteByIdAndPw(userVO.getUserId(), userPw);
        model.addAttribute("deleteSuccess",isSuccess);
        return "redirect:/main";
    }


    //아이디 찾기
    @GetMapping("find")
    public String find(){
        return "find";
    }

    //아이디 찾기
    @PostMapping("user/sms/send")
    @ResponseBody
    public Object sendSms(@RequestBody Map<String, Object> map){
        map.put("userPhoneNum", map.get("userPhoneNum"));
        userService.sendSms(map);
        return map;
    }

    //아이디 찾기
    @PostMapping("find/id/success")
    @ResponseBody
    public Object findIdSuccess(@RequestBody Map<String, Object> map){
        map.put("userPhoneNum", map.get("userPhoneNum"));
        userService.findIdSuccess(map);
        return map;
    }

    // 이용자 수
    @GetMapping("user/total")
    @ResponseBody
    public Map getUserTotal(Model model){
       Map<String, String> map = new HashMap<>();
       map.put("count" , String.valueOf(userService.getUserTotalCount())); //이용자 수
       map.put("date", LocalDateTime.now().toString()); // 현재 시간
       model.addAttribute("count",map.get("count"));
       log.info("총 이용자수1 : " + map.get("count"));
       log.info("총 이용자수2 : " + "count");
       return map;
    }

    // 비밀번호 찾기 이메일 인증
    @PostMapping("user/email/send")
    @ResponseBody
    public Object sendEmail(@RequestBody Map<String, Object> map){
        map.put("email", map.get("email"));
        userService.sendEmail(map);
        return map;
    }

    // 회원 로그아웃
    @GetMapping("user/logout")
    public String userLogout(HttpSession httpSession){
        httpSession.removeAttribute("userList");
        return "redirect:/main";
    }
}
