let curious = $(".curious");
let badge = $(".badge");

    if(curious.hasClass("color-change")){
        curious.on("click",function(){
            curious.removeClass("color-change");
        });
    }

