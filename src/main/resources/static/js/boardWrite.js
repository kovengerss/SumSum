let title = $(".title-input");

title.on("keyup",function () {
            if(title.val().length >= 60){
                alert("글자수 제한 60자 이내 입력하세요.");
            }else{
                $(".title-check").text("(" + title.val().length+"/60)");
            }
    });

    let contentSub = $(".note-editable");

    contentSub.on("keyup",function () {
        console.log(contentSub.text().length);
        console.log(contentSub.text());
        if(contentSub.text().length <= 80){
            $(".note-status-output").text(80 - contentSub.text().length+" 글자를 더 채워주세요😷");
            $(".note-status-output").css("margin-bottom", "18px");
            $(".note-status-output").css("border", "none");
            $(".note-status-output").css("display", "flex");
            $(".note-status-output").css("font-size", "18px");
            $(".note-status-output").css("justify-content", "flex-end");
            $(".note-status-output").css("padding-right", "20px");
            $(".note-status-output").css("padding-bottom", "20px");
            $(".note-status-output").css("color","#ff9090")
            $(".btn123").css("background","none");
            $(".btn123").css("border","1px solid #e3e3e3");
            $(".btn123").css("color","#1bb1ab");
        }else{
            $(".note-status-output").text("글자를 다 채웠습니다!!😀");
            $(".note-status-output").css("color","#0080ff ")
            $(".btn123").css("background","#90c8ff ");
            $(".btn123").css("border","#40a0ff ");
            $(".btn123").css("color","white");
        }

    });

let btnSuccess = $(".btnSuccess");
    btnSuccess.on("click",function () {
        if(contentSub.text().length <= 80){
            alert("80글자이상 작성해주세요.");
        }else if($(".categorySelector").val() == null){
            alert("게시 카테고리를 선택해주세요.")
        }else if(title.val() == null){
            alert("제목을 입력해주세요.")
        }
        return;
    });

