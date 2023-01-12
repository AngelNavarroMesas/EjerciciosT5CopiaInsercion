package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[10];
		
		for(int i=0;i!=tabla.length;i++) {
			tabla[i] = (int) (Math.random()*100+1);
		}
		
	}

}
