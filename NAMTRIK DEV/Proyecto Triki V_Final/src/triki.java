import java.util.Scanner;

public class triki {
	
	 private char [][] tabla = {
			 {'_', '_', '_'},
			 {'_', '_', '_'},
			 {'_', '_', '_'}
	 };
	 private char [] jugadores = {'X', 'O'};
	 int fichaJugadorActual = 0;
	 int f,c;
	 Position jugada;
	 public void jugar(){
		 boolean juego_terminado = false;
		 System.out.println("INICIO DE JUEGO");
		 crearTablero();
		 int i = 0; 
		 do{
			
			System.out.println("Jugador Actual: " + jugadores[fichaJugadorActual]);
			if(saveMove()){
			showTablero();
			if(comprobarGanador()||!comprobarTamTabla()){
				juego_terminado = true;
			}
			cambiarJugador();
			if (juego_terminado == true){
				boolean bandera = continuarJuego();
				juego_terminado = bandera;
				i = i+1;
				System.out.println("vuelta: "+ i);
				if(bandera == false){
					crearTablero();
					fichaJugadorActual = 0;
				}
			}
			
			}
		 }while(!juego_terminado);
		 
		 System.out.println("JUEGO TERMINADO");
		 
	 }
	 //LEE UN NUMERO
	 private int leer_entero(String mensaje){
		 Scanner scan = new Scanner(System.in); 
		 System.out.print(mensaje);
		 return scan.nextInt();
	 }
	 //LEER
	 private String leer(){
		 Scanner scan = new Scanner (System.in);
		 return scan.next();
	 }
	 //LEE LA FILA Y LA COLUMNA
	 private Position capturar_jugada(){
		 int fila = leer_entero("Escriba la fila: ");
		 int columna = leer_entero("Escriba la columna: ");
		 return new Position(fila - 1, columna - 1);
	 }
	 //CREA UN NUEVO TABLERO
	 public void crearTablero(){
		 tabla = new char [3][3];
		 for(int i=0;i<tabla.length; i++){
			 for(int j=0; j<tabla.length; j++){
			 tabla[i][j]= '_';
			 }
		 }
	 }
	 //MUESTRA EL TABLERO
	 public void showTablero(){
		 for(int i=0;i<tabla.length; i++){
			 for(int j=0;j<tabla.length; j++){
			 System.out.print(tabla[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
	 }
	 //GUARDA LA POSICIÓN
	 public boolean saveMove(){
		 
		 jugada = capturar_jugada();
		 if(comprobarReglaTam(jugada) && comprobarTabla(jugada)){
			tabla [jugada.getFila()]
				 [jugada.getColumna()] = jugadores[fichaJugadorActual];
			return true;
		 }
		 else{
			 return false;
		 }
	 }
	 //COMPRUEBA SI EL JUGADOR HA GANADO LA PARTIDA
	 public  boolean comprobarGanador(){
		 
		 /*
		  * HORIZONTALES
		  */
		if((tabla [0][0]==tabla[0][1])&&(tabla[0][1]==tabla[0][2])&&(tabla[0][2]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");
			return true;
		}
		 
		else if((tabla [1][0]==tabla[1][1])&&(tabla[1][1]==tabla[1][2]&&(tabla[1][2]==jugadores[fichaJugadorActual]))){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;			 
		}
		
		else if((tabla [2][0]==tabla[2][1])&&(tabla[2][1]==tabla[2][2])&&(tabla[2][2])==jugadores[fichaJugadorActual]){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");
			return true;		 
		}
		/*
		 * VERTICALES
		 */
		else if((tabla [0][0]==tabla[1][0])&&(tabla[1][0]==tabla[2][0])&&(tabla[2][0]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;			 
		}
		
		else if((tabla [0][1]==tabla[1][1])&&(tabla[1][1]==tabla[2][1])&&(tabla[2][1]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;		 
		}
		
		else if((tabla [0][2]==tabla[2][1])&&(tabla[2][1]==tabla[2][2])&&(tabla[2][2]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;			 
		}
		/*
		 * DIAGONALES
		 */
		else if((tabla [0][0]==tabla[1][1])&&(tabla[1][1]==tabla[2][2])&&(tabla[2][2]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;			 
		}
		
		else if((tabla [0][2]==tabla[1][1])&&(tabla[1][1]==tabla[2][0])&&(tabla[2][0]==jugadores[fichaJugadorActual])){
			System.out.println("JUGADOR: " + jugadores[fichaJugadorActual] + "\nHA GANADO LA PARTIDA.");	
			return true;			 
		}
		else{
		return false;
		}
	 }
	 //COMPROBAR QUE NO SEA UNA CASILLA INEXISTENTE 
	 public boolean comprobarReglaTam(Position jugada){
		 
		 if ((jugada.getFila()>=0 && jugada.getFila()<=2)&&(jugada.getColumna()>=0 && jugada.getColumna()<=2) ){
			 return true;
		 }
		 else{
			 System.out.println("CASILLA INEXISTENTE");
			 return false;
			 
		 }
	 }
	 //COMPROBAR QUE LA CASILLA NO ESTÁ OCUPADA
	 public boolean comprobarTabla(Position jugada){
		 if (tabla[jugada.getFila()][jugada.getColumna()]=='_'){
			 return true;
		 }
		 else{
			 System.out.println("CASILLA OCUPADA \nINTENTE DE NUEVO.");
			 return false;
		 }
	 }
	 //COMPROBAR SI LA TABLA ESTÁ LLENA
	 public boolean comprobarTamTabla(){
		 boolean a=false;
		 for(int i=0;i<tabla.length; i++){
			 for(int j=0; j<tabla.length; j++){
				 if(tabla[i][j]=='_'){
					 a = true;
				 }
			 }
		 }
		 return a;
	 }
	 //CAMBIA EL JUGADOR ACTUAL
	 public void cambiarJugador(){
		fichaJugadorActual = (fichaJugadorActual + 1) % jugadores.length;
	 }
	 //JUGADOR DECIDE SI CONTINUAR EL JUEGO O NO
	 public boolean continuarJuego(){
		 boolean bandera = false;
		 System.out.println("¿Quieres continuar el juego YES(Y) or NOT(N)");
		 String mensaje = leer();
		 if (mensaje.equals("N")||mensaje.equals("n")){
			 bandera = true;
		 }
		return bandera;
	 }
}//FIN DE CLASE
