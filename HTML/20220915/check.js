function check(){
    //if(document.getElementById("id").value == ""){ //셋 다 값을 입력하지 않았다면
    //if(document.getElementById("id").value == null){
    if(!document.getElementById("id").value){
        alert("아이디를 입력하세요!");
        document.getElementById("id").focus();
        return false;
    }
    if(!document.getElementById("passwd").value){
        alert("비밀번호를 입력하세요!");
        document.getElementById("passwd").focus();
        return false;
    }
    if(document.getElementById("passwd").value.length<8 || document.getElementById("passwd").value.length>13){
        alert("비밀번호는 8자리 이상 12자리 이하로 입력하세요");
        document.getElementById("passwd").value = "";
        document.getElementById("passwd").focus();
        return false;
    }
    if(document.getElementById("tel").value == ""){
        alert("연락처를 입력하세요!");
        document.getElementById("tel").focus();
        return false;
    }
    if(document.getElementById("addr").value == ""){
        alert("주소를 입력하세요!");
        document.getElementById("addr").focus();
        return false;
    }
    //폼 전송
    document.getElementById("dom").submit();
}