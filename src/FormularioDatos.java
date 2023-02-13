import java.util.Scanner;

public class FormularioDatos {

	public static Cliente pedirDatosCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI");
		cliente.setDni(scan.nextLine());
		
		System.out.println("Introduce el nombre");
		cliente.setNombre(scan.nextLine());
		
		System.out.println("Introduce los apellidos");
		cliente.setApellidos(scan.nextLine());
		
		System.out.println("Introduce la direccion");
		cliente.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la localidad");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
	public static String pedirDniCliente(Scanner scan) {
		
		System.out.println("Introduce el DNI del cliente");
		String dni = scan.nextLine();
		
		return dni;
	}
	
	public static Cliente pedirNuevoCliente(Scanner scan) {
		Cliente cliente = new Cliente();
		
		System.out.println("Introduce el DNI nuevo");
		cliente.setDni(scan.nextLine());
		
		System.out.println("Introduce el nombre nuevo");
		cliente.setNombre(scan.nextLine());
		
		System.out.println("Introduce los apellidos nuevos");
		cliente.setApellidos(scan.nextLine());
		
		System.out.println("Introduce la nueva direccion");
		cliente.setDireccion(scan.nextLine());
		
		System.out.println("Introduce la localidad nueva");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
}
