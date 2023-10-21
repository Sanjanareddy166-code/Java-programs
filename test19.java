class Num
{
Num(double x)
{
 System.out.println(x);
}
}
public class Test extends Num
{
public static void main(String args[])
{
Num num=new Num(2);
}
}