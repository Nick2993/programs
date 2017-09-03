import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
public class MathFunctons 
{
   static Scanner sc=new Scanner(System.in);
    static double temp,epsilon;
    public static int arraynum,min,max;
    static String temp1=null;
    public static double harmonic(int k)
    {
	double sum=0;
	for(int i=1;i<k;i++)
	{
	sum=sum+Math.pow(i,-1);     
	}
	return sum;
    }
    public static double Sinx(int n)       
          
    {
         return Math.sin(n);
    }
    
    public static double Cosinex(int n)            
    {
         return Math.cos(n);  
    }
            
    public static String Binary(int number) 
    {
                
        int m;
        String a=" ";
        while(number>0)
            {
                m=number%2;
                a=m+" "+a;
                number=number/2;    
            }
                return a;                 
       }
    
   public static double sqrt(double number) {
	epsilon = 1e-15;
	temp = number;
	while (Math.abs(temp - number/temp) > epsilon*temp)
        {
               temp = (number/temp + temp) / 2.0;
        }
		return temp;
	}
    public static double sqrt(double number,double epsilon) {
	epsilon = 1e-15;
	temp = number;
	while (Math.abs(temp - number/temp) > epsilon*temp)
        {
               temp = (number/temp + temp) / 2.0;
        }
		return temp;
	}
    public static boolean isPrime(int number) 
    {
        for(int i=2;i<number;i++)
        {
           if (number%i==0)
           {
               return false;
           }
        }
        return true;
    }
    public static long factorial(int number)
    {
        if(number==1)
	return 0;
	int fact=1;
	for(int i=1;i<=number;i++)
            {
	     fact = fact*i;
            }
	     return fact;
    }
   
     public static double futureValue(float amt, float rate, float year)
    {
        return amt*Math.pow(1+rate,year);
    }
     
     public static double presentValue(float amt, float rate, float year)
    {
        
        return amt/Math.pow(1+rate,year);
    }
    public static int minValue(int[] a)
    {
        
       for(int l=0;l<5;l++)
       {
          min=a[0];
          min=Math.min(min,a[l]); 
       }   
       return (min);
    }
     public static int maxValue(int[] a)
    {
        
       for(int n=0;n<5;n++)
       {
          max=a[0];
          max=Math.max(max,a[n]); 
       }   
       return (max);
    }
       /*static public void minString(String[] str)
     {
         for(int q=0;q<5;q++)
         {
             for(int r=1;r<5;r++)
         {
             if(str[r].compareTo(str[q])<0)
             {
                 temp1=str[q];
                 str[q]=str[r];
                 str[r]=temp1;
                 System.out.println(temp);
             }
         }
              
         }
         for(int i=0;i<5;i++)
             {
                System.out.println(""+str[i]);
                 
             }
        
      
     }*/
     
     public static boolean checkCollinearUsingSloap(int x1,int x2,int x3,int y1,int y2,int y3)
     {
         float sloapAB=(y2-y1)/(x2-x1);
         float sloapBC=(y3-y2)/(x3-x2);
         float sloapAC=(y3-y1)/(x3-x1);
         if(sloapAB==sloapBC && sloapBC==sloapAC)
         {
             return true;
             
         }
       return false;
     }
     
     
    public static void main(String... args)
    {  
       System.out.println("Enter a number");
       int no=sc.nextInt();
       System.out.println("Haronic number is"+ harmonic(no));
       System.out.println("Sine of an angle is:"+ Sinx(no));
       System.out.println("Cosine of an angle is"+Cosinex(no));
       System.out.println("Binary of a number is"+ Binary(no)) ;
       if(isPrime(no)==true)
       System.out.println("Number prime is:"+isPrime(no));
       else
       {
       System.out.println("Not a prime number");
       }
       System.out.println("Enter the value of epsilon");
       epsilon=sc.nextDouble();
       System.out.println("SquareRoot of a given number is:"+sqrt(no));
       System.out.println("Error tolerance SquareRoot of a given number is:"+sqrt(no,epsilon));
       System.out.println("Factorial of a number" +no+"is"+factorial(no));
       System.out.println("Enter amout,rate and year to check the future value:");
       float amt=sc.nextFloat();
       float rate=sc.nextFloat();
       float year=sc.nextFloat();
       System.out.println("Future value is"+futureValue(amt,rate,year));
       System.out.println("Present value is"+presentValue(amt,rate,year));
       System.out.println("Enter number 5 no's to find min and max:");
       int a[]=new int[5];
       for(int m=0;m<5;m++)
       {
           System.out.println("Enter number:");
           a[m]=sc.nextInt();
       }    
       System.out.println("Minimum value is"+minValue(a));
       System.out.println("Maximum value is"+maxValue(a));
       /*
       String str[]={"abc","pqr","rst","gst","hell"};
       System.out.println("Maximum value is");
       minString(str);*/
      System.out.println("Enter x1,x2,x3,y1,y2,y3");
      int x1=sc.nextInt();
       int x2=sc.nextInt();
       int x3=sc.nextInt();
       int y1=sc.nextInt();
       int y2=sc.nextInt();
       int y3=sc.nextInt();
       System.out.println("Collinear status:"+checkCollinearUsingSloap(x1,x2,x3,y1,y2,y3));
    }
}

