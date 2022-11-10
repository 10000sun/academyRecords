function check(){
    var nameJ = /^[가-힣]*$/;
    var name = document.getElementById('name').value;
    var idJ = /^[a-zA-z0-9]*$/;
    var id = document.getElementById('id').value;
    var passwdJ = /^[a-zA-z0-9]{8,12}$/;
    var passwd = document.getElementById('passwd').value;
    var telJ = /^010?([0-9]{4})?([0-9]{4})$/;
    var tel = document.getElementById('tel').value;
    var emailJ = /^[0-9a-zA-z]([-_.]?[0-9a-zA-z])*@[0-9a-zA-z]([-_.]?[0-9a-zA-Z])*.[a-zA-z]{2,3}$/i;
    var email = document.getElementById('email').value;

    if(!nameJ.test(name)){
        alert("이름은 한글 2~6자만 입력하세요.")
        document.getElementById('name').value = "",
        document.getElementById('name').focus();
        return false
    }
    if(!idJ.test(id)){
        alert("아이디는 영어 대소문자와 숫자로 4자리 이상 12자리 이하로 입력하세요 입력하세요.")
        document.getElementById('id').value = "",
        document.getElementById('id').focus();
        return false
    }
    if(!passwdJ.test(passwd)){
        alert("비밀번호는 영어 대소문자와 숫자로 8자리 이상 12자리 이하만 입력하세요.")
        document.getElementById('passwd').value = "",
        document.getElementById('passwd').focus();
        return false
    }
    if(!telJ.test(tel)){
        alert("전화번호는 숫자만 입력하세요.")
        document.getElementById('tel').value = "",
        document.getElementById('tel').focus();
        return false
    }
    if(!emailJ.test(email)){
        alert("이메일을 정확히 입력하세요.")
        document.getElementById('email').value = "",
        document.getElementById('email').focus();
        return false
    }
    //전송
    document.getElementById("member").submit();
}