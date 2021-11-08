
public class ImArmstrong {
	public static void main(String[] args) {

        int x = 153, originalNumber, remainder, result = 0;

        originalNumber = x;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            System.out.println(result);
            originalNumber /= 10;
        }

        if(result == x)
            System.out.println(x + " is an Armstrong number.");
        else
            System.out.println(x + " is not an Armstrong number.");
    }

}