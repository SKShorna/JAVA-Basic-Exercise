
import java.util.Scanner;
public class EuroChangeMaker1{

        public static void main(String args[]) 
    { 
        int x;
        System.out.println("Enter number of euro cents:"); 
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        int euro2 = (int)x/200;
        int euro1 = (int)(x%200)/100;
        int cent50 = (int)((x%200)%100)/50;
        int cent20 = (int)(((x%200)%100)%50)/20;
        int cent10 = (int)((((x%200)%100)%50)%20)/10;
        int cent5 = (int)(((((x%200)%100)%50)%20)%10)/5;
        int cent2 = (int)((((((x%200)%100)%50)%20)%10)%5)/2;
	int cent1 = (int)(((((((x%200)%100)%50)%20)%10)%5)%2)/1;
        System.out.println("2 euro coins:"+ euro2);  
        System.out.println("1 euro coins:"+ euro1);  
        System.out.println("50 cents coins:"+ cent50);  
        System.out.println("20 cents coins:"+ cent20); 
        System.out.println("10 cents coins:"+ cent10); 
        System.out.println("5 cents coins:"+ cent5);
        System.out.println("2 cents coins:"+ cent2);  
	System.out.println("1 cents coins:"+ cent1);
        sc.close();
        
        
    } 


}