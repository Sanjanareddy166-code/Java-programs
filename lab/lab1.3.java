import java.util.*;
class Racer
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int r1,r2,r3,r4,r5;
 r1=sc.nextInt();
 r2=sc.nextInt();
 r3=sc.nextInt();
 r4=sc.nextInt();
 r5=sc.nextInt();
 float total=r1+r2+r3+r4+r5;
 float average=total/5;
 System.out.println("average is"+average);
 if(r1>average)
  System.out.println("r1 qualifies the race with speed  "+r1);
 if(r2>average)
  System.out.println("r2 qualifies the race with speed  "+r2);
 if(r3>average)
  System.out.println("r3 qualifies the race with speed  "+r3);
 if(r4>average)
  System.out.println("r4 qualifies the race with speed  "+r4);
 if(r5>average)
  System.out.println("r5 qualifies the race with speed  "+r5);

  sc.close();
 }
}