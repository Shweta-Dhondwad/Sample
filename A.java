package Overloading;

public class A {

void m1(A a){
System.out.println("Im in ma A");
}
}
 class B extends A{
	void m1(B b){
		System.out.println("Im in ma B");

	}
}
 class C extends B{
	void m1(C c){
		System.out.println("Im in ma C");

	}
}

