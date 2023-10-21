import java.util.*;
class Pizza
{
 public static void main(String args[])
 {
 long mobileno;
 String address,name,email;
 String type,crust,size,variant;
 int price;
 Scanner sc=new Scanner(System.in);
 mobileno=sc.nextLong();
 name=sc.nextLine();
 address=sc.nextLine();
 email=sc.nextLine();
 System.out.println("Welcome"+name+"!,D pizza is the favourite pizza store around your place");
System.out.println("What would you like to order veg/nonveg");
type=sc.nextLine();
if(type == "veg")
{
 System.out.println("what would you like to have veg deluxe/veg supreme");
 variant=sc.nextLine();
 System.out.println("thin/pan crust");
 crust=sc.nextLine();
 System.out.println("size medium or large");
 size=sc.nextLine();
}
/*else
{
 System.out.println("what would you like to have chicken supreme /chicken tikka");
variant=sc.nextLine();
System.out.println("thin/pan crust");
crust=sc.nextLine();
System.out.println("size medium or large");
size=sc.nextLine();
}*/
/*if(crust=="thin" && variant=="veggiedeluxe" && size="medium")
   price=550;
else if(crust=="thin" && variant=="veggiedeluxe" && size=="large")
   price=750;
else if(crust=="pan" &&  variant="veggiedeluxe" && size=="medium")
   price=600;
else if(crust=="pan" &&  variant="veggiedeluxe" && size=="large")
   price=900;
else if(crust=="thin" &&  variant="veggiesupreme" && size=="medium")
   price=600;
else if(crust=="thin" &&  variant="veggiesupreme" && size=="large")
   price=800;
else if(crust=="pan" &&  variant="veggiesupreme" && size=="medium")
   price=650;
else if(crust=="pan" &&  variant="veggiesupreme" && size=="large")
   price=600;
else
   System.out.println("invalid");*/
System.out.println("you have selected"+variant+"size"+size+"with a"+crust+"crust price is RS");
}
}


