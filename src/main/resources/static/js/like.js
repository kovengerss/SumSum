let likeService = (function(){

    function heartUp(like,callback) {
        $.ajax({
            url:"/like/heart",
            type: "post",
            data: JSON.stringify(like),
            contentType: "application/json",
            success: function(result){
                if(callback){
                    callback(result);
                }
            }
        });
    }

    function heartCount(like, callback) {
        console.log("가져왓지?? : " + boardNum)
        $.get("/like/count/" + boardNum ,function (like) {
            console.log("like : " + like);
            if (callback){
                callback(like);
            }
        });
    }

    function heartDown(like, callback) {
        $.ajax({
            url: "/like/" + boardNum + "/" + userNum,
            type: "delete",
            success: function (result) {
                console.log("삭제 들어옴" + result);
                if (callback) {
                    callback(result);
                }
            }
        });
    }

    function CountUp(like,callback) {
        $.ajax({
            url:"/like/goodCount/",
            type :"post",
            data: JSON.stringify(like),
            contentType: "application/json",
            success : function (result) {
                if (callback){
                    callback(result);
                }
            }
        });
    }

    return{
        heartUp : heartUp,
        heartCount : heartCount,
        heartDown : heartDown,
        CountUp : CountUp
    }
})();

