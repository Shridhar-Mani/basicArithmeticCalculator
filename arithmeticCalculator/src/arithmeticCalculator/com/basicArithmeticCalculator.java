package arithmeticCalculator.com;

import java.util.Scanner;

public class basicArithmeticCalculator {
	
	public static void main(String args[]) {
		System.out.println("Welcome to basic Program");
		menu3();
		
	}
	
	public static void menu4() {
		
		Scanner sc = new Scanner(System.in);
		int num2;
		num2 = sc.nextInt();
    	if(num2 == 1) {
    		menu3();
    		
    	}
    	else if (num2 == 2){
    		System.out.println("Successfully Exited");
    		System.exit(0);
    		
    	}
    	else {
    		System.out.println("Wrong Choice try again...\n");
    		menu2();
    		menu4();
   
    	}
		
		
		
	}
	public static void menu() {
		
		
		System.out.println("1: Addition");
		System.out.println("2: Subtraction");
		System.out.println("3: Multiplication");
		System.out.println("4: Division");
		System.out.println("5: Exit");
		System.out.println("\nEnter your choice");
		
	}
	
	public static void menu2() {
		
		System.out.println("1: Main Menu");
		System.out.println("2: Exit");
		
		
	}
	
	public static void menu3() {
		
		
		int num,a1,a2;
		Scanner sc = new Scanner(System.in);
		menu();
		num = sc.nextInt();
		
		
		
        if(num == 1) {
        	
        	System.out.println("Enter 1st Number");
        	a1=sc.nextInt();
        	System.out.println("Enter 2nd Number");
        	a2=sc.nextInt();
        	System.out.println("Addition : "+(a1+a2)+"\n");
        	menu2();
        	menu4();
        	
        	
        	
			
		}
		else if (num == 2) {
			
			System.out.println("Enter 1st Number");
        	a1=sc.nextInt();
        	System.out.println("Enter 2nd Number");
        	a2=sc.nextInt();
        	System.out.println("Subtraction : "+(a1-a2)+"\n");
        	menu2();
        	menu4();
        	
        	
        	
        	
			
		}
		else if (num == 3) {
			
			System.out.println("Enter 1st Number");
        	a1=sc.nextInt();
        	System.out.println("Enter 2nd Number");
        	a2=sc.nextInt();
        	System.out.println("Multiplication : "+(a1*a2)+"\n");
        	menu2();
        	menu4();
			
			
		}
		else if (num == 4) {
			
			System.out.println("Enter 1st Number");
        	a1=sc.nextInt();
        	System.out.println("Enter 2nd Number");
        	a2=sc.nextInt();
        	System.out.println("Division : "+(a1/a2)+"\n");
        	menu2();
        	menu4();
			
			
		}
		else if (num == 5) {
			System.out.println("Successfully Exited");
			System.exit(0);
			
			
		}
		else {
			
			System.out.println("Wrong Choice try again...\n");
			menu3();
			
		}
		
	}
	
	
	

}
