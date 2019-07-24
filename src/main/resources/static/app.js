$(function(){
    // Activate mobile nav toggle button
    $(".button-collapse").sideNav({edge: 'right'});
});

$("#submitIcon" ).click(function() {
    $( "#form-search" ).submit();
});