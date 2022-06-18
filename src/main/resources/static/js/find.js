// alert('Hello world!');

$(".find_id_button").on("click", function(){
    $(".some_find_id_phonenum").show();
    $(".some_find_certify_num").show();
    $(".Find_id_ment").show();
    $(".find_pw").hide();
});

$(".find_pw_button").on("click", function(){
    $(".some_find_id_phonenum").hide();
    $(".some_find_certify_num").hide();
    $(".Find_id_ment").hide();
    $(".find_pw").show();
});