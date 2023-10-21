import java.util.*;
class Temperature
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int temp;
  System.out.println("enter temperature");
  temp=sc.nextInt();
  
  switch(temp)
  {
   case temp<0:
        System.out.println("freezing weather");
        break;
   case (temp>=0&&temp<10):
        System.out.println("very cold weather");
        break;
   case (temp>=10&&temp<20):
        System.out.println("cold weather");
        break;
   case (temp>=20&&temp<30):
        System.out.println("normal weather");
        break;
   case (temp>=30&&temp<40):
        System.out.println("hot weather");
        break;
   case temp>=40:
        System.out.println("very hot");
        break;
   
   default:
        System.out.println("invalid");
        break;
   }
  }
}
 

/*import java.util.*;
class Temperature
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int temp;
  System.out.println("enter temperature");
  temp=sc.nextInt();
   if(temp<0)
        System.out.println("freezing weather");
        
   else if(temp>=0&&temp<10)
        System.out.println("very cold weather");
      
   else if (temp>=10&&temp<20)
        System.out.println("cold weather");
        
   else if(temp>=20&&temp<30)
        System.out.println("normal weather");
        
   else if(temp>=30&&temp<40)
        System.out.println("hot weather");
        
   else if(temp>=40)
        System.out.println("very hot");
        
   else
        System.out.println("invalid");
        
   }
 }*/


