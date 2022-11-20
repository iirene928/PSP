import java.util.logging.Level;
import java.util.logging.Logger;

public class Caballo implements Runnable {
	private String name;
	private int segundos;
	
	Caballo (String name, int segundos){
		this.name=name;
		this.segundos=segundos;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(segundos*1000);
			System.out.println("El " + name + " ha tardado "+ segundos + " segundos." );
			
		}
		catch (InterruptedException ex) {
			Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
		
	}

	

