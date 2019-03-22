package cn.tedu.extendsx;
/*
 * Super
 * 		关键字---是父类的对象
 * 		用于调用父类的属性和方法 子类所有的构造方法都要默认调用父类的
 * 		无参构造（通过super（）），如果弗雷提供其他形式的构造方法，
 * 		子类就要使用相应形式的super（），要在首行，父类对象优先子类对
 * 		象存在   父类构造代码块-->父类构造方法-->子类构造代码块-->子
 * 		类构造方法  
 */

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.eat();
	}

}

//动物类
class Animal{
	
	public Animal(){
		
	}
	public Animal(int age) {
		// TODO Auto-generated constructor stub
	}
	//方法
	public void eat(){
		System.out.println("在吃东西。。。");
	}
	
	public void sleep(){
		System.out.println("在睡觉。。。");
	}
	
}

class Pig extends Animal{
	//父类对象优先子类对象存在
	
	//子类中的所有的构造方法都要去调用父类的无参构造
	public Pig(){
		//super()---super语句  在子类中调用父类的构造方法
		//子类所有的构造方法都含有super（）；
		/*super(1);
		super();*/
		//本构造方法中有了其他形式的super（）有参  就没有了super（）无参
	}
	
	public Pig(int age){
		//this();  //调用本类的Pig（）
		super(age);//调用父类的Animal（int age）
	}
	
	//重写
	public void eat(){
		System.out.println("在呼呼呼的吃");
		System.out.println("慢慢的吃饱了。。。");
		System.out.println("吃饱了想睡觉");
		//父类方法
		//非静态的方法可以通过对象调用
		//父类对象
		//super---代表父类的对象
		super.sleep();
	}
}
