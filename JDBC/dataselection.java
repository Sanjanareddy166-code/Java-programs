class Dataselection
{
 public static void main(String args[])
 {
  Connection con=null;
  Statement st=null;
try
{
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dIv");
 if(con!=null)
   System.out.println("connection established successfull");
 Statement st=con.createStatement();
 
 String query="select * from course";
 Resultset rs=st.executeQuery(query);
 while(rs.next())
 {
  String courseId=rs.getString(1);
  String courseName=rs.getString(2);
  float courseFees=rs.getFloat(3);
  String trainerName=rs.getString(5);
  System.out.println(courseId+" "+courseName+" "+courseFees+" "+trainerName);
 }
}
catch(Exception e)
{
 System.out.println(e);
}
finally
{
 con.close();
}
 System.out.println("task completed");
}
}
  
  