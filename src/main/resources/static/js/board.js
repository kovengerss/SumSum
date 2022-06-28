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
    });




