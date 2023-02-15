import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorReserva {
	
	public static void run(Scanner scan) throws SQLException, ParseException {
		int opcion;
		Reserva reserva = new Reserva();
		GestorBBDD BBDD = new GestorBBDD();
		do {
			Menu.mostrarMenuReserva();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_RESERVA:
				reserva = FormularioDatos.pedirDatosReserva(scan);
				BBDD.conectar();
				BBDD.insertarReserva(reserva);
				BBDD.cerrar();
				break;

			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}