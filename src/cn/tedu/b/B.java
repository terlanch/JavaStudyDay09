package cn.tedu.b;

import cn.tedu.a.A;

public class B extends A{
	public static void main(String[] args) {
		//������÷���---����
		//new A().m();
		B b = new B();
		b.m();
	}

}

class C extends A{
	public static void main(String[] args) {
		B b = new B();
		//��protected���εķ������������Ҫ��������ʹ��
		//b.m();
	}
}