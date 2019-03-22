package cn.tedu.Object;



public class ObjectLianXiDemo1 {
	public static void main(String[] args) {
		Animal[] as = new Animal[]{
			new Dog("Pluto"),
			new Cat("Tom"),
			new Dog("Snoopy"),
			new Cat("Garfield"),	
		};
		Dog[] dogs = getAllDog(as);
		for(int i = 0;i<= dogs.length;i++){
			System.out.println(dogs[i].getName());
		}
		
	}

	private static Dog[] getAllDog(Animal[] as) {
		int j = 0;
		for(int i = 0 ;i<as.length;i++){
			if(as instanceof Dog[]){
				Dog[] dogs =(Dog[])as;
				
			}
		
		
		}
		return null;
	}
}
class Animal{
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Dog extends Animal{
	public Dog(String name){
		super.setName(name);
	}
	
	public String getName(String name) {
		return getName(name);
	}

	public void setName(String name) {
		super.setName(name);
	}
}
class Cat extends Animal{
	public Cat(String name){
		super.setName(name);
	}
	
	public String getName(String name) {
		return getName(name);
	}

	public void setName(String name) {
		super.setName(name);
	}
}

