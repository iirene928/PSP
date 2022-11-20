import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
	
	private static Caballo caballoGanador(Caballo c1, Caballo c2) {
		if (c1.getSegundos() <= c2.getSegundos()) {
			 return c1;
		}
		else {
			return c2;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		int randomNum1 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		int randomNum2 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
		Caballo ganador;
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del caballo 1:");
		String in1 = in.nextLine();
		
		System.out.println("Introduce el nombre del caballo 2:");
		String in2 = in.nextLine();
		
		System.out.println("Introduce el nombre del caballo 3:");
		String in3 = in.nextLine();

		
		Caballo caballo1 = new Caballo (in1,randomNum);
		Caballo caballo2 = new Caballo (in2, randomNum1);
		Caballo caballo3 = new Caballo (in3, randomNum2);
		
		Thread t= new Thread (caballo1);
		System.out.println("Sale el caballo " + in1);
			t.start();
			
		Thread t2= new Thread (caballo2);
		System.out.println("Sale el caballo " + in2);
			t2.start();
			
		Thread t3= new Thread (caballo3);
		System.out.println("Sale el caballo " + in3);
			t3.start();
			
		t.join();
		t2.join();
		t3.join();
		
		ganador = caballoGanador(caballo1, caballo2);
		ganador = caballoGanador(ganador, caballo3);
		
		
		System.out.println("El caballo ganador es " + ganador.getName());
		System.out.println("En total han tardado " + (caballo1.getSegundos() + caballo2.getSegundos() + caballo3.getSegundos()) + " segundos.");	
		
	}

}
