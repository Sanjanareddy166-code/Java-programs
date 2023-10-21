//INSERTION USING SCANNER

import java.sql.*;
import java.util.Scanner;
class InsertionDemo2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String courseid,coursename,trainername;
		int fees,mobile,duration;
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dI");
         courseid=sc.nextLine();
		coursename=sc.nextLine();
		fees=sc.nextInt();
		duration=sc.nextInt();
        trainername=sc.nextLine();
		mobile=sc.nextInt();
		
     String query="insert into course1 values('"+courseid+"','"+coursename+"',"
		+fees+","+duration+",'"+trainername+"',"+mobile+")";

		
		Statement st=con.createStatement();
		st.executeUpdate(query);
        System.out.println("Query executed Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

