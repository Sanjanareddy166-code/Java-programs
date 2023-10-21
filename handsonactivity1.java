/*import java.util.*;
class project1
{
int empid;
int empno[]={1001,1002,1003,1004,1005,1006,1007};
String empname[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
*/

import java.util.*;
class Project1
{
 int empno;
 Scanner sc=new Scanner(System.in);
 //System.out.println("enter empno");
 //empno=sc.nextInt();
 switch(empno)
 {
   case 1001:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1001\t Ashish \t R&D \t ...");
        break;
       }
   case 1002:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1002 \t Sushma\t PM\t ...");
       break;
       }
  case 1003:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1003 \t Rahul \tAcct \t ...");
       break;
       }
 case 1004:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1005 \tChahat \t frontdesk \t ...");
       break;
       }
 case 1005:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1005 \t Ranjan\t Engg \t ...");
       break;
       }
 case 1006:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1006 \t Suman \t Manfacturing \t ...");
       break;
       }
  case 1007:
       {
       System.out.println("EmpNo\t Empname \t Department \t Designation \t Salary");
       System.out.println("1007 \t Tanmay \t PM \t ...");
       break;
       }

   default:
      System.out.pritnln("there is no employee with id:"+empno);
}
}