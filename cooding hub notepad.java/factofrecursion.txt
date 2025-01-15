public class patterns{
	public static void main(String args[]){
		int row = 5,c,r;   
		
		for(r = 1; r <= row ; r++){ 	
			
			for(c = r; c <= row; c++){  
				if( c == row || r == 1 || c == r)
					System.out.print(" # ");
					 				
				else
					System.out.print("  ");
				}
			
	
		System.out.println();
		}

		for(r = 2; r <= row ; r++){ 	
			
			for(c = 1; c <= row; c++){  
				if( c == 1 || c == r || r == row)
					System.out.print(" # ");
				
 				
				else
					System.out.print("  ");
				}
				
			
		System.out.println();
		}
	}
}

