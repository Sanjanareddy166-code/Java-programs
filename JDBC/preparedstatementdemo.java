import java.sql.*;
import java.util.Scanner;
class PreparedstatementDemo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int k;
  Connection con=null;

  PreparedStatement pstmt=null;
  try
  {
   Class.forName("com.mysql.cj.jdbc.Driver");
   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dIv");
   if(con!=null)
       System.out.println("connection established succesfully");
   pstmt=con.prepareStatement("insert into course1 values(?,?,?,?,?,?)");
   k=sc.nextInt();
   sc.nextLine();
   while(k>0)
   {
     String courseId=sc.nextLine();
     String courseName=sc.nextLine();
     float courseFees=sc.nextFloat();
     int duration=sc.nextInt();
     sc.nextLine();
     String trainerName=sc.nextLine();
     int mobile=sc.nextInt();
     sc.nextLine();

     pstmt.setString(1,courseId);
     pstmt.setString(2,courseName);
     pstmt.setFloat(3,courseFees);
     pstmt.setInt(4,duration);
     pstmt.setString(5,trainerName);
     pstmt.setInt(6,mobile);
     pstmt.executeUpdate();
     k--;
   }
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
}
}