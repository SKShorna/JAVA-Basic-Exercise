
import java.util.Scanner;
import java.lang.Math;
public class DistanceChecker{

        public static void main(String args[]) 
    { 
        System.out.println("What is the radius of your circular landmass?"); 
	Scanner sc = new Scanner(System.in);
	double r = sc.nextDouble();
	System.out.println("What are the x and y coordinates of the center of your landmass?");
	double h = sc.nextDouble();
	double k = sc.nextDouble();
	System.out.println("What are the x and y coordinates of your fish spawn point?");
	double x = sc.nextDouble();
	double y = sc.nextDouble();
 	double d;
	double sum = (Math.pow((x-h), 2) + Math.pow((y-k), 2));
	d = (Math.sqrt(sum)-r);
	System.out.println("The fish are a distance of " + d +" from the shoreline.");
	sc.close();
    } 


}