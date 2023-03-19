
public class Main {

	public static void main(String[] args) {
	/*	int [] arreglo1 = new int[3];
		
		// guardar datos
		arreglo1[0] = 10;
		arreglo1[1] = 9;
		arreglo1[2] = 8;
		
		System.out.println("" + arreglo1[0] + " " + arreglo1[1] + " " + arreglo1[2]);
		int [] arreglo2 = {11, 12, 13};
		System.out.println("" + arreglo2[0] + " " + arreglo2[1] + " " + arreglo2[2]);
		
		arreglo1[1] = arreglo2[1];
		System.out.println(arreglo1[1]);
		
		char[][] matrix1 = new char[3][3];
		matrix1[0][0] = 'O';
		matrix1[0][1] = 'X';
		System.out.println(matrix1[0][1]);
		
		arreglo1[20] = 100;*/
		
		/*
		 * PRIMER PUNTO (***INVERTIR***)
		 */
		
		System.out.println("PRIMER PUNTO (***INVERTIR***)");
		
		int [] arregloP = new int [10];
		arregloP [0] = 100; 
		arregloP [1] = 90;
		arregloP [2] = 80;
		arregloP [3] = 70;
		arregloP [4] = 60;
		arregloP [5] = 50;
		arregloP [6] = 40;
		arregloP [7] = 30;
		arregloP [8] = 20;
		arregloP [9] = 10;
		
		
		
		/*
		 * SEGUNDO PUNTO (***ENCONTRAR EL MAYOR***)
		 */
		
		System.out.print("SEGUNDO PUNTO (***ENCONTRAR EL MAYOR***) ");
		System.out.println(" ");
		int numMayor = 0;
		for (int a=0; a<9; a++){
			
			if (arregloP [a] > numMayor ){
				numMayor = arregloP [a];
			}
		
		}
		System.out.print(numMayor);
		
		/*
		 * ORDENAR EL ARREGLO
		 */
		
		System.out.println(" ");
		System.out.println("TERCER PUNTO (***ORDENAR***)");
		
		int [] arregloO = new int[8];
		arregloO [0] = 50;
		arregloO [1] = 10;
		arregloO [2] = 90;
		arregloO [3] = 80;
		arregloO [4] = 100;
		arregloO [5] = 30;
		arregloO [6] = 40;
		arregloO [7] = 50;
		int auxNum = 0;
		
		for(int i=0; i<8; i++){
			System.out.print(arregloO[i]+" ");
		}
		System.out.println(" ");
		System.out.println("***ORDENADO***");
		
		for (int j=0; j<8; j++){
			
			for (int r=j+1; r<8; r++){
				
				if(arregloO[j]>arregloO[r]){
					
					auxNum = arregloO[j];
					arregloO[j]= arregloO[r];
					arregloO[r] = auxNum;
					
				}
			}
		}
		
		for (int i=0;i<8;i++){
			System.out.print(arregloO[i]+" ");
		}
		
	}

}
