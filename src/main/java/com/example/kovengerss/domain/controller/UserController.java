package com.example.kovengerss.domain.controller;

import com.example.kovengerss.domain.service.UserService;
import com.example.kovengerss.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        session.setAttribute("userNum",userNum);
        session.setAttribute("userList",userVO);
        return "redirect:/main";
    }

    @GetMapping("main")
    public String home(UserVO userVO){
        return "/main";
    }
    /*@PostMapping("login")
    public String login(String userId, String userPw, HttpSession httpSession, Model model){
        UserVO userVO = new UserVO();
        log.info("--------------------------userService--------------------------");
        userService.login(userId, userPw);
        log.info("--------------------------userService--------------------------");
        if(userVO == null){
            return "login";
        }
        model.addAttribute("main", userVO);
        return "redirect:/main";
    }*/
    //마이페이지 전체정보
    @GetMapping("myPage")
    public void getMyPage(){

    }
    //마이페이지 글 목록
    @GetMapping("myPageText")
    public void getMyPageList(){

    }
    //마이페이지 답장 목록
    @GetMapping("myPageAnswer")
    public void getMyPageAnswerList(){

    }

    //마이페이지 매칭인
    @GetMapping("myPageMatching")
    public void getMyPageMatching(){

    }

    //마이페이지 포인트 내역
    @GetMapping("myPagePoint")
    public void getPointSelect(){

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
    @PostMapping("myPage")
    public String deleteUser(String userPw, HttpSession httpSession, Model model, RedirectAttributes rttp){
        Map map = rttp.getFlashAttributes();
        String userId = (String) httpSession.getAttribute(USER_SESSION_KEY);
        boolean isSuccess = userService.userDeleteByIdAndPw(userId, userPw);
        model.addAttribute("deleteSuccess",isSuccess);
        log.info("userPw : "  + userPw);
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
    //http://localhost:10030/user/sms/send?userPhoneNum=01072579003 포인트 차감 되요. 함부로 사용하시면
    //때찌합니다.

    //아이디 찾기
    @PostMapping("find/id/success")
    @ResponseBody
    public Object findIdSuccess(@RequestBody Map<String, Object> map){
        map.put("userPhoneNum", map.get("userPhoneNum"));

        userService.findIdSuccess(map);

        return map;
    }

    //
    @PostMapping("user/sms/verify")
    public void verify(String userPhoneNum,String authInput){
        userService.verifySms(userPhoneNum, authInput);
    }
}
