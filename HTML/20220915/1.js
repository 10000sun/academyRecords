function check(){
    var nameJ = /^[가-힣]*$/;
    var name = document.getElementById('uname').value;
    var idJ = /^[a-zA-z0-9]{6,16}$/;
    var id = document.getElementById('uid').value;
    var pwdJ1 = /^[a-zA-z0-9@$!%*#?&]{8,16}$/;
    var pwd1 = document.getElementById('upwd1').value;
    var pwdJ2 = /^[a-zA-z0-9@$!%*#?&]{8,16}$/;
    var pwd2 = document.getElementById('upwd2').value;
    var telJ = /^([0-9]{8})$/;
    var tel = document.getElementById('utel').value;
    var emailJ = /^[0-9a-zA-z]*$/i;
    var email = document.getElementById('umail').value;

    if(!idJ.test(id) || id == ""){
        alert("아이디는 영어 대소문자와 숫자로 6~12자리로 입력해 주세요.");
        document.getElementById('uid').value = "";
        document.getElementById('uid').focus();
        return false
    }
    if(!pwdJ1.test(pwd1) || pwd1 == ""){
        alert("비밀번호는 영어 대소문자와 숫자, 특수문자로 8~16자리 입력해 주세요.");
        document.getElementById('upwd1').value = "";
        document.getElementById('upwd1').focus();
        return false
    }
    if(!pwdJ2.test(pwd2) || pwd2 == "" || pwd2 != pwd1){
        alert("비밀번호를 확인해 주세요.");
        document.getElementById('upwd2').value = "";
        document.getElementById('upwd2').focus();
        return false
    }
    if(!nameJ.test(name) || name == ""){
        alert("이름을 정확히 입력하세요.");
        document.getElementById('uname').value = "";
        document.getElementById('uname').focus();
        return false
    }
    if(!emailJ.test(email) || email == ""){
        alert("이메일을 정확히 입력하세요.");
        document.getElementById('umail').value = "";
        document.getElementById('umail').focus();
        return false
    }
    if(!telJ.test(tel) || tel == ""){
        alert("전화번호는 숫자로 입력하세요.");
        document.getElementById('utel').value = "";
        document.getElementById('utel').focus();
        return false
    }
    //전송
    document.getElementById("registform").submit();
}