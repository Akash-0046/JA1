import java.util.Scanner;

public class ToFind {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		
		int[] array = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		System.out.println("Enter array element to find:");
		
		int toFind = in.nextInt();
		boolean found = false;
		

		for (int n : array) {
			if (n == toFind) {
				found = true;
				break;
			}
		}

		if(found)
			System.out.println(toFind + " is found.");
		else
			System.out.println(toFind + " is not found.");
	}
}

