package ejemplo;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RunnableHilo runn = new RunnableHilo();
		
		Thread hilo = new Thread(runn);
		
		hilo.start();	
	}

}
