package encapsulation;

public class Student {
   private	int id;         //private - we can access within the class
	private String name;
	private boolean attended;
		
	public Student(int id) {
		this.id = id;     // to call class level variable we use this keyword
	}

	public void setattendance(boolean flag) {
		if (!attended)
		attended = flag;
       System.out.println("Assigned attendance");
	}
	
	public boolean getattendance() {
	System.out.println("Teacher accessed attendance");
		return attended;	
	}
}
 

