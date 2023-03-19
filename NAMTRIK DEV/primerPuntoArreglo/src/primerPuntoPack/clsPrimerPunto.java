package primerPuntoPack;

public class clsPrimerPunto {

	public static void main(String[] args) {
		
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
		
		
		for(int i=0; i<=9; i++){
			
			System.out.print( arregloP[i] + " " );
			
		}
		System.out.println(" ");
		System.out.println("***INVERSO***");
		int auxNum=0;
		
		for (int j=0; j<=9; j++){
			
			for (int r=j+1; r<=9; r++){

					auxNum = arregloP[j];
					arregloP[j]= arregloP[r];
					arregloP[r] = auxNum;
			}
		}
		
		for (int i=0;i<=9;i++){
			System.out.print(arregloP[i]+" ");
		}
		
	}
	
}
