//variable length arrays stores different number of elements in different rows it is not possible in c because in c  column size must be specified in c
/*class Variablelength 
{
public static void main(String args[])
{
  int x[][]=new int[3][];//column size is not specified
  x[0]=new int[4];//length is 4 for x[0]
  x[1]=new int[2];
  x[2]=new int[3];
  //array name x=>find length of array => x.length;(no.of rows)
   
for(int i=0;i<x.length;i++)
  System.out.println(x[i].length);

}
}*/


import java.util.*;
class Variablelength  
{
public static void main(String args[])
{
  int x[][]=new int[3][];//column size is not specified
  x[0]=new int[4];//length is 4 for x[0]
  x[1]=new int[2];
  x[2]=new int[3];

  //array name x=>find length of array => x.length;(no.of rows)

   Scanner sc=new Scanner(System.in);
for(int i=0;i<x.length;i++)
  System.out.println(x[i].length); 

 //reading of variable length array

   for(int i=0;i<x.length;i++)
     for(int j=0;j<x[i].length;j++)
       x[i][j]=sc.nextInt();

  //printing of variable length arrys
   
   for(int i=0;i<x.length;i++)
    {
     for(int j=0;j<x[i].length;j++)
        System.out.print(x[i][j]+" ");  // print =>elements stored in same row upto the array length

        System.out.println(); //println =>next row elements will be stored in next row
    }

  }
}

/*output:
4
2
3
12 23 44 55 66 77 88 46 78
12 23 44 55
66 77
88 46 78
*/
 
