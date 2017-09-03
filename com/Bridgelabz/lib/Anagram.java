import java.util.Arrays;
import java.util.Scanner;

class Anagram
{
    public static void main(String... args)
    {
	Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        System.out.println(""+isAnagram(A,B));
    }
     static boolean isAnagram(String A, String B) {
   //Complete the function
   Boolean retValue = false;
  
   if(A != null && B != null) {
       String C = A.replaceAll("\\W","");
       String D = B.replaceAll("\\W","");
       
      char [] arrayA  = C.toLowerCase().toCharArray();
      char [] arrayB = D.toLowerCase().toCharArray();
       Arrays.sort(arrayA);
       Arrays.sort(arrayB);
       retValue = Arrays.equals(arrayA, arrayB);
   }
   return retValue;
}
}
