import java.util.logging.Level;
import java.util.logging.Logger;

public class Caballo implements Runnable {
	private String name;
	private int kilometros;
	
	Caballo (String name, int kilometros){
		this.name=name;
		this.kilometros=kilometros;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(kilometros*1000);
			System.out.println("El " + name + " ha recorrido "+ kilometros + " kilometros." );
			
		}
		catch (InterruptedException ex) {
			Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		
	}

	

