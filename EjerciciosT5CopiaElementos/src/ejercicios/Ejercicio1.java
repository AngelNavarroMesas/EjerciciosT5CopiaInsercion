package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[15];
		int copia[] = new int[num.length];
		int aux=0;
		
		
		while(aux!=num.length) {	
			
			System.out.println("Introduzca un numero");
			num[aux] = sc.nextInt();
			
			aux++;
			
		}
		
		System.arraycopy(num, 0, copia, 1, num.length-1);
		System.arraycopy(num, num.length-1, copia, 0, 1);
		
		System.out.println("Array sin modificar: "+Arrays.toString(num));
		System.out.println("Array modificado: "+Arrays.toString(copia));
		
	}

}
