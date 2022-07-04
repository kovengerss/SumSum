let curious = $(".curious");
let badge = $(".badge");
let good = $(".good-button");


$(".declaration-button").on("click",function () {
    if($(".declaration-button").hasClass("declaration-color")){
        alert("신고취소");
    }else{
        alert("신고완료");
    }
});

    let commentButton =$(".button-comment");

    commentButton.on("click",function(){
        $(".commentWrapper").fadeToggle("middle");
    });




