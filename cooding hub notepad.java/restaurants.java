import java.util.Scanner;

public class restaurants{
	public static void main(String args[]){
	
	System.out.println("\n----WELCOME TO B-TECH WALA RESTAURANT----");
	
	int cdb_cost = 129, tanc_cost = 201, mutdb_cost = 239, chinoodi_cost = 99, butterchi_cost = 169, fishbiri_cost = 199;
	int fishfry_cost = 89, chi65_cost = 77, mutpay_cost = 112, grichi_cost = 99, haleem_cost = 73;
	int rabb_cost = 309, kjpitcurry_cost = 501, frirabbir_cost = 399, duck_cost = 549;

	int total = 0, choice = 0, quantity = 0;	

	Scanner sc = new Scanner(System.in);
	
	do{

	System.out.println("\n MENU___" + " \n\n 1. Chicken Dum Biriyani \n 2. Tandoori chicken \n 3. Mutton Dum biriyani \n 4. Chicken noodiles \n 5. Butter chicken \n 6. Fish biriyani.");
	
	System.out.println("\n STARTERS___" + " \n\n 7. Appolo Fish fry \n 8. Chicken 65 \n 9. Mutton paya \n 10. Grilled Chicken \n 11. Haleem. ");
	
	System.out.println("\n Special Recipes___" + " \n\n 12. Rabbit curry \n 13. Kamju pitta curry \n 14. Fried Rabbit biriyani \n 15. Duck curry.");
	System.out.print("\n----Choose an Item/Dish to Order----:");	

	choice = sc.nextInt();

	switch(choice){
		case 1: {
			System.out.println("\n__You selected Chicken Dum Biriyani__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * cdb_cost);
			break;
			}
		case 2: {
			System.out.println("__You selected Tandoori chicken__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * tanc_cost);
			break;
			}
		case 3: {
			System.out.println("__You selected Mutton Dum biriyani__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * mutdb_cost);
			break;
			}
		case 4: {
			System.out.println("__You selected Chicken noodiles__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * chinoodi_cost);
			break;
			}
		case 5: {
			System.out.println("__You selected Butter chicken__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * butterchi_cost);
			break;
			}
		case 6: {
			System.out.println("__You selected Fish biriyani__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * fishbiri_cost);
			break;
			}

		case 7: {
			System.out.println("__You selected Starter as Appolo Fish fry__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * fishfry_cost);
			break;
			}
		case 8: {
			System.out.println("__You selected Starter as Chicken 65__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * chi65_cost);
			break;
			}
		case 9: {
			System.out.println("__You selected Starter as Mutton paya__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * mutpay_cost);
			break;
			}
		case 10: {
			System.out.println("__You selected Starter as Grilled Chicken__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * grichi_cost);
			break;
			}
		case 11: {
			System.out.println("__You selected Starter as Haleem__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * haleem_cost);
			break;
			}
		case 12: {
			System.out.println("__You selected Special Recipe as Rabbit curry__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * rabb_cost);
			break;
			}	
		case 13: {
			System.out.println("__You selected Starter as Kamju pitta curry __ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * kjpitcurry_cost);
			break;
			}
		case 14: { 
			System.out.println("__You selected Starter as Fried Rabbit biriyani __ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * frirabbir_cost);
			break;
			}
		case 15: {
			System.out.println("__You selected Starter as Duck__ \n Please enter Quantity :");
			quantity = sc.nextInt();
			total = total + (quantity * duck_cost);
			break;
			}
		default:
			System.out.println("\n<**PLEASE ENTER/SELECT A NUMBER BETWEEN 1 TO 11**>");
		}
	
		System.out.println("\n\n Do you want to order any thing else_ \n Please select only [YES {y} / NO {n}] to continue :");
		
		char end = sc.next().charAt(0);
		
		if(end == 'n'){
			double gst = total * 0.05;
			double finalbill = total + gst;
			
			System.out.println("\n Your bill is: " + total);
			System.out.println("\n GST is 5%: " + gst);
			System.out.println("\n Your Finel Bill with GST is: " + finalbill);
			
			System.out.println("\n*** THANK YOU FOR VISTING, HAVE A GREAT DAY ***");

			break;
			}
		}
	while(true);
	}
}
