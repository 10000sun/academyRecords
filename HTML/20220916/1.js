function check(){
    var nameJ = /^[가-힣]*$/;
    var name = document.getElementById('uname').value;
    var idJ = /^[a-z0-9]*$/;
    var id = document.getElementById('uid').value;
    var pwdJ1 = /^[a-z0-9]*$/;
    var pwd1 = document.getElementById('upwd1').value;
    var pwdJ2 = /^[a-z0-9]*$/;
    var pwd2 = document.getElementById('upwd2').value;
    var birth1 = document.getElementById('ubirth').value;
    var telJ1 = /^([0-9]{4})$/;
    var tel1 = document.getElementById('utel1').value;
    var telJ2 = /^([0-9]{4})$/;
    var tel2 = document.getElementById('utel2').value;
    var emailJ = /^[0-9a-zA-z]*$/i;
    var email = document.getElementById('umail1').value;

    if(!nameJ.test(name) || name == ""){
        alert("이름을 정확히 입력하세요.");
        document.getElementById('uname').value = "";
        document.getElementById('uname').focus();
        return false
    }
    if(!idJ.test(id) || id == ""){
        alert("아이디는 영어 소문자와 숫자로 15자 이내로 입력해 주세요.");
        document.getElementById('uid').value = "";
        document.getElementById('uid').focus();
        return false
    }
    if(!pwdJ1.test(pwd1) || pwd1 == ""){
        alert("비밀번호는 영어 소문자와 숫자로 15자 이내로 입력해 주세요.");
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
    if(birth1 == ""){
        alert("생일을 정확히 입력하세요.")
        return false
    }
    if(!emailJ.test(email) || email == ""){
        alert("이메일을 정확히 입력하세요.");
        document.getElementById('umail1').value = "";
        document.getElementById('umail1').focus();
        return false
    }
    if(!telJ1.test(tel1) || tel1 == ""){
        alert("전화번호를 정확히 입력하세요.");
        document.getElementById('utel1').value = "";
        document.getElementById('utel1').focus();
        return false
    }
    if(!telJ2.test(tel2) || tel2 == ""){
        alert("전화번호를 정확히 입력하세요.");
        document.getElementById('utel2').value = "";
        document.getElementById('utel2').focus();
        return false
    }
    //전송
    document.getElementById("register").submit();
}

function idcheck(){
    if(document.getElementById('uid').value != ""){
        alert("사용 가능한 아이디 입니다.")
        return false
    }
    alert("아이디를 정확히 입력하세요.")
}