/*class Test
{
int x=19;
public void show()
{
System.out.println("abc");
}
}
class Exception7
{
public static void main(String args[])
{
 Test t=new Test();
 t.show();

}
}*/

//NULLPOINTER:


/*class Test
{
int x=19;
public void show()
{
System.out.println("abc");
}
}
class Exception7
{
public static void main(String args[])
{
 Test t=null;
// without allocating memory to object we are trying to access so use try catch
 t.show();

}
}*/


class Test
{
int x=19;
public void show()
{
System.out.println("abc");
}
}
class Exception7
{
public static void main(String args[])
{
 Test t=null;

  try
  {
    t.show();
  }

  catch(NullPointerException ne)
  {
    //System.out.println("before accessing properties we should allocate memory");

 //output:before accessing properties we should allocate memory

    System.out.println(ne);

  //output:java.lang.NullPointerException
  }

  finally
  {
   System.out.println("task completed");
  }
}
}