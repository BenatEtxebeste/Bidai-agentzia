import java.sql.SQLException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws SQLException, ParseException {
		GestorAgencia GA = new GestorAgencia();
		GA.run();
	}
}