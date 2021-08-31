package prueba.avion;

public class MainVip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pasajero1  = new Pasajero1();
		Pasajero1.setNombre("");
		Pasajero1.setApellido("");
		Pasajero1.setCodigodeMembresia("");
		Pasajero1.setCodigodeDescuento("");
		
		Pasajero2  = new Pasajero2();
		Pasajero2.setNombre("");
		Pasajero2.setApellido("");
		Pasajero2.setCodigodeMembresia("");
		Pasajero2.setCodigodeDescuento("");
		
		Pasajero3  = new Pasajero1();
		Pasajero3.setNombre("");
		Pasajero3.setApellido("");
		Pasajero3.setCodigodeMembresia("");
		Pasajero3.setCodigodeDescuento("");
		
		Pasajero4  = new Pasajero1();
		Pasajero4.setNombre("");
		Pasajero4.setApellido("");
		Pasajero4.setCodigodeMembresia("");
		Pasajero4.setCodigodeDescuento("");
		
		Pasajero5  = new Pasajero1();
		Pasajero5.setNombre("");
		Pasajero5.setApellido("");
		Pasajero5.setCodigodeMembresia("");
		Pasajero5.setCodigodeDescuento("");
		
		Pasajero6  = new Pasajero1();
		Pasajero6.setNombre("");
		Pasajero6.setApellido("");
		Pasajero6.setCodigodeMembresia("");
		Pasajero6.setCodigodeDescuento("");
		
		Pasajero7  = new Pasajero1();
		Pasajero7.setNombre("");
		Pasajero7.setApellido("");
		Pasajero7.setCodigodeMembresia("");
		Pasajero7.setCodigodeDescuento("");
		
		Pasajero8  = new Pasajero1();
		Pasajero8.setNombre("");
		Pasajero8.setApellido("");
		Pasajero8.setCodigodeMembresia("");
		Pasajero8.setCodigodeDescuento("");
		
		Pasajero9  = new Pasajero1();
		Pasajero9.setNombre("");
		Pasajero9.setApellido("");
		Pasajero9.setCodigodeMembresia("");
		Pasajero9.setCodigodeDescuento("");
		
		Pasajero10  = new Pasajero1();
		Pasajero10.setNombre("");
		Pasajero10.setApellido("");
		Pasajero10.setCodigodeMembresia("");
		Pasajero10.setCodigodeDescuento("");
		
		
		
		
		Persona avioneta[][] = new Pasajero[4][5];
		avioneta[0][0] = ;
		avioneta[0][1] = ;
		avioneta[0][2] = ;
		avioneta[0][3] = ;
		avioneta[0][4] = ;
		avioneta[3][0] = ;
		avioneta[3][1] = ;
		avioneta[3][2] = ;
		avioneta[3][3] = ;
		avioneta[3][4] = ;

		avioneta[1][0] = ;
		avioneta[1][1] = ;
		avioneta[1][2] = ;
		avioneta[1][3] = ;
		avioneta[1][4] = ;
		avioneta[2][0] = ;
		avioneta[2][1] = ;
		avioneta[2][2] = ;
		avioneta[2][3] = ;
		avioneta[2][4] = ;
	
		System.out.println("Seleccione al pasajero:");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese fila:");
		int fila = teclado.nextInt();
		System.out.println("Ingrese columna:");
		int columna = teclado.nextInt();
		System.out.println("Pasajero: " + avioneta[fila][columna]);
	}

}
	}

}
