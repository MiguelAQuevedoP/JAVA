package pruebas;

public class prueba {

	public static void main(String[] args) {
	
		//pruebaModulo();
		//show();
	}

	/*
	public static void pruebaModulo(){
		int j=2;
		for (int i=0; i<10;i++){
			int op = i%j;
			System.out.println(op);
		}
	}
	
	public void pruebaMostrarTabla(){
		char[][] tabla = new char[3][3];
		
		tabla[0][0] = 'O';
		tabla[0][1] = 'O';
		tabla[0][2] = 'O';
		
		for(int i=0;i<tabla.length; i++){
			 for(int j=0;j<tabla.length; j++){
			 System.out.println(tabla[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
	}
	*/
	public static int crearJugadores(){
		 int jugadorActual = 0;
		 char [] jugador = new char [2];
		 jugador [0] = 0;
		 jugador [1] = 1;
		 jugadorActual = jugadorActual % jugador.length;
		 jugadorActual ++;
		 //int op = 0;
		 //op = jugadorActual % jugador.length;
		 return jugadorActual;
	 }
	
	public static void show (){
		System.out.println("jugador: "+ crearJugadores());
	}
	
	public static void capturarTecla(){
		comboBox.addKeyListener(new java.awt.event.keyAdapter()){
			public void keyReleased(java.awt.event.KeyEvent evt) {
				if (evt.getKeyCode()==KeyEvent.VK_ENTER){
					System.out.println("Presionó Enter);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}//FIN DE CLASE
