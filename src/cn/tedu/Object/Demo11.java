package cn.tedu.Object;

public class Demo11 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("lili",23);
		Student1 student = new Student1("lulu",25,23121);
		System.out.println(teacher);
		System.out.println(student);
	}

}
class Mann{
	private String name;
	private int age;
	
	public Mann(){
		
	}
	
	public Mann(String name,int age){
		this.age = age;
		this.name = name;
	}
	
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("人类需要吃饭");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:"+name+"年龄"+age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
class Teacher extends Mann{
	
	public Teacher(){
		
	}
	public Teacher(String name, int age){
		super(name,age);
	}
	
	public void teach(){
		System.out.println(super.getName() + "会讲课");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
class Student1 extends Mann{
	private int number;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}
	public Student1(String name,int age,int number){
		super(name,age);
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void study(){
		System.out.println(this.getName()+"在上课");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "学号" + number;
	}
}