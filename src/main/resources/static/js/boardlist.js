$(".popover_wrapper").on("click",function(){
    $(".icon-active").toggleClass("icon-action");
});

let sort = $(document.querySelectorAll(".sort-button"));

console.log(sort);

function buttonActive(){
    if($(".button1").hasClass("-active")){
        $(".button1").removeClass("-active");
    }else{
        $(".button1").addClass("-active");
    }

    if($(".button2").hasClass("-active")){
        $(".button2").removeClass("-active");
    }else{
        $(".button2").addClass("-active");
    }
}

function cateTab(){
    if($(".btn-action1").hasClass("active")){
        $(".btn-action1").removeClass("active");
        $()
    }else{
        $(".btn-action1").addClass("active");
    }
    if($(".btn-action2").hasClass("active")){
        $(".btn-action2").removeClass("active");
    }else{
        $(".btn-action2").addClass("active");
    }
}