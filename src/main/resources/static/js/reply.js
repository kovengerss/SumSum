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

    function getUserName(replyNum,callback) {
        console.log("게시판 번호 정보 : " + replyNum);
        $.get("/reply/name/" + replyNum,function (result) {
            console.log("유저 이름 정보 : " + result);
            if(callback){
                callback(result);
            }
        })
    }

    function getReplyDate(replyDate) {
        let today = new Date();
        let rDate = new Date(replyDate);
        let gap = today.getTime() - rDate.getTime();

        if (gap < 1000 * 60) {
            let s = new Date().getSeconds() - rDate.getSeconds();

            return s + '초 전';
        }else if(gap < 1000 * 60 * 60) {
            let m = new Date().getMinutes() - rDate.getMinutes();

            return m + '분 전';
        }else if(gap < 1000 * 60 * 60 * 24){
            let h = new Date().getHours() - rDate.getHours();

            return h + '시간 전';
        } else{
            let y = rDate.getFullYear();
            let m = rDate.getMonth() + 1;
            let d = rDate.getDate();

            return [y, (m < 10 ? '0' : '') + m, (d < 10 ? '0' : '') + d].join("-")
        }
    }

    return {
        add: add,
        getList: getList,
        read: read,
        remove: remove,
        modify: modify,
        getTotal:getTotal,
        getUserName : getUserName,
        getReplyDate : getReplyDate
    };
})();

