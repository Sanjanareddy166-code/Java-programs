import java.sql.*;
class TableCreation
{
	public static void main(String args[])
	{
		try
		{
			
		
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/d2","root","saN#$944^%dIv");

		if(con!=null)
			System.out.println("Connection is Established");
		else
			System.out.println("Connection failed");

          String query="create table Course1(cid varchar(20),cname varchar(20),fees float(6),duration integer(2),trainer varchar(20),mobile integer(10))";
		//3. Creation of Statement Object
		Statement st=con.createStatement();
		st.executeUpdate(query);
          System.out.println("Table executed Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
