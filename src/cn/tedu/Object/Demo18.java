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
       System.out.println("�����޲����Ĺ��췽��");
   }
   public Phone(String name) {
       this.name = name;
       System.out.println("�����в����Ĺ��췽��");
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



