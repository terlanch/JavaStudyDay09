package cn.tedu.Object;

public class Demo16 {
	public static void main(String[] args) {
		Cat1 cat = new Cat1();
		Dog1 dog = new Dog1();
		dog.sayHi();
		
	}

}
class Animal1{
	String name;
	int age;
	String color;
	public void sayHi(){
		System.out.println("姓名："+name+"年龄："+age+"颜色:"+color);
	}
}
class Cat1 extends Animal1{
	public void catchMouse(){
		System.out.println("猫会抓老鼠");
	}
}
class Dog1 extends Animal1{
	public void lookDoor(){
		System.out.println("狗会看门");
	}
}
