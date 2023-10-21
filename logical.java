class Logical
{
 public static void main(String args[])
 {
   int x=4,y=5,z=8;
   System.out.println(x>y&&y>z);
   System.out.println(x>y||y>z);
   System.out.println(!(x>y&&y>z));
   System.out.println(true && false);
   // errorSystem.out.println(4&&5);
  }
}