package Debern1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese el valor del sueldo");
		Scanner leer =new Scanner(System.in);
		
		int A = leer.nextInt();
		if (A < 300) {
		System.out.println("No hay bonificacion. ");
		}else {
			int b= A+ 40;
		System.out.println("la bonificacion es:" +B);
		}

	}

}
