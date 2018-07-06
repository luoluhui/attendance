$(function () {
    $.ajax({
        type:"POST",
        url:"/userInfo",
        success:function(data){
            $(".user-image").attr("src",data.headImage);
            $(".user-name").text(data.username);
        }
    });
});