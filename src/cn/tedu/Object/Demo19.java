package cn.tedu.Object;

public class Demo19 {
	public static void main(String[] args) {
		Ios8 ios8 = new Ios8();
		ios8.say();
		System.out.println(ios8);
		System.out.println(ios8.toString());
		
		Ios7 ios7 = new Ios7();
		ios7.say();
		System.out.println(ios7);
	}

}
class Ios7{
	public void call(){
		System.out.println("Ios7��绰");
	}
	public void say(){
		System.out.println("Ios7˵Ӣ��");
	}
}
class Ios8 extends Ios7{
	public void say(){
		super.say();
		System.out.println("��˵����");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "˵����";
	}
}
