//$(document).ready(function(){
//    $('#resetBtn').attr('disabled',true);
//    $('#message').keyup(function(){
//        if($(this).val().length !=0)
//            $('#resetBtn').attr('disabled', false);            
//        else
//            $('#resetBtn').attr('disabled',true);
//    })
//});
var input = document.getElementById('message'),
    button = document.getElementById('resetBtn');

input.addEventListener('paste', function(e) {
    button.disabled = false;
});

$('#message').on('paste keyup', function(e) {
    $('#resetBtn').prop("disabled", false);
});