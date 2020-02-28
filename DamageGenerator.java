
import java.util.Scanner;
import java.lang.Math;
//import java.util.Random;
public class DamageGenerator{

        public static void main(String args[]) 
    { 
        System.out.println("What is the minimum possible damage?"); 
	Scanner sc = new Scanner(System.in);
	int min = sc.nextInt();
	System.out.println("What is the maximum possible damage?");
	int max = sc.nextInt();
	//Random r = new Random();
      //  int rn = r.nextInt(((max - min) + 1) + min));
	
	//System.out.println("POW! Your attack just dealt "+ rn + " damage!");
	System.out.println("POW! Your attack just dealt "+ (int)(Math.random()*((max-min+1)+min)))+ " damage!");
	sc.close();
    } 


}