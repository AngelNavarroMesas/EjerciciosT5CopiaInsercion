package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tablaEnteros[] = new int[10];
		int numPares[] = new int[0];
		int numImpares[] = new int[0];
		
		for(int i=0;i!=tablaEnteros.length;i++) {
			System.out.println("Introduzca un numero");
			tablaEnteros[i] = sc.nextInt();
		}
		for(int i=0;i!=tablaEnteros.length;i++) {
			if(tablaEnteros[i]%2==0) {
				numPares = Arrays.copyOf(numPares, numPares.length+1);
				numPares[numPares.length-1]=tablaEnteros[i];
			}else {
				numImpares = Arrays.copyOf(numImpares, numImpares.length+1);
				numImpares[numImpares.length-1]=tablaEnteros[i];
			}
		}
		
		System.out.println("Tabla original: "+Arrays.toString(tablaEnteros));
		System.out.println("Tabla números pares: "+Arrays.toString(numPares));
		System.out.println("Tabla números impares: "+Arrays.toString(numImpares));
		
	}

}
