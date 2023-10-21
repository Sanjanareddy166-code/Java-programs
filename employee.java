import java.util.*;
class Employee
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int empid;
 String ename,desg,company;
 float salary;
 char gender;
 empid=sc.nextInt();
 sc.nextLine();
 ename=sc.nextLine();
 gender=sc.nextLine().charAt(0);//only to print the value at first index
 desg=sc.nextLine();
 salary=sc.nextFloat();
 sc.nextLine();
 company=sc.nextLine();
 System.out.println(empid);
 System.out.println(ename);
 System.out.println(gender);
 System.out.println(desg);
 System.out.println(salary);
 System.out.println(company);
 sc.close();
}
}
 