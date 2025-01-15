class std{
	
	void product(){
	String name = "lenovo";
	String roll_no = "20X01A0515";
	char sec = 'E';
	long mob_no = 8185123903L;
	System.out.println(roll_no);
	}
	public static void main(String args[]){
		
		Marks marks = new Marks();
		std student = new std();

		marks.Display(); 
		student.product();
	}
}











class Marks{
	
	String name = "lenovo";
	String roll_no = "20X01A0515";
	char sec = 'E';
	long mob_no = 8185123903L;
	
	void Display(){
		System.out.println(" Name: " + name);
		System.out.println(" Roll no: " + roll_no);
		System.out.println(" Section: " + sec);
		System.out.println(" Mobile number: " + mob_no);
		}
	}