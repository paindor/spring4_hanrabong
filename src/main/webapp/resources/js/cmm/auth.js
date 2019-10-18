"user strict";
var auth = auth || {};

auth =(() =>{
	const WHEN_ERR = 'js파일없음'
	let _,js, auth_vue_js;
	
	let init =()=>{
		_= $.ctx();
		js = $.js();
		auth_vue_js=js+'/vue/auth_vue.js';
		
	};
	let onCreate =()=>{
		
		init();
		$.getScript(auth_vue_js).done(()=>{
			setContentView()
			$('#a_go_join').click(e=>{
				e.preventDefault()
				join()
			})
		}).fail(()=>{alert(WHEN_ERR)})
	}
	let setContentView=()=>{
		login();
		
	}
	let join=()=>{
		   $('head')
		      .html(auth_vue.join_head())
		   $('body')
		      .html(auth_vue.join_body())
		      $('<button>' , {
				text: 'continue',
				href: '#' ,
				click : e=>{
					e.preventDefault();
					let data = {cid : $('#cid').val() , cpw : $('#cpw').val()};
					alert('id?')
					$.ajax({
						url : _+'/hcust/join',
						type : 'POST',
						dataType : 'json',
						data : JSON.stringify(data),
						contentType : 'application/json',
						success : d => {
							alert('ajax성공' + d.cid + d.cpw);
							login()
						},
						error : e => {
							alert('ajax실패');
						}
					})
				}
		      })
			.addClass('btn btn-primary btn-lg btn-block')
			.appendTo('#button')
			
						
		
	}
	let login =()=>{
		let x = {css:$.css(), img:$.img()}
		$('head')
		.html(auth_vue.login_head(x));
		$('body')
		.html(auth_vue.login_body(x));
		$('<button>', {
			type :"submit",
			text : "sign in",
	
			click : e =>{
				e.preventDefault();
				let idpw = {cid:$('#uid').val() , cpw:$('#pwd').val()};
				alert('성공');
				$.ajax({
					url : _+'/hcust/join',
					type:'POST',
					dataType:'json',
					data: JSON.stringify(idpw),
					contentType:'application/json'
						
				})
				
			}
			
			
		})
		.addClass("btn btn-lg btn-primary btn-block")
		.appendTo('#btn_login')
	}
		
		return {onCreate ,join, login};
	
	
})();
