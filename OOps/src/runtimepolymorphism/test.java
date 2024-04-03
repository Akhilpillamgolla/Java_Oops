package runtimepolymorphism;

public class test {
	public static void main(String[] args) {
//		Bus a=new Bus();
//		Car b=new Car();
//		System.out.println(a.fuel());		//IN ABOVE CLASS WE USED "RETURN" SO WE NEED TO USE "SYSTEM.OUT.PRINTLN" TO PRINT VALUES
//		System.out.println(b.fuel());

		
		Vechile var = new Bus();  // comment above for the method overriding
		System.out.println(var.fuel());   //first it will go to parent class and check weather method is present or not
		                                   // if method is not present it will throw error else 
		//if method is present then it will check weather child class has  override that particular method or not
		//if child class override that particular method then the compiler will invoke child class method. or it will invoke parent class method
		

		Vechile var1 = new Car();
		System.out.println(var1.fuel());  
		
		
		
		
		
	}
}
