/**
 * Created by ArifC on 08.05.2015.
 */
$(document).ready(function (){
    console.log("in document ready");
    $(".nav-tabs").children("li").click(function (sender){
        console.log("geklickt!");
        $(".nav-tabs").children("li").removeClass("active");
        sender.addClass("active");
    })
});