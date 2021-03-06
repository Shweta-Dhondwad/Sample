package Overloading;

public class TypePro {
	
	public void m1(Double d){
		System.out.println("Double");
	}
	/*public void m1(Object o){
		System.out.println("Object");
	}*/
	public void m1(Number o){
		System.out.println("Number");
	}
	public void m1(Integer o){
		System.out.println("int");
	}
	public void m1(StringBuffer s){
		System.out.println("StringBuffer");
	}
	/*public void m1(Integer i){
		System.out.println("Integer");
	}*/
	public void m1(Boolean s){
		System.out.println("Boolean");
	}
	
	public void m1(int a,float b){
		System.out.println("int float");

	}
public void m1(float a,int b){
	System.out.println("Float float");
	}
	public static void main(String[] args) {
TypePro t=new TypePro();
t.m1(1005f,1);
t.m1(10.5f,10);
Integer s=null;
t.m1(s);
//t.m1(new Object());;
//t.m1("Deep");
//t.m1(10);
t.m1(10.5d);	
	t.m1('a');
t.m1(false);
	}

}
