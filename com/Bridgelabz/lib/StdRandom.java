
package com.Bridgelabz.lib;
import java.util.Scanner;


public class StdRandom {
    public static void main(String []args)
    {
      double lo,hi,p,mu,sigma;
      int n=20;
      long seed = 0;
      BLRandom blr=new BLRandom();
      Scanner sc=new Scanner(System.in)  ;
      System.out.println("Enter the number");
      int num=sc.nextInt();
      for(int i=0;i<num;i++)
      {
      System.out.println(""+BLRandom.random(num));
      }
      num=(int)(long)num;
      System.out.println();
      
      
      int uniform(int n);
      double uniform(double lo,double hi)
      boolean bernaulli(double p)
      double gaussian()
      double gaussian(double mu,double sigma)
      int discrete (double[] probabilities)
      void shuffle(double[] a)
    }
            
    
}
