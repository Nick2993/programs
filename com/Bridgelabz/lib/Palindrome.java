import java.util.Scanner;
public class Palindrome 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.nextLine();
        String str1="";
        char a[]=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--)
        {
            str1=str1+a[i];
        }
       
                if(str.equals(str1)) 
                {
                    System.out.println(" String is Palindrome");
                }
                else
                {
                     System.out.println("String is Not a Palindrome");
                }
        
    }
 }
