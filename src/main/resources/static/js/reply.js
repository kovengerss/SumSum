let replyService = (function(){

    function add(reply, callback){
        $.ajax({
            url: "/reply/new",
            type: "post",
            data: JSON.stringify(reply),
            contentType: "application/json",
            success: function(result){
                if(callback){
                    callback(result);
                }
            }
        });
    }

    function getList(param, callback){
        let boardNum = param.boardNum;
        let page = param.page || 1;

        $.getJSON("/reply/list/" + boardNum + "/" + page, function(replyPageDTO){
            if(callback){
                callback(replyPageDTO.list, replyPageDTO.total);
            }
        });
    }

    function read(replyNum, callback){
        $.get("/reply/" + replyNum, function(reply){
            if(callback){
                callback(reply);
            }
        });
    }

    function remove(replyNum, callback){
        $.ajax({
            url: "/reply/" + replyNum,
            type: "delete",
            success: function(result){
                if(callback){
                    callback(result);
                }
            }
        });
    }

    function modify(reply, callback){
        $.ajax({
            url: "/reply/" + reply.replyNum,
            type: "PUT",
            data: JSON.stringify(reply),
            contentType: "application/json; charset=utf-8",
            success: function(result){
                if(callback){
                    callback(result);
                }
            }
        });
    }

    function getTotal(boardNum,callback) {
        $.get("/reply/total/" + boardNum, function(total){
            if(callback){
                callback(total);
            }
        });
    }

    function getUserNum(replyNum,callback) {
        console.log("댓글 번호 : " + replyNum)
        $.get("/reply/num/" +replyNum,function (result) {
            console.log("댓글번호 2 :" + result);
            if(callback){
                callback(result);
            }
        })
    }


    function getUserName(replyNum,callback) {
        console.log("게시판 번호 정보 : " + replyNum);
        $.get("/reply/name/" + replyNum,function (result) {
            console.log("유저 이름 정보 : " + result);
            if(callback){
                callback(result);
            }
        })
    }

    return {
        add: add,
        getList: getList,
        read: read,
        remove: remove,
        modify: modify,
        getTotal:getTotal,
        getUserName : getUserName,
        getUserNum : getUserNum
    };
})();

