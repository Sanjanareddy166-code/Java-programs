import java.util.*;
import mypack.testpack.Compare;
class Customer
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Compare c=new Compare();
int m,n,o;
m=sc.nextInt();
n=sc.nextInt();
o=sc.nextInt();
System.out.println("maximum ="+c.greatervalue(m,n,o));
System.out.println("minimum ="+c.lesservalue(m,n,o));
  }
}