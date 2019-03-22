package cn.tedu.extendsx;
/*
 * 
 * 		父类中被private修饰的内容、构造方法、构造代码块
 * 		对于子类而言都是拿不到的
 */

public class ExtendsDemo {
	

}

//
class A{
	//私有化的方法 对子类不可见
	private void m(){}
		
}

class B extends A{
	//新方法 
	int m(){return 1;}
}