public class break{
	public static void main(String args[]){
		
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i);
        }
        System.out.println("Loop exited.");
    }
}
