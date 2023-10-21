package aec.cse;
public class Stringpractice 
{
public String reverse(String s)
{
 int i;
 String r="";  
 for(i=0;i<s.length();i++)
 {  
     r=s.charAt(i)+r; 
    //=>ex:"aditya" 1.a+s 2.d+a 3. i+da 4.t+ida and so on.. 
 }  
    return r;  
}    


public boolean ispalindrome(String s)
{
  /*int i,n;
  n=s.length();
  char ch[]=s.toCharArray();
  for(i=0;i<n/2;i++)
 {
 if(ch[i]!=ch[n-i-1])
   return false;
 }
 return true;
}*/

String rev=reverse(s);
if(s.equals(rev))
   return true;
else
   return false;
}
}

