<!--//--><![CDATA[//><!--

startList = function() {
 
    var menu_ul = $('.menu > li > ul'),
        menu_a  = $('.menu > li > a');
     
    menu_ul.hide();
 
    menu_a.click(function(e) {
        e.preventDefault();
        if(!$(this).hasClass('active')) {
            menu_a.removeClass('active');
            menu_ul.filter(':visible').slideUp('normal');
            $(this).addClass('active').next().stop(true,true).slideDown('normal');
        } else {
            $(this).removeClass('active');
            $(this).next().stop(true,true).slideUp('normal');
        }
    });
 
}

window.onload=startList;
//--><!]]>



<!--//--><![CDATA[//><!--

startList = function() {

$('ul.dropdown-menu [data-toggle=dropdown]').on('click', function(event) {
// Avoid following the href location when clicking
event.preventDefault();
// Avoid having the menu to close when clicking
event.stopPropagation();
// If a menu is already open we close it
//$('ul.dropdown-menu [data-toggle=dropdown]').parent().removeClass('open');
// opening the one you clicked on
$(this).parent().addClass('open');
var menu = $(this).parent().find("ul");
var menupos = menu.offset();
if ((menupos.left + menu.width()) + 30 > $(window).width()) {
var newpos = - menu.width();
} else {
var newpos = $(this).parent().width();
}
menu.css({ left:newpos });
});
}

window.onload=startList;
//--><!]]>
