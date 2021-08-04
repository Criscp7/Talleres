package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare un vector X[3] de tipo char y construya un programa que pida 
		// usuario que 
		// ingrese los valores para cada posicion
		// y finalmente que se imprima todos los valores ingresados 
		char X[] = new char [3];
		
		for (int i = 0;i<3;i++) {
			System.out.println("Ingrese un valor de la posicion: "+i);
			Scanner lector=new Scanner(System.in);
			char n=(char)lector.next().charAt(0);
			X[i]=n; 
			
					
		}

	}

}
