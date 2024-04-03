 package inheritance;

public class User {

	public static void main(String[] args) {
	
		Guest guest = new Guest();     //calling parent class 
		guest.read();

		Developer dev = new Developer();
		dev.read();
		dev.Write();
		
		Admin admin = new Admin();
		admin.read();
		admin.Write();
		admin.manage();
		
	}
}
