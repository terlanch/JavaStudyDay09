package cn.tedu.Object;

public class ObjectLianXiDemo {
	public static void main(String[] args) {
		ClassD cd1 = new ClassD();
		ClassD cd2 = new ClassD(10);
	}
}
class ClassA{
	public ClassA() {
		System.out.println("A");
		// TODO Auto-generated constructor stub
	}
}
class ClassB{
	public ClassB() {
		System.out.println("B");
		// TODO Auto-generated constructor stub
	}
}
class ClassC extends ClassA{
	public ClassC() {
		System.out.println("C");
		// TODO Auto-generated constructor stub
	}
}
class ClassD extends ClassB{
	private ClassA ca = new ClassA();
	private ClassC cc;
	public ClassD() {
		System.out.println("D");
		// TODO Auto-generated constructor stub
	}
	public ClassD(int i){
		cc = new ClassC();
		System.out.println("ClassD(int)");
	}
}
