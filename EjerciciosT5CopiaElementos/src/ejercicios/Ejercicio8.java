package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v, i, n;
		
		System.out.println("Introduzca un valor inicial");
		v = sc.nextInt();
		System.out.println("Introduzca el incremento");
		i = sc.nextInt();
		System.out.println("Introduzca el numero de valores a crear");
		n = sc.nextInt();
		
		int tabla[]= new int[n];
		tabla[0]=v;
		
		for(int cont=1;cont!=n;cont++) {
			tabla[cont]=i+tabla[cont-1];
		}
		
		System.out.println(Arrays.toString(tabla));
	}

}
