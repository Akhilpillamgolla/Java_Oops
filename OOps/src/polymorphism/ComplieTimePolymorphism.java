package polymorphism;

public class ComplieTimePolymorphism {                               //method overloading

	void add(int x,int y) {
		System.out.println(x+y);
	}
	void add(float x,float y) {			//method with same name but varing in number of parameters (or) type of perameters
		System.out.println(x+y);
	}
	//void add(int y,int x) { this is is not allowed 
	//void add(int a,int b) { this is is not allowed 
	
	void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}

	public static void main(String[] args) {
	    ComplieTimePolymorphism obj=new ComplieTimePolymorphism();
		obj.add(10, 20);
		obj.add(23f,34f);       //if you give without f then it prints without .O (Decimal Value)
		obj.add(10, 20,30);
	}
}
