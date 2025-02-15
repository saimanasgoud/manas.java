/*class arrays2d{
	public static void main(String rgs[]){
	
	//Selection sort...

	int a[] = new int[]{23, 4, 78, 4, 9, 0, 54, 12, 90, 55, 24};
		System.out.println("\nOriginal array:");
		for(int t : a)
			System.out.print(t + "\t");

	arrays2d arrays = new arrays2d();
	int[] sort = arrays.selectionSort(a);

		System.out.print("\nAfter selection sort in ACCENDING order > ");

		for(int t : sort)
			System.out.print(t + "\t");
}


int[] selectionSort(int a[]){
	
	for(int x = 0; x <= a.length - 2; x++){
		int mini = 1;
		for(int y = mini + 1; y < a.length - 1; y++){
			if(a[mini] > a[y]){
				mini = y;
			}
		}
		int temp = a[x];	
		a[x] = a[mini];
		a[mini] = temp;
		}	
	return a;
	}
}*/

//2d array to print original values...

/*class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length  ; c++){
			System.out.print(a[r][c] + " ");
		}
		System.out.println();
		}
	}
}*/


class arrays2d{
	public static void main(String rgs[]){
	int [][]a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	for(int r = 0; r < a.length; r++){
		for(int c = 0; c < a[r].length; c++){
			if(r == c || c == a[r].length - 1 || c == 0){
				System.out.print(a[r][c] + " ");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
		}
	}
}