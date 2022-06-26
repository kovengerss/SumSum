let curious = $(".curious");
let badge = $(".badge");

    function color(){
        if(curious.hasClass("color-change")){
           curious.removeClass("color-change");
            badge.removeClass("color-change");
        }else {
            curious.addClass("color-change");
            badge.addClass("color-change");
        }
    }

function declaration(){
    if($(".declaration-button").hasClass("declaration-color")){
        $(".declaration-button").removeClass("declaration-color");
        $(".declaration-text").removeClass("declaration-text-color")
    }else{
        $(".declaration-button").addClass("declaration-color");
        $(".declaration-text").addClass("declaration-text-color")
    }
}

$(".declaration-button").on("click",function () {
    if($(".declaration-button").hasClass("declaration-color")){
        alert("신고완료");
    }else{
        alert("신고취소");
    }
});

    let commentButton =$(".button-comment");

    commentButton.on("click",function(){
        $(".commentWrapper").fadeToggle("middle");
    });

//0-00

// var replyService = (function () {
//     function add(reply, callback){
//         console.log("add reply ...........");
//
//         $.ajax({
//             url:"/reply/new",
//             type: "post",
//             contentType : "application/json; charset=utf-8",
//             dataType:"json",
//             data: JSON.stringify({
//                 "boardNum": boardNum,
//                 "replyContent" : $("#comment").val(),
//                 "userNum" : userNum
//             }),
//             success : function (xhr, status, result) {
//                     if(error){
//                         error(er);
//                     }
//             }
//         });
//     }
//     return {
//         add : add
//     };
// });
//
// function getList(param,callback,error) {
//     var bno = param.boardNum;
//     var page = param.page || 1;
//
//     $.getJSON("/reply/list/" + bno + "/" + page + ".json",function(data){
//        if(callback){
//            callback(data);
//        }
//     }).fail(function (xhr, status, err) {
//         if(error){
//             error();
//         }
//     });
// }


/*// 댓글 등록
function register(){
    console.log("들어옴?");
    $.ajax({
        url:"/reply/new",
        type: "post",
        contentType : "application/json",
        dataType:"json",
        data: JSON.stringify({
            "boardNum": boardNum,
            "replyContent" : $("#comment").val(),
            "userNum" : userNum
        }),
        success: function (result) {
        }
    });
}
console.log("등록 나옴");*/



