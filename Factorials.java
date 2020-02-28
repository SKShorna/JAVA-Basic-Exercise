import java.util.*;

public class Factorials{

        public static void main(String args[]) { 

	Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
	long fact =1;
	for(int i = 1; i <=input; i++){

	fact = fact*i;
	
	}
	System.out.println("Factorials:" + fact);
      } 


}