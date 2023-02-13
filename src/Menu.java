
public class Menu {
	public static final int GESTIONAR_CLIENTES = 1;
	public static final int GESTIONAR_HABITACIONES = 2;
	public static final int GESTIONAR_HOTELES = 3;
	public static final int GESTIONAR_RESERVAS = 4;
	
	public static final int INSERTAR_CLIENTE = 1;
	public static final int ELIMINAR_CLIENTE = 2;
	public static final int MODIFICAR_CLIENTE = 3;
	public static final int VER_CLIENTES = 4;
	
	public static final int INSERTAR_HABITACION = 1;
	public static final int ELIMINAR_HABITACION = 2;
	public static final int MODIFICAR_HABITACION = 3;
	public static final int VER_HABITACIONES = 4;
	
	public static final int INSERTAR_RESERVA = 1;
	public static final int ELIMINAR_RESERVA = 2;
	public static final int MODIFICAR_RESERVA = 3;
	public static final int VER_RESERVAS = 4;
	
	public static final int SALIR = 0;
	
	public static void mostrarMenuPrincipal() {
		System.out.println("Menu principal");
		System.out.println(GESTIONAR_CLIENTES + ". gestionar clientes");
		System.out.println(GESTIONAR_HABITACIONES + ". gestionar habitaciones");
		System.out.println(GESTIONAR_HOTELES + ". gestionar hoteles");
		System.out.println(GESTIONAR_RESERVAS + ". gestionar reservas");
	}
	
	public static void mostrarMenuCliente() {
		System.out.println("Menu cliente");
		System.out.println(INSERTAR_CLIENTE + ". insertar cliente");
		System.out.println(ELIMINAR_CLIENTE + ". eliminar cliente");
		System.out.println(MODIFICAR_CLIENTE + ". modificar cliente");
		System.out.println(VER_CLIENTES + ". ver clientes");
	}
	
	public static void mostrarMenuHabitacion() {
		System.out.println("Menu habitacion");
		System.out.println(INSERTAR_HABITACION + ". insertar habitacion");
		System.out.println(ELIMINAR_HABITACION + ". eliminar habitacion");
		System.out.println(MODIFICAR_HABITACION + ". modificar habitacion");
		System.out.println(VER_HABITACIONES + ". ver habitaciones");
	}
}
