import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestorBBDD extends Conector{
	PreparedStatement pst;

	public void insertarCliente(Cliente cliente) throws SQLException {
		pst = super.con.prepareStatement("INSERT INTO clientes VALUES(?, ?, ?, ?, ?)");
		pst.setString(1, cliente.getDni());
		pst.setString(2, cliente.getNombre());
		pst.setString(3, cliente.getApellidos());
		pst.setString(4, cliente.getDireccion());
		pst.setString(5, cliente.getLocalidad());
		
		pst.execute();
	}
	
	public void eliminarCliente(String dni) throws SQLException{
		pst = super.con.prepareStatement("DELETE FROM clientes WHERE dni= ?");
		pst.setString(1, dni);
		
		pst.execute();
	}
	
	public Cliente getCliente(String dni) throws SQLException {
		String sentenciaSelect = "SELECT * FROM clientes WHERE dni = ?";
		pst=super.con.prepareStatement(sentenciaSelect);
		pst.setString(1, dni);
		Cliente cliente = new Cliente();
		ResultSet resultado = pst.executeQuery();
		resultado.next();
		cliente.setDni(resultado.getString("dni"));
		cliente.setNombre(resultado.getString("nombre"));
		cliente.setApellidos(resultado.getString("apellidos"));
		cliente.setDireccion(resultado.getString("direccion"));
		cliente.setLocalidad(resultado.getString("localidad"));
		
		return cliente;
	}
	
	public void modificarCliente(Cliente cliente, String dni) throws SQLException {
		pst = super.con.prepareStatement("UPDATE clientes set  nombre = ?, apellidos = ?, direccion = ?, localidad = ? WHERE dni=?");
		
		pst.setString(1, cliente.getNombre());
		pst.setString(2, cliente.getApellidos());
		pst.setString(3, cliente.getDireccion());
		pst.setString(4, cliente.getLocalidad());
		pst.setString(5, dni);
		
		pst.executeUpdate();
	}
}
