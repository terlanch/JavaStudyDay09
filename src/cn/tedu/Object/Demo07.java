package cn.tedu.Object;

public class Demo07 {
	public static void main(String[] args) {
		Car1 car = new Car1();
		car.name = "falali";
		car.money = 1000000;
		car.sayHi();
		car.fun();
		
		Car1 car2 = new Car1("����",500000);
		car2.sayHi();
				
	}

}
class Car1{
	
	String name;
	int money;
	
	public Car1(){
		System.out.println("�����޲ι��췽��");
	}
	
	public Car1(String name,int money){
		this.name = name;
		this.money = money;
		System.out.println("�����вι��췽��");
	}
	
	public void sayHi(){
		System.out.println(name + money + "Ԫ");
		
	}
	
	public void fun(){
		System.out.println("��һ�������");
	}
	
}
