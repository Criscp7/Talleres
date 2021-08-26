package deber.ordenamiento.empresa;

import java.util.Arrays;

public class MainEmpresagpf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados empleado1 = new Empleados();
		empleado1.setNombre("Cristian");
		empleado1.setApellido("Pozo");
		empleado1.setEdad(24);
		empleado1.setSalario(280.10);
		
		Empleados empleado2 = new Empleados();
		empleado2.setNombre("Pepe");
		empleado2.setApellido("Atiencia");
		empleado2.setEdad(21);
		empleado2.setSalario(260.30);
		
		Empleados empleado3 = new Empleados();
		empleado3.setNombre("Mauricio");
		empleado3.setApellido("Altamirano");
		empleado3.setEdad(25);
		empleado3.setSalario(300.80);
		
		Empleados empleado4 = new Empleados();
		empleado4.setNombre("Santiago");
		empleado4.setApellido("Muñoz");
		empleado4.setEdad(21);
		empleado4.setSalario(310.50);
		
		Empleados empleado5 = new Empleados();
		empleado5.setNombre("Michael");
		empleado5.setApellido("Velasco");
		empleado5.setEdad(28);
		empleado5.setSalario(250.70);
		
		Empleados empleado6 = new Empleados();
		empleado6.setNombre("Jose");
		empleado6.setApellido("Pilaquinga");
		empleado6.setEdad(22);
		empleado6.setSalario(330.30);
		
		Empleados empleado7 = new Empleados();
		empleado7.setNombre("Sergio");
		empleado7.setApellido("Hernandez");
		empleado7.setEdad(28);
		empleado7.setSalario(370.20);
		
		Empleados empleado8 = new Empleados();
		empleado8.setNombre("Edmundo ");
		empleado8.setApellido("Carvajal");
		empleado8.setEdad(20);
		empleado8.setSalario(380.40);
		
		Empleados empleado9 = new Empleados();
		empleado9.setNombre("Juan");
		empleado9.setApellido("Quijia");
		empleado9.setEdad(29);
		empleado9.setSalario(320.90);
		
		Empleados empleado10 = new Empleados();
		empleado10.setNombre("Pablo");
		empleado10.setApellido("Salcedo");
		empleado10.setEdad(29);
		empleado10.setSalario(380.30);
		
		
		Empleados nominaEmpleados[]= new Empleados[10];
		nominaEmpleados[0] = empleado1;
		nominaEmpleados[1] = empleado2;
		nominaEmpleados[2] = empleado3;
		nominaEmpleados[3] = empleado4;
		nominaEmpleados[4] = empleado5;
		nominaEmpleados[5] = empleado6;
		nominaEmpleados[6] = empleado7;
		nominaEmpleados[7] = empleado8;
		nominaEmpleados[8] = empleado9;
		nominaEmpleados[9] = empleado10;
		
		System.out.println("Lista de empleados desordenada:");
		System.out.println(Arrays.toString(nominaEmpleados));
		
		
		System.out.println("");
		Arrays.sort(nominaEmpleados);
		
		System.out.println("Lista de empleados ordenada:");
		System.out.println(Arrays.toString(nominaEmpleados));

	}

}
