package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		int aux[] = new int[tabla.length];
		int primo=0, noprimo=tabla.length;
		
		
		for(int i=0; i!=tabla.length;i++) {
			
			System.out.println("Introduzca un numero");
			aux[i] = sc.nextInt();
			
		}
		
		for(int i=0;i!=tabla.length;i++) {
			
			if(esPrimo(aux[i])==true) {
				System.arraycopy(aux, i, tabla, primo, 1);
				primo++;
			}else {
				System.arraycopy(aux, i, tabla, noprimo-1, 1);
				noprimo--;
			}
			
		}
		
		System.out.println(Arrays.toString(aux));
		System.out.println(Arrays.toString(tabla));
		
	}
	
	public static boolean esPrimo(int num) {
		//Declaramos la variable que vamos a usar en la funcion
		boolean primo = true;
		
		//Este bucle no parara hasta que el valor de i sea igual que el del numero introducido
		//i es igual a 2 asi podremos usarla para averiguar si el numero es primo
		for(int i=2;i<num;i++) {
			//Si el valor de i es un divisor del numero introducido significa que el numero introducido no es primo pues un numero primo solo puede ser dividido entre 1 o el mismo
			if(num%i==0) {
				primo=false;
			}
		}
		
		//Devolvemos el resultado
		return primo;
		
	}
	
}