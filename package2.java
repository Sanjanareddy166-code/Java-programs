import java.util.Stack;
class Packageex2
{
 public static void main(String args[])
 {
  Stack s1=new Stack();
  s1.push(10);
  s1.push(20);
  s1.push(30);
  System.out.println(s1);
  System.out.println(s1.pop()); //top of stack 30 will be deleted
 System.out.println(s1);
}
}