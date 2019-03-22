package cn.tedu.Object;

import java.util.Arrays;

public class ObjectLianXiDemo3 {
	public static void main(String[] args) {
		Role role1 = new Soldier("lili",20);
		System.out.println("սʿ"+role1.getName()+"��ɵ��˺�Ϊ:"+role1.attack());
		
		Role role2 = new Magicer("lulu", 5);
		System.out.println("��ʦ"+role2.getName()+"��ɵ��˺�Ϊ:"+role2.attack());
		
		Team team = new Team();
		//��Ӷ�Աrole1
		team.addMember(role1);
		//��Ӷ�Աrole2
		team.addMember(role2);
		//�鿴��Ա����
		System.out.println(Arrays.toString(team.member));
		System.out.println("���г�Ա���˺���ֵΪ��"+team.attackSum());
	}
}
//ְҵ
class Role{
	//����
	private String name;
	//�޲ι���
	public Role(){
		
	}
	//
	public Role(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//�˺���ֵ
	public int attack(){
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}
//��ʦMagicer
class Magicer extends Role{
	//����ħ���ȼ���1~10��
	private int level;
	
	public Magicer(String name,int level){
		super(name) ;
		this.level = level;
	}
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	//ħ��ʦ�˺���ֵ
	public int attack(){
		return 5*level;
	}
	
}
//սʿSoldier
class Soldier extends Role{
	//�����˺�ֵ
	private int damage;
	
	public Soldier(String name,int damage){
		super(name);
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int attack(){
		return damage;
	}
}
//���
class Team{
	//��̬����
	static int i = 0;
	static Role[] member = new Role[6];
	//����Ա�������������
	public void addMember(Role role){
		member[i++] = role;
	}
	//�����˺��ܺ�
	public int attackSum(){
		int sum = 0;
		for(int j = 0;j<i;j++){
			sum += member[j].attack();
		}
		return sum;
	}
}