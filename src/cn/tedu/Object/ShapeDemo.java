package cn.tedu.Object;
/*
 * 图形类（shape），长和宽（属性），求面积，求周长（方法）
 * 矩形类--（含参构造--赋值） 周长和面积---正方形（含参构造）
 * 圆形（含参构造---赋值）
 * 
 * 
 */

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shape1 = new Circle("圆形",2);
		Shape shape2 = new Rect("矩形",2,3);
		Shape shape3 = new Square("正方形",2,2);
		/*//求圆
		getArea(shape1);
		getGirth(shape1);
		//求矩形
		getArea(shape2);
		getGirth(shape2);
		//求正方形
		getArea(shape3);
		getGirth(shape3);	*/
		Team1 team = new Team1();
		//把这三个图形加入数组中
		team.addMember(shape1);
		team.addMember(shape2);
		team.addMember(shape3);
		//求这个数组中对象的面积和周长
		team.getShape();
	}
	/*public static void getArea(Shape shape){
		System.out.println(shape.getName()+"的面积是"+shape.area());
	}
	public static void getGirth(Shape shape){
		System.out.println(shape.getName()+"的周长是"+shape.girth());
	}*/
		
	
	
}
//图形类
//如果类中出现了抽象方法那么这个类就要变成抽象类
abstract class Shape{
	//属性
	//图形的名字
	private String name;
	//半径
	private double radius;
	//长
	private double length;
	//宽
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
	
	//方法
	//求图形的面积
	//抽象方法--abstract修饰的方法
	public abstract double area();
		
	
	
	//求图形的周长
	public abstract double girth();
		
		
	
}
//圆形
//一个普通类继承抽象类，就要把抽象类中所有的抽象方法进行重写
class Circle extends Shape{
	
	public Circle(){
	
	}
	//构造有参方法
	public Circle(String name,double radius){
		//赋值
		this.setName(name);
		this.setRadius(radius);
	}
	//求圆的面积
	public double area(){
		return (3.14*getRadius()*getRadius()) ;
	}
	//求圆的周长
	public double girth(){
		return (2*3.14*getRadius());
	}
		
}
//矩形
class Rect extends Shape{
	
	//无参构造函数
	public Rect(){
		
	}
	//有参构造函数赋值
	public Rect(String name,double length,double wide){
		this.setName(name);
		this.setLength(length);
		this.setWide(wide);
	}
	//求矩形的面积
	public double area(){
		return (getLength()*getWide());
	}
	//求矩形的周长
	public double girth(){
		return ((getLength()+getWide())*2);
	}		

}
//正方形
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
//添加一个数组存放对象
class Team1{
	static int i = 0;
	static Shape[] member = new Shape[3];
	// 将图形加入数组中
	public void addMember(Shape shape){
		member[i++] = shape;
	}
	public void getShape(){
		for(int j = 0;j<i;j++){
			 System.out.println(member[j].getName()+"的面积是"+member[j].area()+"，周长是"+member[j].girth());
		}
	}
}
