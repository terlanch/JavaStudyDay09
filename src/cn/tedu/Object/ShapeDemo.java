package cn.tedu.Object;
/*
 * ͼ���ࣨshape�������Ϳ����ԣ�������������ܳ���������
 * ������--�����ι���--��ֵ�� �ܳ������---�����Σ����ι��죩
 * Բ�Σ����ι���---��ֵ��
 * 
 * 
 */

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape1 = new Circle("Բ��",2);
		Shape shape2 = new Rect("����",2,3);
		Shape shape3 = new Square("������",2,2);
		/*//��Բ
		getArea(shape1);
		getGirth(shape1);
		//�����
		getArea(shape2);
		getGirth(shape2);
		//��������
		getArea(shape3);
		getGirth(shape3);	*/
		Team1 team = new Team1();
		//��������ͼ�μ���������
		team.addMember(shape1);
		team.addMember(shape2);
		team.addMember(shape3);
		//����������ж����������ܳ�
		team.getShape();
	}
	/*public static void getArea(Shape shape){
		System.out.println(shape.getName()+"�������"+shape.area());
	}
	public static void getGirth(Shape shape){
		System.out.println(shape.getName()+"���ܳ���"+shape.girth());
	}*/
		
	
	
}
//ͼ����
//������г����˳��󷽷���ô������Ҫ��ɳ�����
abstract class Shape{
	//����
	//ͼ�ε�����
	private String name;
	//�뾶
	private double radius;
	//��
	private double length;
	//��
	private double wide;
	
	public Shape(){
		
	}
	public Shape(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWide() {
		return wide;
	}
	public void setWide(double wide) {
		this.wide = wide;
	}
	
	//����
	//��ͼ�ε����
	//���󷽷�--abstract���εķ���
	public abstract double area();
		
	
	
	//��ͼ�ε��ܳ�
	public abstract double girth();
		
		
	
}
//Բ��
//һ����ͨ��̳г����࣬��Ҫ�ѳ����������еĳ��󷽷�������д
class Circle extends Shape{
	
	public Circle(){
	
	}
	//�����вη���
	public Circle(String name,double radius){
		//��ֵ
		this.setName(name);
		this.setRadius(radius);
	}
	//��Բ�����
	public double area(){
		return (3.14*getRadius()*getRadius()) ;
	}
	//��Բ���ܳ�
	public double girth(){
		return (2*3.14*getRadius());
	}
		
}
//����
class Rect extends Shape{
	
	//�޲ι��캯��
	public Rect(){
		
	}
	//�вι��캯����ֵ
	public Rect(String name,double length,double wide){
		this.setName(name);
		this.setLength(length);
		this.setWide(wide);
	}
	//����ε����
	public double area(){
		return (getLength()*getWide());
	}
	//����ε��ܳ�
	public double girth(){
		return ((getLength()+getWide())*2);
	}		

}
//������
class Square extends Rect{
	
	//
	public Square(){
		
	}
	public Square(String name,double length,double wide){
		this.setName(name);
		this.setLength(length);
		this.setWide(wide);
	}
		
}
//���һ�������Ŷ���
class Team1{
	static int i = 0;
	static Shape[] member = new Shape[3];
	// ��ͼ�μ���������
	public void addMember(Shape shape){
		member[i++] = shape;
	}
	public void getShape(){
		for(int j = 0;j<i;j++){
			 System.out.println(member[j].getName()+"�������"+member[j].area()+"���ܳ���"+member[j].girth());
		}
	}
}
