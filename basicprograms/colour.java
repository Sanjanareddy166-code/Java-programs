import java.util.*;
class Colour
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String code;
  System.out.println("enter code");
  code=sc.nextLine();
  //code=character.toUpperCase(code);
  switch(code)
  {
   case "V":
        System.out.println("violet");
        break;
   case "I":
        System.out.println("indigo");
        break;
   case "B":
        System.out.println("blue");
        break;
   case "G":
        System.out.println("green");
        break;
   case "Y":
        System.out.println("yellow");
        break;
   case "O":
        System.out.println("orange");
        break;
   case "R":
        System.out.println("red");
        break;
   default:
        System.out.println("invalid");
        break;
   }
  }
}

