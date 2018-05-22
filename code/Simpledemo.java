package com.java.pacakage.SimpleClassDemo;
class Test

{
	void Method()
	{
	}
}

class Test1 

{  //Why cannot be ?
	Test obj=new Test();
	obj.Method();
	
	void method1() {
		//Fine when inside method, why ?
		Test obj=new Test();
		obj.Method();
	
}
	
}
public class Simpledemo {

	public static void main(String[] args) {

	}

}
