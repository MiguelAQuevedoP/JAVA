import java.math.*;
public class clsArregloInv {
	
	public static void invertir(int[] v){
		int auxNum = 0;
		for (int i=0;i<=(Math.floor(v.length/2));i++){
			auxNum = v[i];
			v[i] = v[(v.length-1)-i];
			v[(v.length-1)-i] = auxNum;
		}
	}
	
	public static int[] invertir_2(int[] v){
		int [] resultado = new int[v.length];
		for (int i=0;i<=v.length-1;i++){
			resultado[(v.length-1)-i] = v[i];
			v[i] = resultado[(v.length-1)-i];
		}
		return resultado;
	}
	
	public static void show(int[] v){
		for ( int i=0; i<v.length; i++){
			System.out.print(v[i] + ", ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		/*double num = 1.279;
		double auxNum = Math.floor(num);
		System.out.println("piso del número 1.279: " + auxNum);
		*/
		
		
		
		int a[] = new int [7];
		a[0] = 100;
		a[1] = 90;
		a[2] = 80;
		a[3] = 70;
		a[4] = 60;
		a[5] = 50;
		a[6] = 40;

		clsArregloInv.show(a);
		clsArregloInv.invertir(a);
		int [] inverso = clsArregloInv.invertir_2(a);
		clsArregloInv.show(inverso);
		clsArregloInv.show(a);
		
	}

}
