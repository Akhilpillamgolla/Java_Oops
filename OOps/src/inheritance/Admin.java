package inheritance;

public class Admin extends Developer{     //multilevel inheritance

//	public  void read() {
//		System.out.println("Reading Code");
//	}
//	
//	public  void Write() {
//		System.out.println("Writing Code");         we can access this using child class 
//	}
//	
	public void manage() {             // Add delete product/
          super.read();                               //parent call
		System.out.println("Manage Code");
	}
	
	public void read() {
		System.out.println("Admin read code");        // local call
	}

}


