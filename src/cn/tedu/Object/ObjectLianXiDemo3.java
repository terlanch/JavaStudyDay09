package cn.tedu.Object;

import java.util.Arrays;

public class ObjectLianXiDemo3 {
	public static void main(String[] args) {
		Role role1 = new Soldier("lili",20);
		System.out.println("战士"+role1.getName()+"造成的伤害为:"+role1.attack());
		
		Role role2 = new Magicer("lulu", 5);
		System.out.println("法师"+role2.getName()+"造成的伤害为:"+role2.attack());
		
		Team team = new Team();
		//添加队员role1
		team.addMember(role1);
		//添加队员role2
		team.addMember(role2);
		//查看队员名单
		System.out.println(Arrays.toString(team.member));
		System.out.println("所有成员的伤害总值为："+team.attackSum());
	}
}
//职业
class Role{
	//属性
	private String name;
	//无参构造
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

	//伤害数值
	public int attack(){
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}
//法师Magicer
class Magicer extends Role{
	//属性魔法等级（1~10）
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
	
	//魔法师伤害数值
	public int attack(){
		return 5*level;
	}
	
}
//战士Soldier
class Soldier extends Role{
	//攻击伤害值
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
//组队
class Team{
	//静态变量
	static int i = 0;
	static Role[] member = new Role[6];
	//将队员对象加入数组中
	public void addMember(Role role){
		member[i++] = role;
	}
	//计算伤害总合
	public int attackSum(){
		int sum = 0;
		for(int j = 0;j<i;j++){
			sum += member[j].attack();
		}
		return sum;
	}
}