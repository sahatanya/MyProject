package com.java.pacakage.SimpleClassDemo;
class Test4{
	void method1(int a)
	{System.out.println("parent");
}
}
//1.Method OverLoading happens only in case of inheritance
class Test5 extends Test4{
	
	//1.Return type cannot be overloaded
	int method1(int a)
	{System.out.println("parent");
	return 1;
}
}
public class OverLoadingDemo {

	public static void main(String[] args) {

		
	}

}
