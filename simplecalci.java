import java.util.*;
class Simplecalci
{
  public static int add(int p,int q)
  {
   return p+q;
  }
   public static int sub(int p,int q)
  {
   return p-q;
  }
   public static int mul(int p,int q)
  {
   return p*q;
  }
   public static int div(int p,int q)
  {
   return p/q;
  }
   public static int mod(int p,int q)
  {
   return p%q;
  }
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int x,y,ch,res;
   while(true)
   {
     System.out.println("1.addition\n2.subtraction\n3.multiplication\n4.division\n5.modulus\n6.exit");
     System.out.println("enteryour choice");
     ch=sc.nextInt();
     switch(ch)
     {
       case 1:
           x=sc.nextInt();
           y=sc.nextInt();
           res=add(x,y);
           System.out.println("sum="+res);
           break;
       case 2:
           x=sc.nextInt();
           y=sc.nextInt();
           res=sub(x,y);
           System.out.println("sub="+res);
           break;
      case 3:
           x=sc.nextInt();
           y=sc.nextInt();
           res=mul(x,y);
           System.out.println("mul="+res);
           break;
       case 4:
           x=sc.nextInt();
           y=sc.nextInt();
           res=div(x,y);
           System.out.println("div="+res);
           break;
       case 5:
           x=sc.nextInt();
           y=sc.nextInt();
           res=mod(x,y);
           System.out.println("mod="+res);
           break;
       case 6:
            System.exit(0);
            
      default:
         System.out.println("invalid");
        
      }
    }
   
 }
}