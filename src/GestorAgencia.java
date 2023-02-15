import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class GestorAgencia {
	Scanner scan = new Scanner(System.in);
	
	public void run () throws SQLException, ParseException {
		int opcion;
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.GESTIONAR_CLIENTES:
				GestorCliente.run(scan);
				break;
			case Menu.GESTIONAR_HOTELES:
				GestorHotel.run(scan);
				break;
			case Menu.GESTIONAR_HABITACIONES:
				GestorHabitacion.run(scan);
				break;
			case Menu.GESTIONAR_RESERVAS:
				GestorReserva.run(scan);
				break;
			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}
