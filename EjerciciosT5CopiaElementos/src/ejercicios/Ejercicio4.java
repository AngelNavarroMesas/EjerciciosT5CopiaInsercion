package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tablaEnteros[] = new int[10];
		int tabla[] = new int[0];
		
		for(int i=0;i!=tablaEnteros.length;i++) {
			System.out.println("Introduzca un numero");
			tablaEnteros[i] = sc.nextInt();
		}
		Arrays.sort(tablaEnteros);
		for(int i=0;i!=tablaEnteros[tablaEnteros.length-1];i++) {
			int p = Arrays.binarySearch(tablaEnteros, i);
			if(p>=0) {
				tabla = Arrays.copyOf(tabla, tabla.length+1);
				System.arraycopy(tablaEnteros, i, tabla, tabla.length-1, 1);
			}
		}
		
		System.out.println(Arrays.toString(tablaEnteros));
		System.err.println(Arrays.toString(tabla));
		
	}
}
