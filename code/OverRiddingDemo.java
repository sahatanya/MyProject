package com.java.pacakage.SimpleClassDemo;
class Test6{
	void Method()
	{
		System.out.println("Parent");
	}
	static void method1()
	{
		System.out.println(" Static Parent");
	}
	
}

class Test7 extends Test6{
	void Method()
	{  
		System.out.println("Child");
	}
static void method1()
{
	System.out.println(" Static Child");
}
void method2()
{
	
}
}
public class OverRiddingDemo {

	public static void main(String[] args) {
Test7 obj=new Test7();
obj.Method();
//1.Method of instantiation class gets invoked
Test6 obj1=new Test7();
obj1.Method();
//2.Static method replicates parent class(reference variable copies parent class
obj1.method1();
//3.This method must be there in test6
obj1.method2();
	}

}
