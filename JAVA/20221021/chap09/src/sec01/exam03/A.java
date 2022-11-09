package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		int field3;
		//static int field4;
		//static void method3();
		
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C {
		int field3;
		static int field4;
		static void method3() {}
		
		void method() {
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
