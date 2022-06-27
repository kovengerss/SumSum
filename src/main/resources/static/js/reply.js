console.log("Reply Module......");

    let replyService = (function () {
        function add(reply, callback){
            console.log(" add reply............");

            $.ajax({
               type : "post",
               url : "/reply/new",
               data : JSON.stringify(reply),
                contentType : "application/json; charset=utf-8",
                success : function (result) {
                        if(callback){
                            callback(result);
                        }
                }
            });
        }
        function getReplyList(param, callback){
            let boardNum = param.boardNum;
            let page = param.page || 1;

            $.getJSON("/reply/list/"+ boardNum +"/" + page +".json", function (data) {
                    if (callback){
                        callback(data);
                    }
            });
        }
        
        function modify(reply,callback) {
            console.log("ReplyNum : " + reply.replyNum + "/" + reply.userNum);

            $.ajax({
                url : "/reply/" + reply.replyNum+ "/" + reply.userNum,
                type : "put",
                contentType: "application/json; charset=utf-8",
                success : function (result) {
                    if(callback){
                        callback(result);
                    }
                }
            });
        }
        function remove(reply,callback) {

            $.ajax({
                type: 'delete',
                url : "/reply/" + reply.replyNum +"/"+reply.userNum,
                success : function (result) {
                    if(callback){
                        callback(result);
                    }
                }
            });
        }
        function read(replyNum, callback) {
            $.get("/reply/" + replyNum, function (result) {
                if(callback){
                    callback(result);
                }
            });
        }
        
        
        return {
            add : add,
            getReplyList : getReplyList,
            modify : modify,
            remove : remove,
            read : read
        }
    });