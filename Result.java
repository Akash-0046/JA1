
public class Result {
	public static void main(String[] args) {
		int a=70, b=50, c=65;
		
		if((a<60 && b<60 && c<60)&&(a>=60||b>=60||c>=60)){
			System.out.println("Failed");
		}
		else if(a>=60 && b>=60 && c>=60) {
			System.out.println("Passed");
		}
		else if((a>=60 && b>=60) || (a>=60 && c>=60) || (b>=60 && c>=60)) {
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}
	}
}


