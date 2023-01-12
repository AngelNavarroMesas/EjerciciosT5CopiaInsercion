package ejercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int tabla[] = new int[100];
		int inversa[] = new int[tabla.length];
		
		for(int i=0;i!=tabla.length;i++) {
			tabla[i]= i+1;
			inversa[tabla.length-i-1]=tabla[i];
		}
		
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(inversa));
		
	}

}
