import java.util.*;
class Netsalary
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int BS,HRA,DA,TA,PF,PT,GS,NS;
    BS=sc.nextInt();
    HRA=sc.nextInt();
    DA=sc.nextInt();
    TA=sc.nextInt();
    PF=sc.nextInt();
    PT=sc.nextInt();
    GS=BS+HRA+DA+TA;
    NS=GS-(PF+PT);
    System.out.println(GS);
    System.out.println(NS);
    sc.close();
    }
}