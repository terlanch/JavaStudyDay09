package cn.tedu.extendsx;
/*
 * Super
 * 		�ؼ���---�Ǹ���Ķ���
 * 		���ڵ��ø�������Ժͷ��� �������еĹ��췽����ҪĬ�ϵ��ø����
 * 		�޲ι��죨ͨ��super����������������ṩ������ʽ�Ĺ��췽����
 * 		�����Ҫʹ����Ӧ��ʽ��super������Ҫ�����У�����������������
 * 		�����   ���๹������-->���๹�췽��-->���๹������-->��
 * 		�๹�췽��  
 */

public class ExtendsDemo1 {
	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.eat();
	}

}

//������
class Animal{
	
	public Animal(){
		
	}
	public Animal(int age) {
		// TODO Auto-generated constructor stub
	}
	//����
	public void eat(){
		System.out.println("�ڳԶ���������");
	}
	
	public void sleep(){
		System.out.println("��˯��������");
	}
	
}

class Pig extends Animal{
	//���������������������
	
	//�����е����еĹ��췽����Ҫȥ���ø�����޲ι���
	public Pig(){
		//super()---super���  �������е��ø���Ĺ��췽��
		//�������еĹ��췽��������super������
		/*super(1);
		super();*/
		//�����췽��������������ʽ��super�����в�  ��û����super�����޲�
	}
	
	public Pig(int age){
		//this();  //���ñ����Pig����
		super(age);//���ø����Animal��int age��
	}
	
	//��д
	public void eat(){
		System.out.println("�ں������ĳ�");
		System.out.println("�����ĳԱ��ˡ�����");
		System.out.println("�Ա�����˯��");
		//���෽��
		//�Ǿ�̬�ķ�������ͨ���������
		//�������
		//super---������Ķ���
		super.sleep();
	}
}
