package com.java.pacakage.SimpleClassDemo;
class Test2{
	void Method()
	{
		System.out.println("parent");
}
}

class Test3 extends Test2{
	void Method1()
	{
		System.out.println("Child");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		Test3 obj=new Test3();
		obj.Method1();
		Test2 obj1=new Test2();
		//1. Parent class object cannot be used to access child class.
		obj1.Method1();
		//2. Parent class reference variable can be used to hold base class object.
		Test2 obj2=new Test3();
        //3. Child class reference variable cannot be used to hold parent class object;
		Test3 obj3=new Test2();

		

	}

}



//