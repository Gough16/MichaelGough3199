import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

//Michael Gough
//This is my integration project that will cover 
//The skills that I learn throughout this semester 

class Main {

	// This is our main method
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = "Hello, and welcome to my program, Lets get you started on the path to a healthier lifestyle!";
		
		System.out.println(s.toUpperCase());
		Trainer step1 = new Trainer();
		UserInput step2 = new UserInput();
		BodyMassIndex step3  = new BodyMassIndex();
		LocalDateAndTime step4 = new LocalDateAndTime(); 
		Foods step5 = new Foods();
		Values step6 = new Values(); 
		Exercise step7 = new Exercise(); 
		Weeks step8 = new Weeks();
		LambdaP step9 = new LambdaP(); 
		Weights step10 = new Weights(); 
		
		//Checked Exception Handled
		step1.yourTrainer();

		step2.getName(scanner, null);
		step2.getAge(scanner, 0);
		
		step3.getUserBMI(scanner);
		
		//Prints out local date and time for the user
		step4.getLocalDate();
		step4.getLocalTime(); 
		
		//The example of Polymorphism
		step5.intake(); 
		//Make an array object called list that takes on the Food class 
		Foods user[] = new Foods[2];
		user[0]=new BadFood();
		user[1]=new GoodFood();
		
	
		for(int x=0;x<2;++x) {
			user[x].intake();
		}
				
		
		step6.ourValues(args);
		
		step7.doExerciseRun(); //We will override our method in this step
		Exercise running = new Exercise_Running(); 
		//We print out our new value that override our original value 
		//because our methods are the same but its just an updated value
		System.out.println("You should run approximately " + running.doExerciseRun() + " miles a week.");
		
		step8.numberOfWeeks();
		
		//Lambda Expression used in this step
		step9.predicate();
				
		step10.liftWeights();
		
		Weight WeightObject = new Weight(55,4,15);
		System.out.printf("%s\n", WeightObject.liftWeights());
		
					
	}
}
	


