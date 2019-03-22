package cn.tedu.Object;
/*
 * 矩形  求周长 面积
 */

public class Demo08 {
	public static void main(String[] args) {
		Trangle trangle = new Trangle(4,5);
		System.out.println(trangle.getLength());
		System.out.println(trangle.getArea());
		
	}
}
//矩形类
class Trangle{
	
	private int side;
	private int wide;
	private int length;
	private int area;
	
	public Trangle(int side,int wide){
		this.side = side;
		this.wide = wide;
	}
	
	public Trangle(){
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public int getLength() {
		return (side + wide)*2;
	}

	

	public int getArea() {
		return side * wide;
	}

	
	
		
	
}
