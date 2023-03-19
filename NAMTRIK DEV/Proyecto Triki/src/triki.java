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
		 crearTablero();
		 do{
			System.out.println("Jugador Actual: " + jugadores[fichaJugadorActual]);
			if(saveMove()){
			showTablero();
			if(comprobarGanador()){
				juego_terminado = true;
			}
			cambiarJugador();
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
	 /*
	 public void jugada(){
		 Scanner scan = new Scanner(System.in); 
		 System.out.println("Escriba el numero de la fila: ");
		 f = scan.nextInt();
		 f--;
		 System.out.println("Escriba el numero de la columna: ");
		 c = scan.nextInt();
		 c--;
		 tabla[f][c] = 'O';
	 }*/
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
	 //COMPROBAR QUE SEA UN TABLERO 3X3
	 public boolean comprobarTamTabla(){
		 boolean a=false;
		// tabla = new char [3][3];
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
	 /*
	 public int crearJugadores(){
		 int i = 0;
		 int jugadorActual = 0;
		 char [] jugador = new char [2];
		 jugador [1] = 0;
		 jugador [2] = 1;
		 jugadorActual = jugadorActual + jugador[i++];
		 return jugadorActual;
	 }
	 */
	 //FIN DEL JUEGO
	 public boolean finJuego(){
		 boolean fin = false;
		 if(!comprobarTamTabla() || comprobarGanador()){
			 fin = true;
		 }
		 return fin;
	 }
	 
}
