class Student
{
 public static void main(String args[])
{
  int total;
  float average;
  System.out.println(args[0]);
  System.out.println(args[1]);
  System.out.println(args[2]);
  System.out.println(args[3]);
  System.out.println(args[4]);
  total=(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2])+Integer.parseInt(args[3])+Integer.parseInt(args[4]));
  average=total/5;
  System.out.println("total is"+total);
  System.out.println("average is"+average);
 }
}
