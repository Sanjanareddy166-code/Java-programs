import java.io.*;
class  Buffer
{
  String data;
  boolean avail=false;

  public synchronized void put(String data)
  {
   while(avail==true)
   {
     try
     {
        wait();
        
      }
       catch(InterruptedException e)
       {
         Sstem.out.println(e);
       }
       this.data=data;
       System.out.println("produced "+data);
       avail=true;
       notify();
     }
  }

  public synchronized String get()
  {
   while(avail==false)
   {
     try
     {
        wait();
        
      }
       catch(InterruptedException e)
       {
         Sstem.out.println(e);
       }
       avail=false;
       notify();
       return data;
     }
  }
 
 