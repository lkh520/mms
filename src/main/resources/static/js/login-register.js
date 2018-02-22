var app = new Vue({
	el : '#app',
	data : {
		login : "登陆",
		register:'注册',
		enters : "确定",
		popTitleType:1
	}
})
function showRegisterForm(){
    $('.loginBox').fadeOut('fast',function(){
        $('.registerBox').fadeIn('fast');
        $('.login-footer').fadeOut('fast',function(){
            $('.register-footer').fadeIn('fast');
        });
        app.popTitleType=2;
    }); 
    $('.error').removeClass('alert alert-danger').html('');
       
}
function showLoginForm(){
    $('#loginModal .registerBox').fadeOut('fast',function(){
        $('.loginBox').fadeIn('fast');
        $('.register-footer').fadeOut('fast',function(){
            $('.login-footer').fadeIn('fast');    
        });
        app.popTitleType=1;
    });       
     $('.error').removeClass('alert alert-danger').html(''); 
}

function openLoginModal(){
    showLoginForm();
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    
}
function openRegisterModal(){
    showRegisterForm();
    setTimeout(function(){
        $('#loginModal').modal('show');    
    }, 230);
    
}

function loginAjax(){
    /*   Remove this comments when moving to server */
	var data = $("#loginForm").serializeJson();
	$.ajax({
	    type: "POST",
	    url: "login",
	    contentType: "application/json;charset=utf-8",  
	    data: JSON.stringify(data),// 要提交的表单
	    success: function (msg) {
	    	debugger
			if (msg == 1) {
				window.location.replace("home/index.html");
			} else {
				//Simulate error message from the server 
				shakeModal();
				return;
			}
	    },
	    error: function (error) {
	    	shakeModal();
	    }
	  });
}
function regAjax(){
    /*   Remove this comments when moving to server */
	var data = $("#regForm").serializeJson();
	debugger
	if(data.password!=data.password_confirmation){
		shakeModal();
		return;
	}
	$.ajax({
	    type: "POST",
	    url: "register",
	    contentType: "application/json;charset=utf-8",  
	    data: JSON.stringify(data),// 要提交的表单
	    success: function (msg) {
			if (msg == 1) {
				window.location.replace("index.html");
			} else {
				shakeModal();
				return;
			}
	    },
	    error: function (error) {
	    	shakeModal();
	    }
	  });
}
function shakeModal(){
    $('#loginModal .modal-dialog').addClass('shake');
             $('.error').addClass('alert alert-danger').html("Invalid email/password combination");
             $('input[type="password"]').val('');
             setTimeout( function(){ 
                $('#loginModal .modal-dialog').removeClass('shake'); 
    }, 1000 ); 
}
   