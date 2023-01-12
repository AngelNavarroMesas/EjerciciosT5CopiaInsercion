package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int tabla[] = new int[20];
		int aux[] = new int[tabla.length];
		int pares=0, impares=0;
		
		for(int i=0;i!=tabla.length;i++) {
			
			aux[i]= (int) (Math.random()*100);
			
			if(aux[i]%2==0) {
				System.arraycopy(aux, i, tabla, pares, 1);
				pares++;
			}else if(aux[i]%2!=0){
				System.arraycopy(aux, i, tabla, tabla.length-1-impares, 1);
				impares++;
			}
			
		}
		
		System.out.println(Arrays.toString(tabla));
	
	}

}
