import java.sql.SQLException;
import java.util.Scanner;

public class GestorAgencia {
	Scanner scan = new Scanner(System.in);
	
	public void run () throws SQLException {
		int opcion;
		do {
			Menu.mostrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion) {
			case Menu.GESTIONAR_CLIENTES:
				GestorCliente.run(scan);
				break;

			default:
				break;
			}
		} while (opcion != Menu.SALIR);
	}
}
