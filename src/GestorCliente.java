import java.sql.SQLException;
import java.util.Scanner;

public class GestorCliente {

	public static void run(Scanner scan) throws SQLException {
		int opcion;
		Cliente cliente = new Cliente();
		GestorBBDD BBDD = new GestorBBDD();
		
		do {
			Menu.mostrarMenuCliente();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.INSERTAR_CLIENTE:
				cliente = FormularioDatos.pedirDatosCliente(scan);
				BBDD.conectar();
				BBDD.insertarCliente(cliente);
				BBDD.cerrar();
				break;
			case Menu.ELIMINAR_CLIENTE:
				BBDD.conectar();
				BBDD.eliminarCliente(FormularioDatos.pedirDniCliente(scan));
				BBDD.cerrar();
				break;
			case Menu.MODIFICAR_CLIENTE:
				BBDD.conectar();
				BBDD.modificarCliente(FormularioDatos.pedirNuevoCliente(scan),FormularioDatos.pedirDniCliente(scan));
				BBDD.cerrar();
			case Menu.VER_CLIENTES:
				BBDD.conectar();
				Visor.mostrarClientes(BBDD.getClientes());
				BBDD.cerrar();
			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}
