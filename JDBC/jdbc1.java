import java.sql.*;
class jdbc1
{
 public static void main(String args[])
 {
 try
 {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d1","root","saN#$944^%dIv");
  if(con!=null)
    System.out.println("database connected");
  else
    System.out.println("not connected");
 }
catch(Exception e)
{
 System.out.println(e);
 }
}
}

  