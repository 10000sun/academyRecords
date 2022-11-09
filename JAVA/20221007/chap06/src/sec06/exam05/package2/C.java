package sec06.exam05.package2; //package 1아님

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1; //default 접근 불가능(같은 패키지 아님)
		//a.field3 = 1; //private 접근 불가능
		
		a.method1();
		//a.method2(); //default 접근 불가능(같은 패키지 아님)
		//a.method3();//private 접근 불가능
	}
}
