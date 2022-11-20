import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		Scanner in = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del caballo 1:");
		String in1 = in.nextLine();
		
		System.out.println("Introduce el nombre del caballo 2:");
		String in2 = in.nextLine();
		
		System.out.println("Introduce el nombre del caballo 3:");
		String in3 = in.nextLine();

		
		Caballo caballo1 = new Caballo (in1,randomNum);
		randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		Caballo caballo2 = new Caballo (in2, randomNum);
		randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		Caballo caballo3 = new Caballo (in3, randomNum);
		
		Thread t= new Thread (caballo1);
		System.out.println("Sale el caballo " + in1);
			t.start();
			
		Thread t2= new Thread (caballo2);
		System.out.println("Sale el caballo " + in2);
			t2.start();
			
		Thread t3= new Thread (caballo3);
		System.out.println("Sale el caballo " + in3);
			t3.start();
		
	}

}
