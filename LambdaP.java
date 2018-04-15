
public class LambdaP {

	public void predicate() {
		System.out.println("These are the Fluids that you should drink on a daily basis: ");

		// Anonymous Runnable
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Water");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Apple Cider");
		Runnable r3 = () -> System.out.println("Almond Milk");
		Runnable r4 = () -> System.out.println("Orange Juice");
		Runnable r5 = () -> System.out.println("Green Tea");
		Runnable r6 = () -> System.out.println("Tomato Juice");



		
		// Run em!
		r1.run();
		r2.run();
		r3.run();
		r4.run();
		r5.run();
		r6.run();
	}
}
