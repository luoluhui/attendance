$(function () {
    $.ajax({
        type:"POST",
        url:"/userInfo",
        success:function(data){
            alert("进来啦")
            alert(data.username);
        },
        error:function () {
            alert("mmp");
        }
    });
});