package javaExample;

import java.util.Scanner;

public class Simple {
	  int i=9;
	  int j=5;
	  Simple(){
		  System.out.println("Constructor called");
	  }
	  void callFun() {
		 System.out.println("Function called"); 
	  }
	  int add(int a,int b)
	  {
		  int c=a+b;
		  return c;
	  }
	  public static void main(String[] args) {
		  int x,y;
		  Scanner sc=new Scanner(System.in);
		//  x=sc.nextInt();
		//  y=sc.nextInt();
		Simple s=new Simple();
		//System.out.println(s.j);
		//s.callFun();
		System.out.println(s.add(s.i,s.j));
		int z=s.add(s.i, s.j);
		System.out.println(z);
		//s.add(3, 5);
	}

}