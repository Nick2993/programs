import java.util.Scanner;
class CheckAnagram
{
static String s2="";
static int i ,j ,k;
static char temp;

static String removeSpaces(String str)
    { 
          String s1="";
	 for( i=0;i<str.length();i++)
	{
		if((str.charAt(i)!=' '))
		{
		s1=s1+str.charAt(i);
		}
             
	}
                 return s1;

     } 

         static String convertToLowerCase(String s)
            { 
               char ch;String s2="",s3="";
               for(j=0;j<s.length();j++)
               {
                ch= s.charAt(j);
        
               if (65 <= ch && ch<=90)
                 {
                  s3=Character.toString((char)((ch+32))); 
                  s2=s2+s3;
                 }
                else
                 { 
                 s3=Character.toString((char)(ch)); 
                  s2=s2+s3;
                 }
               } 
                 return s2;
             }
             

        static String shorting(String str)
         {
          char[] c = str.toCharArray();
          int l=c.length;
          String s4="";
          for (int i = 0; i <l; i++) {
  
          for ( j = 0; j < l; j++) {
  
          if(c[j]>c[i]){
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            }
            }
            }
          for(int i=0;i<l;i++)
              { 
               s4=s4+c[i]; 
              }
               return s4;
          }






           static boolean isAnagram(String str1,String str2)
                  {
  			for( k=0;k<str1.length();k++)
  		     {
  			if(str1.charAt(k)!=str2.charAt(k))
                      { 
                        return false;
                       
                      }
                       
                    } 
                      return true;
                 }

} 


class Anagram12
{
public static void main(String... args)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter first String");
String firstStr= sc.next();
System.out.println("Enter Second String");
String secondStr= sc.next();


firstStr=CheckAnagram.removeSpaces(firstStr);
System.out.println(""+firstStr);

secondStr= CheckAnagram.removeSpaces(secondStr);
System.out.println(""+secondStr);   


   
 if(firstStr.length()!=secondStr.length())
       {
      System.out.println("Not an Anagram");
       }

firstStr=CheckAnagram.convertToLowerCase(firstStr);
System.out.println("First String in lowercase is:"+firstStr);

secondStr=CheckAnagram.convertToLowerCase(secondStr);
System.out.println("Second String inlowercase is:"+secondStr);

firstStr=CheckAnagram.shorting(firstStr);
System.out.println("Sorting of first String is:"+firstStr);
secondStr=CheckAnagram.shorting(secondStr);
System.out.println("Sorting of second String is is:"+secondStr);

if(CheckAnagram.isAnagram(firstStr,secondStr)==true)
{
System.out.println("String is Anagram");
}
else{System.out.println("String is not Anagram");}
}
}

