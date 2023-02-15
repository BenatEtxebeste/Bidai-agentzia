import java.sql.SQLException;
import java.util.Scanner;

public class GestorHotel {
	
	public static void run(Scanner scan) throws SQLException {
		int opcion;
		Hotel hotel = new Hotel();
		GestorBBDD BBDD = new GestorBBDD();
		
		do {
			Menu.mostrarMenuHotel();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_HOTEL:
				hotel = FormularioDatos.pedirDatosHotel(scan);
				BBDD.conectar();
				BBDD.insertarHotel(hotel);
				BBDD.cerrar();
				break;

			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}
