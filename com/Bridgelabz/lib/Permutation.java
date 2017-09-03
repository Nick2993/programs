
public class Permutation
{
    public static void main(String[] args)
    { 
        int counter=0;
        String str = args[0];
        int length = str.length();
        
      permute(str, 0, length-1);
    }
    static void permute(String str, int start, int end)
    {
        if (start == end)
     {
       System.out.println(str);
       
     }
         
        else
        {
            for (int i = start; i <= end; i++)
            {
                if(start!= i)
		{
                str = swap(str,start,i);
		}
                permute(str, start+1, end);
               
           }
        }
          
    }

   
    public  static String swap(String a, int i, int j)
    { 
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

 
}
 
