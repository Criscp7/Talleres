package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare un vector X cuya longitud se solicite al usuario, de tipo int y construya un programa que pida al
		//usuario que 
		//ingrese los valores para cada posicion
		// y finalmente que se imprima todos los valores ingresados
     int longitud = ingrese por teclado; 
		int X[] = new int [longitud];
		
		for (int i = 0;i<3;i++) {
			System.out.println("Ingrese un valor de la posicion: "+i);
			Scanner lector=new Scanner(System.in);
			int n=(int)lector.next().charAt(0);
			X[i]=n; 

	}

}
