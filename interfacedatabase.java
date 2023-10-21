interface databaseconnect
{
void getconnection();
void executequery();
void showresults();
void close();
}
class Mysql implements databaseconnect
{
public void getconnection()
{
System.out.println("connect with mysql");
}
public void executequery()
{
System.out.println("query executed in mysql");
}
public void showresults()
{
System.out.println("query resultsin mysql");
}
public void close()
{
System.out.println("close connection with mysql");
}
}


class oracle implements databaseconnect
{
public void getconnection()
{
System.out.println("connect with oracle");
}
public void executequery()
{
System.out.println("query executed in oracle");
}
public void showresults()
{
System.out.println("query resultsin oracle");
}
public void close()
{
System.out.println("close connection with oracle");
}
}
class Main
{
public static void main(String args[])
{
databaseconnect d;
d=new Mysql(); 
d.getconnection();
d.executequery();
d.showresults();
d.close();
}
}