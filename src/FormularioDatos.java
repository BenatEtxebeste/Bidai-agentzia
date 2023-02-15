import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		Cliente cliente=new Cliente();
		
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
	
	public static Hotel pedirDatosHotel(Scanner scan) {
		Hotel hotel = new Hotel();
		
		System.out.println("Introduce el numero cif");
		hotel.setCif(scan.nextLine());
		
		System.out.println("Introduce el nombre");
		hotel.setNombre(scan.nextLine());
		
		System.out.println("Introduce quien es el gerente");
		hotel.setGerente(scan.nextLine());
		
		System.out.println("Introduce el numero de estrellas");
		hotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce la compañia");
		hotel.setCompania(scan.nextLine());
		
		return hotel;
	}
	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		Habitacion habitacion = new Habitacion();
		
		System.out.println("Introduce la id de la habitacion");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce la id del hotel");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el numero de habitacion");
		habitacion.setNumero(scan.nextLine());
		
		System.out.println("Introduce la descripcion");
		habitacion.setDescripcion(scan.nextLine());
		
		System.out.println("Introduce el precio");
		habitacion.setPrecio(Double.parseDouble(scan.nextLine()));
		
		return habitacion;
	}
	
	public static Reserva pedirDatosReserva(Scanner scan) throws ParseException {
		Reserva reserva = new Reserva();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Introduce la id de la habitacion");
		reserva.setId_habitacion(Integer.parseInt(scan.nextLine()));
		
		System.out.println("Introduce el dni");
		reserva.setDni(scan.nextLine());
		
		System.out.println("Introduce cuando se hizo la reserva (dd/MM/yyyy)");
		reserva.setDesde(formato.parse(scan.nextLine()));
		
		System.out.println("Introduce cuando finaliza la reserva (dd/MM/yyyy)");
		reserva.setHasta(formato.parse(scan.nextLine()));
		
		return reserva;
	}
}