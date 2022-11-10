function check(){
    var member = document.dom;

    if(!member.id.value){
        alert("아이디를 입력하세요!");
        member.id.focus();
        return false;
    }
    if(!member.passwd.value){
        alert("비밀번호를 입력하세요!");
        member.passwd.focus();
        return false;
    }
    if(member.passwd.value.length<8 || member.passwd.value.legth>13){
        alert("비밀번호는 8자리 이상 12자리 이하로 입력해주세요!");
        member.passwd.value = "";
        member.passwd.focus();
        return false;
    }
    if(!member.tel.value){
        alert("전화번호를 입력하세요!");
        member.tel.focus();
        return false;
    }
    if(!member.addr.value){
        alert("주소를 입력하세요!");
        member.addr.focus();
        return false;
    }
    member.submit();
}