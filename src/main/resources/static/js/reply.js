console.log("Reply Module......");

    var replyService = (function () {
        function add(reply, callback){
            console.log(" add reply............");

            $.ajax({
               type : "post",
               url : "/reply/new",
               data : JSON.stringify({
                   "boardNum": boardNum,
                   "replyContent" : $("#comment").val(),
                   "userNum" : userNum
               }),
                contentType : "application/json; charset=utf-8",
                success : function (result, status, xhr) {
                        if(callback){
                            callback(result);
                        }
                },
                error: function (xhr, status, er) {
                    if(error){
                        error(er);
                    }
                }
            });
        }
        function getReplyList(param, callback, error){
            var bno = param.boardNum;
            var page = param.page || 1;

            $.getJSON("/reply/list/"+ bno +"/" + page +".json", function (data) {
                    if (callback){
                        callback(data);
                    }
            }).fail(function (xhr,status, err) {
                if(error){
                    error();
                }
            })
        }
        return {
            add : add,
            getReplyList : getReplyList
        }
    });