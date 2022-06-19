let curious = $(".curious");
let badge = $(".badge");
let good = $(".good-button");

function color(){
    if(curious.hasClass("color-changeAppil")){
        curious.removeClass("color-changeAppil");
        badge.removeClass("color-changeAppil");
        good.removeClass("icon-changeAppil");
    }else {
        curious.addClass("color-changeAppil");
        badge.addClass("color-changeAppil");
        good.addClass("icon-changeAppil");
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
})

let commentSubmit = $(".comment-submit");
let comment = $(".comment");

comment.on("keyup",function(){
    if(comment.val().length != 0){
        commentSubmit.css("background-color","#40a0ff");
        commentSubmit.css("border-color","#90c8ff");
    }else{
        commentSubmit.css("background-color","#1fc7c1");
        commentSubmit.css("border-color","#8ddbd7");
    }
});

commentSubmit.on("click",function () {
    if(comment.val().length == 0) {
        alert("댓글을 입력해주세요");
    }else{
        alert("댓글 등록완료");
    }
});

