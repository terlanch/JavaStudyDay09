package cn.tedu.Object;
/*
 * 测静态变量
 */
public class Demo09 {
	public static void main(String[] args) {
		Girl1 girl1 = new Girl1("tanpopo");
		Girl1 girl2 = new Girl1("xiaoai");
		
		girl1.country = "日本";
		girl2.country = "中国";
		
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
		System.out.println("姓名："+name+",国籍："+country);
	}
}
