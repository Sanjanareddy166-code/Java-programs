import java.util.Arrays;
class Packageex3
{
 public static void main(String args[])
 {
  int x[]={10,40,20,37,2};
  int y[]={2,10,20,37,40};
  // sort elements of array
  
  System.out.println("before sorting");
  for(int ele:x)
     System.out.println(ele+" ");
  //System.out.println();
 
  Arrays.sort(x);
  //now x becomes 2,10,20,37,40
  System.out.println("after sorting");
  for(int ele:x)
     System.out.println(ele+" ");
  //System.out.println();
 
  System.out.println(Arrays.equals(x,y));
  }
}   