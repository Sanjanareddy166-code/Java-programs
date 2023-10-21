import java.util.*;
class Roots
{
 Scanner sc=new Scanner(System.in);
int a,b,c,d;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=(b*b)-(4*a*c);
if(d==0)
{
 System.out.println("roots are equal");
}
 else if(d>0)
{
 System.out.println("roots are unequal");
}
else
{
 System.out.println("imaginary");
}
}