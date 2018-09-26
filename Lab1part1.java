package Lab1;

import java.util.Scanner;

class Lab1part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int userNum1;
	    int  userNum2;
	    int userTotal;
	
	   System.out.println	("Please enter two , three digit numbers: ");// user prompt
 userNum1 = scan.nextInt();
 userNum2= scan.nextInt();
   userTotal = userNum1 + userNum2;  // Total sum of both entries from the user
  
	if (userTotal <= 0) {           // if - else method 
		System.out.println ("Invalid entry please enter a number greater than 0.");// user validation
	}
	else if (userTotal == 222) {
		//hello
		System.out.print("True");
	}
	else if (userTotal == 333) {
			System.out.print("True");
    }
	else if (userTotal == 444) {
		System.out.println ("True");
	}
	else if (userTotal == 555) {
		System.out.println ("True");
	}
	else if (userTotal == 666) {
		System.out.println ("True");
	}
	else if (userTotal == 777) {
		System.out.println ("True");
	}
	else if (userTotal == 888) {
		System.out.println ("True");
	}
	else if (userTotal == 999) {
		System.out.println("True");
	}
	else 
		System.out.println ("False"); 
	}
	
}


	
		
		

	 
	
