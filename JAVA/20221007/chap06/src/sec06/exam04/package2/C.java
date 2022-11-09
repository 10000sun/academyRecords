package sec06.exam04.package2;

import sec06.exam04.package1.A;

public class C {
	A a1 = new A(true); //public은 아무나 접근가능
	//A a2 = new A(1); default는 같은 패키지만 접근가능 
	//A a3 = new A("문자열"); private는 접근 불가능
}
