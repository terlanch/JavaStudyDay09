package cn.tedu.duotai;
/*
 * 多态
 * 		在代码操作过程中可以灵活地展现多种形式
 * 		
 * 		程序的时期（角度）---多态时期
 * 			编译时多态  就是在编译时期进行代码绑定
 * 			public void m（）{}
 * 			public void m（int n）{}
 * 			
 * 			运行时多态  就是在运行时期进行代码的绑定
 * 				重写，向上造型---前提是继承
 * 		
 * 		向上造型
 * 			父类---目录   子类---正文
 * 		
 * 		优点：参数统一化、功能调用的统一化、解耦（高内聚、低耦合）
 */

public class DTDemo {
	public static void main(String[] args) {
		//告诉别人要养宠物，宠物事猫
		/*Pet pet;
		pet = new Cat();*/
		//声明类--父类  ，实际创建类---子类  向上造型
		Pet pet = new Cat();
		Pet pet1 = new Dog();
		//调用方法
		//向上造型创建的对象调用方法执行由子类具体执行
		//pet.eat();
		//向上造型创建的对象可以调用哪些方法看父类
		//pet.sleep();
		//pet.fun();//调用不了
		
		//n(new Cat());
		//n(new Dog());
		n(pet);
		n(pet1);
	}
	//参数的统一
	public static void n(Pet pet){//只有等到运行时期才能明确向上造型的对象由谁实际创建
		pet.eat();
	}
	
}

//宠物类
class Pet{
	
	//方法
	public void eat(){
		System.out.println("在吃东西");
	}
	public void sleep(){
		System.out.println("在睡觉");
	}
}

class Cat extends Pet{
	
	//重写方法
	public void eat(){
		System.out.println("一点一点的吃、、、");
	}
	
	public void fun(){
		System.out.println("在舔爪子。。");
	}
	
}

class Dog extends Pet{
	
	//重写
	public void eat(){
		System.out.println("大口大口的吃、、、");
	}
	public void bark(){
		System.out.println("在汪汪汪的叫");
	}
	
}
