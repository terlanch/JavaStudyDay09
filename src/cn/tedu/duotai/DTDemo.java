package cn.tedu.duotai;
/*
 * ��̬
 * 		�ڴ�����������п�������չ�ֶ�����ʽ
 * 		
 * 		�����ʱ�ڣ��Ƕȣ�---��̬ʱ��
 * 			����ʱ��̬  �����ڱ���ʱ�ڽ��д����
 * 			public void m����{}
 * 			public void m��int n��{}
 * 			
 * 			����ʱ��̬  ����������ʱ�ڽ��д���İ�
 * 				��д����������---ǰ���Ǽ̳�
 * 		
 * 		��������
 * 			����---Ŀ¼   ����---����
 * 		
 * 		�ŵ㣺����ͳһ�������ܵ��õ�ͳһ����������ھۡ�����ϣ�
 */

public class DTDemo {
	public static void main(String[] args) {
		//���߱���Ҫ�����������è
		/*Pet pet;
		pet = new Cat();*/
		//������--����  ��ʵ�ʴ�����---����  ��������
		Pet pet = new Cat();
		Pet pet1 = new Dog();
		//���÷���
		//�������ʹ����Ķ�����÷���ִ�����������ִ��
		//pet.eat();
		//�������ʹ����Ķ�����Ե�����Щ����������
		//pet.sleep();
		//pet.fun();//���ò���
		
		//n(new Cat());
		//n(new Dog());
		n(pet);
		n(pet1);
	}
	//������ͳһ
	public static void n(Pet pet){//ֻ�еȵ�����ʱ�ڲ�����ȷ�������͵Ķ�����˭ʵ�ʴ���
		pet.eat();
	}
	
}

//������
class Pet{
	
	//����
	public void eat(){
		System.out.println("�ڳԶ���");
	}
	public void sleep(){
		System.out.println("��˯��");
	}
}

class Cat extends Pet{
	
	//��д����
	public void eat(){
		System.out.println("һ��һ��ĳԡ�����");
	}
	
	public void fun(){
		System.out.println("����צ�ӡ���");
	}
	
}

class Dog extends Pet{
	
	//��д
	public void eat(){
		System.out.println("��ڴ�ڵĳԡ�����");
	}
	public void bark(){
		System.out.println("���������Ľ�");
	}
	
}
