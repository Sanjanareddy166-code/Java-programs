import java.util.*;
class Calculator
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a,b;
 System.out.println("enter a value");
 a=sc.nextInt();
 System.out.println("enter b value");
 b=sc.nextInt();
 int option;
 System.out.println("enter the operation 1.add 2.subtract 3.multiplication 4.divison");
  option=sc.nextInt();
 switch(option)
 {
  case 1: 
      System.out.println("addition is"+(a+b));
      break;
  case 2: 
      System.out.println("subtraction is"+(a-b));
      break;
  case 3: 
      System.out.println("multiplication is"+(a*b));
      break;
  case 4: 
      System.out.println("division is"+(a/b));
      break;
  default:
    System.out.println("invalid");
    break;
 }
}
}


