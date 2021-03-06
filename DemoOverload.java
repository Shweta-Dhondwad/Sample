package Overloading;

public class DemoOverload {

	void m1(A a)
	{
		System.out.println("Im in ma A");

	}
	void m1(String s){
		System.out.println("Im in ma string");

	}
	void m1(Object o){
		System.out.println("Im in ma object");

	}
	public static void main(String[] args) {
DemoOverload obj=new DemoOverload();
obj.m1(0);
	}

}
