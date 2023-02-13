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
				cliente = BBDD.getCliente(FormularioDatos.pedirDniCliente(scan));
				BBDD.conectar();
				
				BBDD.cerrar();
			default:
				break;
			}
		} while (opcion != Menu.SALIR);
		
	}
}
