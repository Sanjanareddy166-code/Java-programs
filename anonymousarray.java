class Sample
{
public static int sum(int arr[])
{
  int s=0;
  for(int i=0;i<arr.length;i++)
     s=s+arr[i];
   return s;
 }
 public static void main(String args[])
{
 int result=sum(new int[]{10,20,30});
   System.out.println(result);
 System.out.println(sum(new int[]{40,50,60}));
 }
}