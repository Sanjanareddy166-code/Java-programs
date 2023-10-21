import java.util.Scanner;
import aec.cse.Stringpractice;
class Stringpackage
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stringpractice obj=new Stringpractice();
		String input;
		input=sc.nextLine();
		System.out.println("reverse of given input "+obj.reverse(input));
		System.out.println("given string is palindrome or not"+obj.ispalindrome(input));
		//System.out.println(obj.vowel(s));

	}
}