import java.util.Scanner;
import aec.cse.Stringpractice;
public class User
{
   public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stringpractice obj=new Stringpractice();
		String input;
		input=sc.nextLine();
		System.out.println("reverse of given input "+obj.reverse(input));
		System.out.println("given string is palindrome or not"+obj.ispalindrome(input));
		
      sc.close();
	}
}