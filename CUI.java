import java.util.Scanner;
public class CUI {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int count=3;
	for(int i=1;i<=count;i++) {
		System.out.println("Enter UserName:");
		String userName=in.next();
		System.out.println("Enter Password");
		String password=in.next();
		System.out.println("Welcome! "+userName);
	}
	System.out.println("Contact Admin");
}
}
