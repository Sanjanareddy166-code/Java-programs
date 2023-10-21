//program to display season by taking month as input 3,4,5->summer 6,7,8,9->rainy 10,11,12,1,2->rainy


import java.util.*;
class Season
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
  int month;
  month=sc.nextInt();
  switch(month)
 {
  case 3:
  case 4:
  case 5:
      System.out.println("summer");
      break;
  case 6:
  case 7:
  case 8:
  case 9:
      System.out.println("rainy");
      break;
  case 10:
  case 11:
  case 12:
  case 1:
  case 2:
      System.out.println("winter");
      break;
 default:
      System.out.println("enter valid month");
 }
sc.close();
}
}