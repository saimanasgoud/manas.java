class Oops{
	public static void main (String args[]){
	
	Child c = new Child(1);





	
	
	}
}

class Grandparent{

	Grandparent(int x){
		System.out.println("grand parent of int");
	}

	Grandparent(int x, double y){
		System.out.println("grand parent of int, double");
	}
}

class Parent extends Grandparent{
	Parent(){
		super(10);
		System.out.println("parent of default");
	}
	Parent(int x){
		super(12);
		System.out.println("parent of int");
	}
}

class Child extends Parent{
	Child(){
       		super();
		System.out.println("child default");
	}
	Child(int x){
	        super(2);	
		System.out.println("child int");
	}
	Child(char c, int x){
	       	super(1);
		System.out.println("child default");
	}
}