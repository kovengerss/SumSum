
let warringService = (function(){

    function warringUp(warring,callback) {
        $.ajax({
            url:"/warring/warring",
            type: "post",
            data: JSON.stringify(warring),
            contentType: "application/json",
            success: function(result){
                if(callback){
                    callback(result);
                }
            }
        });
    }

    function warringCount(warring, callback) {
        console.log("가져왓지?? : " + boardNum)
        $.get("/warring/count/" + boardNum ,function (warring) {
            console.log("warring : " + warring);
            if (callback){
                callback(warring);
            }
        });
    }

    function warringDown(warring, callback) {
        $.ajax({
            url: "/warring/" + boardNum + "/" + userNum,
            type: "delete",
            success: function (result) {
                console.log("삭제 들어옴" + result);
                if (callback) {
                    callback(result);
                }
            }
        });
    }

    function warringCountUp(warring,callback) {
        $.ajax({
            url:"/warring/warringCount/",
            type :"post",
            data: JSON.stringify(warring),
            contentType: "application/json",
            success : function (result) {
                if (callback){
                    callback(result);
                }
            }
        });
    }

    return{
        warringUp : warringUp,
        warringCount : warringCount,
        warringDown : warringDown,
        warringCountUp : warringCountUp
    }
})();

