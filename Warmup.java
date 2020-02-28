
//import java.util.Scanner;
import java.util.*;

public class Warmup{

        public static void main(String args[]) { 
       
	//Scanner sc = new Scanner(System.in);
	//int  = sc.nextDouble();
	//------The first 100 terms of -10, -5, 0, 5, 10, ...
	
	//int sum = -10;
	//for(int i = 0; i<100; i++){
          
         //System.out.println(sum+ " ");
         //sum += 5;         
        
  	//}

       // -------The first 40 terms of 10.0, 11.0, 12.1, 13.31, 14.641, ...

      // double sum_d = 10.0;
       //for(int i =0; i<40; i++){
        //System.out.printf("%.3f", sum_d);
	//System.out.println(" ");
        //sum_d += sum_d*0.1;
       
	//} 
	//---------The first 75 terms of 7, 10, 15, 22, 31, ...

	//int sum_1 = 7;
        //int sum_2 = 10;
	//int add = 3; 
	//for(int i =0; i<75; i++){
        //System.out.println(" "+ sum_1);
	//sum_1 += add;
	//add += 2;
	//}
        
	//---- The first 1500 terms of 3, -4, 5, -6, 7, ...
	
	//int sum_A = 3;
        //int sum_B = -4; 
	//for(int i =0; i<15; i++){
        //System.out.println(" "+ sum_A);
	//System.out.println(" " +sum_B);
	//sum_A += 2;
	//sum_B += -2;
	//}

	int sum_pos =3;
	int sum_neg = -4;
	for(int i =0; i<15; i++){
        if (sum_pos>0){
	
 	System.out.println(" " +sum_pos);
 	sum_pos +=2;
	System.out.println(" " +sum_neg);
	 sum_neg -= 2;
	}
	
	}


      } 


}