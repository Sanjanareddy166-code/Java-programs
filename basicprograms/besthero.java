import java.util.*;
class Best
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int h1,a1,f1,h2,a2,f2,t1,t2;
  String hero1,hero2;
  System.out.println("enter hero1 name");
  hero1=sc.nextLine();
  System.out.println("enter first heromovies");
  h1=sc.nextInt();
  a1=sc.nextInt();
  f1=sc.nextInt();
  System.out.println("enter hero2 name");
  hero2=sc.nextLine();
  System.out.println("enter second hero movies");
  h2=sc.nextInt();
  a2=sc.nextInt();
  f2=sc.nextInt();
  t1=h1*10+a1*5+(f1*-5);
  t2=h2*10+a2*5+(f2*-5);
  System.out.println("total movies of hero1"+t1);
  System.out.println("total movies of hero2"+t2);
  if(t1>t2)
  {
   System.out.println("hero1 is best");
  }
  else
  {
   System.out.println("hero2 is best");

  }
}
}
  