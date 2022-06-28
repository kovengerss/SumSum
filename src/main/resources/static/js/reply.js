let replyService = (function(){

    function add(reply, callback){
        console.log("add reply.........");
        console.log(reply);
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

        $.getJSON("/reply/list/" + boardNum + "/" + page, function(list){
            if(callback){
                callback(list);
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
        $.get("/reply/total" + boardNum, function(total){
            if(callback){
                callback(total);
            }
        });
    }

    return {add: add, getList: getList, read: read, remove: remove, modify: modify,getTotal:getTotal};
})();