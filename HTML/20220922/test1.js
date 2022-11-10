function check(){
    var idJ = /^[a-z0-9]*$/;
    var id = document.getElementById('uid').value;
    var pwdJ1 = /^[a-z0-9]{6,12}$/;
    var pwd1 = document.getElementById('upwd1').value;
    var pwdJ2 = /^[a-z0-9]{6,12}$/;
    var pwd2 = document.getElementById('upwd2').value;
    var nameJ = /^[가-힣]*$/;
    var name = document.getElementById('uname').value;

    if(!idJ.test(id) || id == ""){
        alert("아이디는 영어 소문자와 숫자로만 입력하세요!");
        document.getElementById('uid').value = "";
        document.getElementById('uid').focus();
        return false
    }
    if(!pwdJ1.test(pwd1) || pwd1 == ""){
        alert("패스워드는 6자 이상12자리 이하로 입력하세요!");
        document.getElementById('upwd1').value = "";
        document.getElementById('upwd1').focus();
        return false
    }
    if(!pwdJ2.test(pwd2) || pwd2 == "" || pwd2 != pwd1){
        alert("패스워드를 올바르게 입력하세요!");
        document.getElementById('upwd2').value = "";
        document.getElementById('upwd2').focus();
        return false
    }
    if(!nameJ.test(name) || name == ""){
        alert("이름은 한글로만 입력하세요!");
        document.getElementById('uname').value = "";
        document.getElementById('uname').focus();
        return false
    }
//전송
document.getElementById("signup").submit();
}
