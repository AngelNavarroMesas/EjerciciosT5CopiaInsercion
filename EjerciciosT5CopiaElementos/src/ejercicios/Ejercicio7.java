package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		int V, P;
		char opcion = 0;
		
		for(int i=0;i!=tabla.length;i++) {
			tabla[i] = (int) (Math.random()*100+1);
		}
		
		while(opcion!='c'){
			
			System.out.println("a. Mostrar valores");
			System.out.println("b. Introducir valor");
			System.out.println("c. Salir");
			opcion = sc.next().charAt(0);
			
			switch(opcion) {
				
				case 'a': System.out.println(Arrays.toString(tabla)); break;
				
				case 'b':
					System.out.println("Introduzca un valor");
					V = sc.nextInt();
					System.out.println("En que posicion decesa introducirlo?");
					P = sc.nextInt();
					
					tabla = Arrays.copyOf(tabla, tabla.length+1);
					System.arraycopy(tabla, P, tabla, P+1, tabla.length-(tabla.length-P));
					tabla[P]=V;
				break;
				
			}
			
		}
		
		
	}

}
