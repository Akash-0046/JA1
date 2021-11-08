import java.util.Scanner;

public class Subjects {
	int a,b,c;

	public Subjects(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void total() {
		int total=this.a+this.b+this.c;
		System.out.println("Total marks scored: "+total);
	}

	void average()
	{
		double average=(this.a+this.b+this.c)/3;
		System.out.println("Average marks scored: "+average);
	}

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);

		Subjects s1 = new Subjects(45,48,49);
		Subjects s2 = new Subjects(30,35,40);
		Subjects s3 = new Subjects(30,35,40);

		s1.total();
		s1.average();
		System.out.println("*****************************");
		s2.total();
		s2.average();
		System.out.println("*****************************");
		s3.total();
		s3.average();

	}

}
