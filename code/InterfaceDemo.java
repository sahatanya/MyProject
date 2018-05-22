package com.java.pacakage.SimpleClassDemo;

public interface InterfaceDemo {
	//Handles only declaration
void method();
//1. variables in interface are final, public and static.
final static public int a=10;
 
//4. From java 8, interface can have static and default method
static void method1() {
	
}
default void mathod2() {
	
}
}


  class Demo implements InterfaceDemo {

	public void method()
	{
	}
public static void main(String[] args)
{
	//2. Obj cannot be created in interface
	InterfaceDemo obj=new InterfaceDemo();
	//3. Reference variable can be created
	InterfaceDemo obj1=new Demo();
}
}

  
  