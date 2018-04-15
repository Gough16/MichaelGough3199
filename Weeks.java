
public class Weeks {

	public void numberOfWeeks() {
		System.out.println("In order to see good results in the gym, you should follow this: ");
		int set = 1; 
		int rep = 1;
		
		System.out.println("You should do this many sets: ");
		while (set<4) {
			System.out.println(set);
			set++;
		}
		
		System.out.println("You should do this many reps per set: ");
		while(rep<13) {
			System.out.println(rep);
			rep++;
		}
	}

}
