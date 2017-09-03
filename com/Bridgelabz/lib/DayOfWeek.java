
import java.util.Scanner;

class DayOfWeek
{
    static void Display(int m,int d,int y)
	{
	int y0,d0,m0,x;
        y0=y-(14-m)/12;
	x=y0+y0/4/100+y0/400;
	m0=m+12*((14-m)/12)-2;
	d0=(d+x+31*m0/12)%7;
        // creating another String array which contains name of days of a week
	String aa[]={"Sunday","monday","tuesday","wednesday","Thursday","Friday","Saturday"};
	System.out.println(aa[d0]); //printing day of week
	}
public static void main(String... args)
   {
// TAKING THREE COMMAND-LINE ARGUMENTS FROM THE USER FOR DATE MONTH AND YEAR
Scanner sc =new Scanner(System.in);
int m=sc.nextInt();
int d=sc.nextInt();
int y=sc.nextInt();
Display(m,d,y);// CALLING STATIC DISPLAY METHOD

	
   }
}