import java.sql.SQLException;
import java.util.Scanner;

public class GestorHabitacion {

	public static void run(Scanner scan) throws SQLException {
		int opcion;
		Habitacion habitacion = new Habitacion();
		GestorBBDD BBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuHabitacion();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_HABITACION:
				habitacion = FormularioDatos.pedirDatosHabitacion(scan);
				BBDD.conectar();
				BBDD.insertarHabitacion(habitacion);
				BBDD.cerrar();
				break;

			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}
