//for abstractclasses and interface we cannot create instance (object)

import java.util.*;
interface Internalmarks
{
 void getinternalmarks();
 void showinternalmarks();
}

interface Externalmarks
{
 void getexternalmarks();
 void showexternalmarks();
}

interface Marks extends Internalmarks,Externalmarks
{
 void showtotalmarks();
}

class finalmarks implements Marks
{
 int s1_i,s2_i,s3_i,s1_e,s2_e,s3_e,total_i,total_e;
 Scanner sc=new Scanner(System.in);

 public void getinternalmarks()
 {
  System.out.println("enter 3 subject internal marks");
  s1_i=sc.nextInt();
  s2_i=sc.nextInt();
  s3_i=sc.nextInt();
 }

 public void showinternalmarks()
 {
 System.out.println("internal marks are");
 System.out.println("sub 1:"+s1_i+"sub 2:"+s2_i+"sub 3:"+s3_i);
 }

 public void getexternalmarks()
 {
 System.out.println("enter 3 subject external marks");
 s1_e=sc.nextInt();
 s2_e=sc.nextInt();
 s3_e=sc.nextInt();
 }

 public void showexternalmarks()
 {
 System.out.println("external marks are");
 System.out.println("sub 1:"+s1_e+"sub 2:"+s2_e+"sub 3:"+s3_e);
 }

 public void showtotalmarks()
 {
 System.out.println("total marks are");
 System.out.println("subject\t internalmarks \t externalmarks\t totalmarks");
 System.out.println("sub1 \t\t"+s1_i+"\t\t"+s1_e+"\t\t"+(s1_i+s1_e));
 System.out.println("sub2 \t\t"+s2_i+"\t\t"+s2_e+"\t\t"+(s2_i+s2_e));
 System.out.println("sub3 \t\t"+s3_i+"\t\t"+s3_e+"\t\t"+(s3_i+s3_e));
 }
}

class Main
{
 public static void main(String args[])
{
 finalmarks f=new finalmarks();
 f.getinternalmarks();
 f.showinternalmarks();
 f.getexternalmarks();
 f.showexternalmarks();
 f.showtotalmarks();
 
 /*Internalmarks i=new Internalmarks();
 i.getinternalmarks();
 i.showinternalmarks(); only these two can be accessed

  Externalmarks e=new Externalmarks();
  e.getexternalmarks();
  e.showinternalmarks(); 
 error:Externalmarks is abstract; cannot be instantiated

  Externalmarks e;
  e.getexternalmarks();
  e.showinternalmarks(); 
  
 
  Marks m=new Marks();
  m.getinternalmarks();
  m.showinternalmarks();
  m.getexternalmarks();
  m.showexternalmarks();
  m.showtotalmarks(); shows error Marks is abstract; cannot be instantiated*/

 }
}

 


 

