package Overloading;

public class TypePro1 {

	
	
		/*public void m1(String s){
			System.out.println("String");

		}*/
		public void m1(StringBuffer s){
			System.out.println("StringBuffer");

		}
		public void m1(Object o){
			System.out.println("Onject");

		}
		public void add(int a,float b){
			System.out.println("addition of integer="+(a+b));
		}
		public void add(double a,float b){
			System.out.println("addition of double="+(a+b));
		}
	
	public static void main(String[] args) {
		TypePro1 t1=new TypePro1();
		
		t1.add(10, 10);
		t1.add(10.5f,10.5f);
		t1.add(10, 10.5f);
		t1.add(105.f, 10);
		t1.m1(new Object());
		t1.m1("Deep");
		t1.m1(new StringBuffer());
		t1.m1(null);
		t1.m1("Deep deep");
		t1.m1(10);
		t1.m1(10.5f);

		t1.m1(10.5f);
		t1.m1(10.5);
		t1.m1('a');
		

	}

}
