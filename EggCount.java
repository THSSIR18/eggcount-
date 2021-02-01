import java.util.Scanner;
public class EggCount
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an Integer: ");
		int aNum= sc.nextInt();
		
		int gross = (int)(aNum/144);
		int grossleft = aNum - (gross * 144);
		int dozen = grossleft/12;
		int dozenleft = grossleft-(dozen * 12);
		System.out.println("You have " + gross + " gross, " + dozen + " dozen, and " + dozenleft + " left over");
	}
}