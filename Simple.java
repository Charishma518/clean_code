import java.io.*;
import java.util.*;
class Test
{ 
    // static block 
    static
    { 
        double PAmount, ROI, TimePeriod, simpleInterset;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Principal Amount : ");
		PAmount = sc.nextDouble();
		
		System.out.print(" Please Enter the Rate Of Interest : ");
		ROI = sc.nextDouble();
		
		System.out.print(" Please Enter the Time Period in Years : ");
		TimePeriod = sc.nextDouble();
		
		simpleInterset = (PAmount * ROI * TimePeriod) / 100;
		
		System.out.println("\n The Simple Interest for Principal Amount " + PAmount + " is = " + simpleInterset);
    } 
} 
class Simple extends Test
{
public static void main(String args[])
{
Test o2= new Test();
}
}
