package Debern1;
import java.util.Scanner;
public class tarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		Scanner lector =new Scanner (System.in);
		int n=0;
		float suma=0;
		float elementos=0;
		float promedio=0;
		System.out.print("Ingrese un numero positivo o 0 para salir:");
		n=lector.nextInt();
		suma=suma+n;
		while(n!=0) {
			System.out.print("Ingrese un numero positivo:");
			n=lector.nextInt();
			
			suma=suma+n;
			elementos++;
			promedio =suma/elementos;
			
		}
		System.out.println("Suma total:"+suma);
		System.out.println("numero de numeros ingresados:"+elementos);
		System.out.println("promedio total:"+promedio);
			}

		}

	}

}
