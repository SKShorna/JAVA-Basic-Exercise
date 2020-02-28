/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
	public static void main(String[] args) {
		 double first_income, second_income,third_income, fourth_income, total_tax, total_tax_effc;
         System.out.println("What was your 2019 income?"); 
         Scanner sc = new Scanner(System.in);
	    double income = sc.nextDouble();
	    
	    if (income>0 && income<=9700 ) {
             
             first_income = (9700*0.1);
             System.out.println("First $9700 :"+ first_income);
             total_tax = first_income;
              total_tax_effc = ((total_tax/income)*100);
             System.out.println("Total tax owed:"+total_tax);
             System.out.println("Effective Tax rate:"+new DecimalFormat("0.00").format(total_tax_effc)+"%");
         
	        
	    } else if (income>9700 && income<=39475) {
 	        first_income = (9700*0.1);
            second_income = ((income-9700)*.12);
              System.out.println("First $9700 :"+ first_income);
              System.out.println("$9700-$39475 :"+ second_income);
              total_tax = first_income+second_income;
               total_tax_effc = ((total_tax/income)*100);
             System.out.println("Total tax owed:"+total_tax);
             System.out.println("Effective Tax rate:"+new DecimalFormat("0.00").format(total_tax_effc)+"%");
             
	    } else if (income>39475 && income<=84200) {
 	        first_income = (9700*0.1);
            second_income = ((39475-9700)*.12);
            third_income = ((84200-39475)*.22);
              System.out.println("First $9700 :"+ first_income);
              System.out.println("$9700-$39475 :"+ second_income);
              System.out.println("$39475-$84200 :"+ third_income);
              total_tax = first_income+second_income+third_income;
              total_tax_effc = ((total_tax/income)*100);
             System.out.println("Total tax owed:"+total_tax);
             System.out.println("Effective Tax rate:"+new DecimalFormat("0.00").format(total_tax_effc)+"%");
                  
	    } else if (income>84200 && income<=160725) {
 	        first_income = (9700*0.1);
            second_income = ((39475-9700)*.12);
            third_income = ((84200-39475)*.22);
            fourth_income = ((income-84200)*.24);
              System.out.println("First $9700 :"+ first_income);
              System.out.println("$9700-$39475 :"+ second_income);
              System.out.println("$39475-$84200 :"+ third_income);
              System.out.println("$$84200-$160725 :"+ fourth_income);
              total_tax = first_income+second_income+third_income+fourth_income;
              total_tax_effc = ((total_tax/income)*100);
             System.out.println("Total tax owed:"+total_tax);
             System.out.println("Effective Tax rate:"+new DecimalFormat("0.00").format(total_tax_effc)+"%");
             
         } else {
            System.out.println("Run Again");
         }
	}
}
