package Overloading;

 class OverloadingScenarios{
	void m1(A a){
System.out.println("Im in ma A");
	}
	void m1(B b){
		System.out.println("Im in ma B");

	}
	void m1(C c){
		System.out.println("Im in ma C");

	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		
		OverloadingScenarios obj=new OverloadingScenarios();
		A a=new A();
		obj.m1(a);
		
		B b=new B();
		obj.m1(b);
		C c=new C();
		obj.m1(c);
		
B bc=new C();
obj.m1(bc);
A ab=new B();
obj.m1(ab);
	}

}
