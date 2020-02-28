import java.util.*;

public class PasswordChecker{

        public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
  	String pass1 = "sloth";
	String pass2 = sc.nextLine();
        for(int i = 4; i>=0; i-- ){
	
	if(i==0){

	System.out.println("Your account has been disabled for 24 hours. The authorities have been notified.");
	break;
	}
        else if( !pass1.equals(pass2)){
	
	System.out.println("Incorrect password. You have" + i + " attempts remaining before system lockout.");
        pass2 = sc.nextLine();
        
	}
        else{
        System.out.println("Access granted, welcome.");
        break;

	}

	
	}
      
       
	

	
      } 


}