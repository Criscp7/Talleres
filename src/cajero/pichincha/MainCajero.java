package cajero.pichincha;


import java.util.Scanner;


public class MainCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Banco del Pichincha elija una opción");
			System.out.println("1.- Retirar dinero");
			System.out.println("2.- Cambiar clave");
			System.out.println("3.- Bloquear cuenta");
			System.out.println("4.- SALIR");
			System.out.println(" ");
			n= teclado.nextInt();

			if (n == 1) {
				System.out.print("Ingrese el valor a retirar: ");
				int V = teclado.nextInt();
				System.out.println("El valor a retirar es: " + V);
				System.out.println(" ");

			} else if (n == 2) {
				System.out.println("Ingrese nueva clave: ");
				String C = teclado.next();
				System.out.println("Su clave ha sido cambiada con exito.");
				System.out.println(" ");

			} else if (n == 3) {
				System.out.println("Su cuenta ha sido bloqueada.");
				System.out.println(" ");

			} else if (n != 4) {
				System.out.println("Invalida");
				System.out.println(" ");

			}
		} while (n != 4);

	}

}