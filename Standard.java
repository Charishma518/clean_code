import java.io.*;
import java.util.*;
class Standard
{ 
    Standard()
    { 
       double Standard_materials;
        double area;
	double total_cost;
 
        Scanner i = new Scanner(System.in);
 
        System.out.print("Enter the Standard materials : "); 
        Standard_materials= i.nextDouble();
 
        System.out.print("Enter the area : "); 
        total_cost = i.nextDouble();
 
        System.out.print("Enter the total cost : "); 
        area = i.nextDouble();
 
        total_cost = Standard_materials * area; 
 
        System.out.println(total_cost);
    } 
} 
class Construction extends Standard
{
public static void main(String args[])
{
Standard o3 = new Standard();
}
}