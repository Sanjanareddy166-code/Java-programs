/*package acet.edu.in; //3 folders will be created
public class CSEpackage
{
public void printhodname()
{
System.out.println("dr.avanthi");
}
public int getstudentcount()
{
//System.out.println("720");
return 720;
}
public static void main(String args[])
{
CSEpackage p=new CSEpackage();
p.printhodname();
System.out.println(p.getstudentcount());
}
}*/


//for others to use
so there is no main method
package java.testpack;
class Compare
{
public int greatervalue(int x,int y,int z)
{
if(x>y)
{
 if(x>z)
    return x;
 else
   return z;
 }
else
{
 if(y>z)
    return y;
 else
    return z;
}
}
public int lesservalue(int x,int y,int z)
{
if(x<y)
{
if(x<z)
  return x;
else
   return z;
}
else
{
if(y<z)
   return y;
else
    return z;
}
}
}
