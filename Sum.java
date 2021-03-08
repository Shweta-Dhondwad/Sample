package Overloading;

public class Sum {
	public void add(int a){
		System.out.println(a);

	}
	
public void add(int a, float b){
		System.out.println(a+b);
	}
	public void add( float b, int a){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum s=new Sum();
s.add(10, 5.5f);
s.add(10.5f, 1);
s.add(10);
//s.add(10, 10);
//s.add(10.5f, 10.5f);
		System.out.println("End of program");
		
		
	}

}
