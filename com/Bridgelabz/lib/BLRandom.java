
package com.Bridgelabz.lib;
import java.util.Random;

public class BLRandom 
{ 
    static int i;
    static Random r=new Random(40);
    public  static int random(int a) 
    {
        for(i=0;i<a;i++)
        {
      System.out.println(r.nextInt(100));
        }
   return 0;
    }
    public static int setSeed(long seed)
    {
    System.out.println("Before Seed Random no's are:");
    r.setSeed(45);
    for(int j=0;j<seed;j++)
        {
      System.out.println(r.nextInt(100));
        }
    System.out.println("After Seed Random no's are:");
    r.setSeed(40);
    for(int j=0;j<seed;j++)
        {
      System.out.println(r.nextInt(40));
        }
    return 0;
    }
               
    static int uniform(int n)
    {
        return r.nextInt();
    }
    
    static double uniform(double lo,double hi)
    {
        return lo + uniform()*(hi-lo);
    }
    
    static int bernaulli(double p)
    {
        if(!(p>=0.0 && p<=1.0))
                {
                  System.out.println("Probablility must be between 0 and 1");
                
         return uniform()<p;
       }
       
    }
    static double gaussian()
    {
        double r,x,y;
        do{
            x=uniform(-1.0,1.0);
            y=uniform(-1.0,1.0);
            r=x*x+y*y;
        }
        while(r>=1 || r==0);
        return x*Math.sqrt(-2*Math.log(r)/r);
                    
    }   
    
    static double gaussian(double mu,double sigma)
    {
        return mu+sigma*gaussian();
    }
    
    //static int discrete (double[] probabilities)
    static void shuffle(double[] a)
    {
        int n = 0;
        while(a!=null)
        {
        n=a.length;
        }
        
        for(int m=0;m<n;m++)
        {
          int r=i+uniform(n-i);
          double temp=a[i];
          a[i]=a[r];
          a[r]=temp;
        }    
    }

}
