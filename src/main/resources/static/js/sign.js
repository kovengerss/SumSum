/**
 *
 */
var count= false;
function checkId() {

    if ($("#account-id").val() == '') {
        alert('아이디를 입력해주세요.')
        return false;
    }
    var userId = $("#account-id").val();
    console.log(userId);
    var data = {userId: userId}				// '컨트롤에 넘길 데이터 이름' : '데이터(.id_input에 입력되는 값)'

    $.ajax({
        type: "get",
        url: "/checkId",
        data: data,
        success: function (result) {
            if (result==true) {
                console.log(result);
                alert("이미 존재하는 아이디 입니다.");
                idCheck.css("color","red");
                idCheck.text("이미 존재하는 아이디입니다.");
                $("#account-id").val("");
                $("#account-id").focus();
                count =false;
            } else {
                console.log(result);
                idCheck.css("color","rgb(99 193 76)");
                idCheck.text("사용 가능한 아이디입니다.");
                $('userId').attr("result", "success");
                count = true;
            }
        }
    }); // ajax 종료
}
//휴대폰 번호 인증
/*let code2 = "";
function pushCode(){
    $.ajax({
        url:"/kovengerss/UserCheckPhoneOk.ul",
        type:"get",
        data:{userPhoneNum: $("input[name='userPhoneNum']").val()},
        contentType: "application/json; charset=utf-8",
        dataType:"json",
        success: function(result){
            if(!result.error){
                code2 = result.code;
                alert("인증번호 발송 완료");
            }
        }
    });
}$("#checkButton").on("click",function(){
    console.log(code2);
    console.log($("input[name=codeNum]").val());
    if($("input[name=codeNum]").val()==""){
        alert("인증번호를 입력하세요.");
    }else if($("input[name=codeNum]").val() == code2){
        alert("인증성공");
    }
    else{
        alert("인증실패");
    }
});*/

var userIdCheck = RegExp(/^[A-Za-z0-9_\-]{5,20}$/);
var codeCheck = RegExp(/^[0-9]{4,4}$/);
var numCheck = RegExp(/^[A-Za-z0-9_\-]{5,20}$/);
var passwdCheck = RegExp(/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^*()\-_=+\\\|\[\]{};:\'",.<>\/?]).{8,16}$/);
var nameCheck = RegExp(/^[가-힣]{2,6}$/);
var emailCheck2 = RegExp(/^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/);
var phoneNumCheck = RegExp(/^01[0179][0-9]{7,8}$/);
var birthCheck = RegExp(/^(19[0-9][0-9]|20\d{2})(0[0-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1])$/);
$(document).ready(function() {
    $("#cbx_chkAll").click(function() {
        if($("#cbx_chkAll").is(":checked")) $("input[name=chk]").prop("checked", true);
        else $("input[name=chk]").prop("checked", false);
    });

    $("input[name=chk]").click(function() {
        var total = $("input[name=chk]").length;
        var checked = $("input[name=chk]:checked").length;

        if(total != checked) $("#cbx_chkAll").prop("checked", false);
        else $("#cbx_chkAll").prop("checked", true);
    });
});



/* 아이디 유효성 검사  */
let idCheck = $(".account-id-error");
let $id = $("#account-id");
$id.on("keyup", function(){
    if(userIdCheck.test($id.val())){
        idCheck.css("color","red");
        idCheck.text("아이디 중복 확인을 해주세요.");
    }else if($id.val() == ""){
        idCheck.css("color","red");
        idCheck.text("아이디는 반드시 입력해야합니다.");
    }
    else{
        idCheck.css("color","red");
        idCheck.text("아이디 형식에 맞지 않습니다.");
    }
});

let nameChecked = $(".account-name-error");
let $name =$("#account-name");
$name.on("keyup", function(){
    if(nameCheck.test($name.val())){
        nameChecked.css("color", "rgb(99 193 76)");
        nameChecked.text("이름 입력 완료");
        return false;
    }
    else {
        nameChecked.css("color", "red");
        nameChecked.text("잘못된 이름입니다.");
        return false;
    }
});


/* 이메일 유효성 검사 */
let emailCheck = $(".account-email-error");
let $email = $("#account-email");
$email.on("keyup", function(){
    if(emailCheck2.test($email.val())){
        emailCheck.css("color","rgb(99 193 76)");
        emailCheck.text("이메일 입력완료.");
    } else if(nameCheck.test($email.val())){
        emailCheck.css("color","red");
        emailCheck.text("한글은 입력 할 수 없습니다.");
    } else if($email.val() ==""){
        emailCheck.css("color","red");
        emailCheck.text("이메일을 입력해주세요");
    }
    else{
        emailCheck.css("color","red");
        emailCheck.text("이메일 형식에 맞지 않습니다.");
    }
});



let pwCheck = $(".account-password-error");
let $pw = $("#account-password");
$pw.on("keyup", function(){
    if(passwdCheck.test($pw.val())){
        pwCheck.css("color","rgb(99 193 76)");
        pwCheck.text("비밀번호 입력완료.");
    }
    else if($pw.val() == ""){
        pwCheck.css("color","red");
        pwCheck.text("비밀번호는 반드시 입력해야합니다.");
    }
    else {
        pwCheck.css("color","red");
        pwCheck.text("8~16자로 영문 대 소문자, 숫자, 특수기호 입력");
    }
});

let pwConfirm= $(".account-password-confirm-error");
let $pwc= $("#account-password-confirm");


$pwc.on("keyup", function(){

    if($pwc.val() != passwdCheck.test($pw.val())){
        pwConfirm.css("color","red");
        pwConfirm.text("비밀번호가 일치하지 않습니다.");
        if($pwc.val() == ""){
            pwConfirm.css("color","red");
            pwConfirm.text("비밀번호를 입력해주세요.");
        }
    }

    if($pwc.val() == $pw.val()){
        pwConfirm.css("color","rgb(99 193 76)");
        pwConfirm.text("비밀번호 일치");
    }
});

/* 핸드폰 유효성 검사  */
let $hp = $("#account-hp");
let hpCheck = $(".tel-error");
$hp.on("keyup",function(){
    if(phoneNumCheck.test($hp.val())){
        hpCheck.css("color","rgb(99 193 76)");
        hpCheck.text("핸드폰 번호 입력완료.");
    }else{
        hpCheck.css("color","red");
        hpCheck.text("핸드폰 번호를 입력해주세요.");
        return false;
    }
});


let $birth = $("#userBirth");
let btCheck = $(".userBirth");
$birth.on("keyup",function(){
    if(birthCheck.test($birth.val())){
        btCheck.css("color","rgb(99 193 76)");
        btCheck.text("생년월일 입력완료.");
    }else{
        btCheck.css("color","red");
        btCheck.text("생년월일을 다시입력해주세요.");
        return false;
    }
});


function checks(){

    //이메일 공백 확인
    if($("#account-email").val() == ""){
        alert("이메일을 입력해주세요");
        $("#account-email").focus();
        return false;
    }

    //이메일 유효성 검사
    if(!emailCheck2.test($("#account-email").val())){
        alert("이메일형식에 맞게 입력해주세요")
        $("#account-email").val("");
        $("#account-email").focus();
        return false;
    }

    //아이디 공백 확인
    if($("#account-id").val() == ""){
        alert("아이디 입력해주세요");
        $("#account-id").focus();
        return false;
    }

    if(!userIdCheck.test($("#account-id").val())){
        alert("아이디를 다시 확인해주세요.");
        $("#account-id").focus();
        return false;
    }

    //비밀번호
    if(!passwdCheck.test($("#account-password").val())) {
        alert("비밀번호 형식에 맞춰서 입력해주세요.");
        $("#account-password").val("");
        $("#account-password").focus();
        return false;
    }

    //아이디랑 비밀번호랑 같은지
    if ($("#account-id").val()==($("#account-password").val())) {
        alert("비밀번호는 아이디와 다르게 입력해주세요.");
        $("#account-password").val("");
        $("#account-password").focus();
    }

    //비밀번호 똑같은지
    if($("#account-password").val() != ($("#account-password-confirm").val())){
        alert("비밀번호가 다릅니다.");
        $("#account-password").val("");
        $("#account-password-confirm").val("");
        $("#account-password").focus();
        return false;
    }

    //이름의 유효성 검사
    if(!nameCheck.test($("#account-name").val())){
        alert("이름을 다시 입력해주세요");
        $("#account-name").val("");
        $("#account-name").focus();
        return false;
    }
    //이름 유효성
    if (!nameCheck.test($("#account-name").val())) {
        alert("이름을 다시 입력해주세요.");
        $("#account-name").val("");
        $("#account-name").focus();
        return false;
    }
    // 성별 확인
    if($("#userGender").val() == ''){
        alert("성별을 선택해주세요.");
        $("#userGender").focus();
        return false;
    }

    // 생일 확인
    if($("#userBirth").val() == ''){
        alert("생년월일을 입력해주세요.");
        $("#userBirth").val("");
        $("#userBirth").focus();
        return false;
    }
    if(!birthCheck.test($("#userBirth").val())){
        alert("생년월일을 다시 입력해주세요.");
        $("#userBirth").val("");
        $("#userBirth").focus();
        return false;
    }


    //핸드폰번호 확인
    if(!phoneNumCheck.test($("#account-hp").val())) {
        alert("핸드폰 번호를 확인해주세요.");
        $("#account-hp").val("");
        $("#account-hp").focus();
        return false;
    }

    if(!codeCheck.test($("#authInput").val())) {
        alert("인증번호를 다시 확인해주세요");
        $("#authInput").val("");
        $("#authInput").focus();
        return false;
    }

    if($("#checkList1").is(":checked")== 0){
        alert("필수 항목을 체크해주세요.");
        console.log("1");
        return false;
    }
    if($("#checkList2").is(":checked")== 0){
        alert("필수 항목을 체크해주세요.");
        console.log("2");
        return false;
    }
    if($("#checkList3").is(":checked")== 0){
        alert("필수 항목을 체크해주세요.");
        console.log("3");
        return false;
    }



    if(checkId("#account-id")){
        alert("이미 존재하는 아이디 입니다.");
        return false;
    }

    if(count ==true){
        alert("회원가입이 완료되었습니다.");
        return true;
    }else if(count==false){
        alert("중복 확인을 눌러주세요.")
        $("#account-id").val("");
        $("#account-id").focus();
        return false;
    }

}

