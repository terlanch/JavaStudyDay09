package cn.tedu.Object;

public class Demo18 {
	public static void main(String[] args) {
		Note note = new Note();
       note.sayHi();
	}   
}
   
class Phone{
   String name;

   public Phone() {
       System.out.println("我是无参数的构造方法");
   }
   public Phone(String name) {
       this.name = name;
       System.out.println("我是有参数的构造方法");
   }
   public void sayHi() {
       System.out.println(name);
   }
}

class Note extends Phone{
   public Note(){
       super("Note2");
   }
   public Note(String name) {
       super(name);
   }
}



