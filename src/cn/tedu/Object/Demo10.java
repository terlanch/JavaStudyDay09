package cn.tedu.Object;
/*
 * 非静态方法  可以访问  静态变量 和  非静态变量
 * 静态方法 可以访问 静态变量  不可以访问非静态变量
 */

public class Demo10 {
	
}
class Man{
	static int num1 = 12;
	int num2 = 15;
	
	public void fun1(){
		System.out.println(num1);//正确
		System.out.println(num2);//正确
	}
	
	public static void fun2(){
		System.out.println(num1);//正确
		//System.out.println(num2);//错误
		
	}
}
