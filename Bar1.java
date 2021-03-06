package Overloading;


class Foo{
	Foo()
	{
		m1();
	}
	public void m1()
	{
		System.out.println("Foo");
	}
}
public class Bar1 extends Foo{
	int x=55;
	public void m1(){
		System.out.println("x=" +x);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foo f=new Bar1();
		f.m1();

	}

}
