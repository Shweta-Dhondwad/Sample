package Overloading;

import java.util.Arrays;

class Animal {
	   protected void displayInfo() {
	      System.out.println("I am an animal.");
	   }
	}
	class Dog extends Animal {
	   public void displayInfo() {
	      System.out.println("I am a dog.");
	      super.displayInfo();
		  
	   }
	}

	class Main {
		 void m1(){
			System.out.println("hellooooooooooo");
		}
	   public static void main(String[] args) {
Main d1 = new Main();
	    //d1.displayInfo();
	    d1=null;
	    d1.m1();
	    
	   // Dog d2 = (Dog)d1;
       // d2.displayInfo();
		 //  main(s);
	  //  String[] s={"ANBC","DKFJ"};
	//	   main(s);
//System.out.println("helloooooo");
		   
		  }
	}
