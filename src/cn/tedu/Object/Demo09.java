package cn.tedu.Object;
/*
 * �⾲̬����
 */
public class Demo09 {
	public static void main(String[] args) {
		Girl1 girl1 = new Girl1("tanpopo");
		Girl1 girl2 = new Girl1("xiaoai");
		
		girl1.country = "�ձ�";
		girl2.country = "�й�";
		
		girl1.sayHi();
		girl2.sayHi();
	}
}
class Girl1{
	String name;
	static String country;
	public Girl1(){
		
	}
	public Girl1(String name){
		this.name = name;
	}
	public void sayHi(){
		System.out.println("������"+name+",������"+country);
	}
}
