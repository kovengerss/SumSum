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
        }else{
            $(".declaration-button").addClass("declaration-color");
        }
    }

    let commentButton =$(".button-comment");

    commentButton.on("click",function(){
        $(".commentWrapper").fadeToggle("middle");
    })

