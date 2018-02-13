import java.util.Scanner;

//Michael Gough
//This is my integration project that will cover 
//The skills that I learn throughout this semester 

class Main {

	// This is our main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "Hello, and welcome to my program, Lets get you started on the path to a healthier lifestyle!";
		fitPlan.setDays(5);
		
		System.out.println(s.toUpperCase());
		UserInput step1 = new UserInput();
		BodyMassIndex step2  = new BodyMassIndex();
		SetPlan step3 = new SetPlan();
		
		step1.getName(scanner, null);
		step1.getAge(scanner, 0);	
		
		step2.getUserBMI(scanner);
		
		String setDays;
		step3.daysTo(setDays);
		
		
		

	}
}
	


