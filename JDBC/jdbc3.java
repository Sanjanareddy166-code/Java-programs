/*import java.sql.*;
class InsertionDemo
{
	public static void main(String args[])
	{
		try
		{
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dIv");

	
        String query="insert into course1 values('C002','Python',5000,3,'Pavan B',197458)";
		//3. Creation of Statement Object
		Statement st=con.createStatement();
		st.executeUpdate(query);
        System.out.println("Inserted Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}*/

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
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dIv");
         courseid=sc.nextLine();
		coursename=sc.nextLine();
		fees=sc.nextInt();
		duration=sc.nextInt();
         sc.next();
         trainername=sc.nextLine();
		mobile=sc.nextInt();
		
         String query="insert into course1 values('"+courseid+"','"+coursename+"',"+fees+","+duration+",'"+trainername+"',"+mobile+")";

		
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


