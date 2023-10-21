package aec.cse;
class StringPractice 
{
public String reverse(String s)
{
int i;
char ch[]=s.toCharArray();  
String rev="";  
for(int i=ch.length-1;i>=0;i--)
{  
     rev=rev+ch[i];  
}  
    return rev;  
}    

}
public boolean ispalindrome(String s)
{
  int i,n;
  n=s.length();
  char ch[]=s.toCharArray();
  for(i=0;i<n/2;i++)
 {
 if(ch[i]!=ch[n-i-1])
   return false;
 }
 return true;
}


}
public String vowels(String s)
{


}