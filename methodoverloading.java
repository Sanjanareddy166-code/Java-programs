class Methodoverloading
{

public void swap(int x,int y)

{

  int temp=x;
  x=y;
  y=temp;
  System.out.println("after swap x="+x);
  System.out.println("after swap y="+y);
}

public void swap(float f1,float f2)

{
 float temp=f1;
 f1=f2;
 f2=temp;
 System.out.println("after swap f1="+f1);
 System.out.println("after swap f2="+f2);
 
}

public void swap(char c1,char c2)

{
 char temp=c1;
 c1=c2;
 c2=temp;
 System.out.println("after swap c1="+c1);
 System.out.println("after swap c2="+c2);
 
}

public void swap(double d1,double d2)

{

 double temp=d1;
 d1=d2;
 d2=temp;
  System.out.println("after swap d1="+d1);
 System.out.println("after swap d2="+d2);
}

public static void main(String args[])  //mainmethod
 {

 Methodoverloading m1=new Methodoverloading();
 m1.swap(10,20); //int
 m1.swap(12.3f,58.5f); //float 
 m1.swap('a','b'); //char 
 m1.swap(23.456,34.567); //double
 
 }
}