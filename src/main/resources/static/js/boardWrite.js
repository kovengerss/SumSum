let title = $(".title-input");

title.on("keyup",function () {
            if(title.val().length >= 60){
                alert("글자수 제한 60자 이내 입력하세요.");
            }else{
                $(".title-check").text("(" + title.val().length+"/60)");
            }
    });

    let content = $(".note-codable");
    let contentSub = $(".note-editable");


    console.log(content.val().length);
console.log(contentSub.val().length);



    contentSub.on("keyup",function () {
        console.log("들어왓음?");
        console.log(contentSub.val().length());
        console.log(contentSub.val().size());
        console.log(contentSub.val());
    });





