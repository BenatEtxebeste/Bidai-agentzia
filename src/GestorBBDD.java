import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;

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
	
	public ArrayList<Cliente> getClientes() throws SQLException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		String sentenciaSelect = "SELECT * FROM clientes";
		pst = super.con.prepareStatement(sentenciaSelect);
		ResultSet resultado = pst.executeQuery();
		while (resultado.next()) {
			Cliente cliente = new Cliente();
			cliente.setDni(resultado.getString("dni"));
			cliente.setNombre(resultado.getString("nombre"));
			cliente.setApellidos(resultado.getString("apellidos"));
			cliente.setDireccion(resultado.getString("direccion"));
			cliente.setLocalidad(resultado.getString("localidad"));
			clientes.add(cliente);
		}
		
		return clientes;
	}
	
	public void insertarHotel(Hotel hotel) throws SQLException {
		pst = super.con.prepareStatement("INSERT INTO hoteles (cif, nombre, gerente, estrellas, compania) VALUES (?, ?, ?, ?, ?)");
		
		pst.setString(1, hotel.getCif());
		pst.setString(2, hotel.getNombre());
		pst.setString(3, hotel.getGerente());
		pst.setInt(4, hotel.getEstrellas());
		pst.setString(5, hotel.getCompania());
		
		pst.execute();
	}
	
	public void insertarHabitacion(Habitacion habitacion) throws SQLException {
		pst = super.con.prepareStatement("INSERT INTO habitaciones (id, id_hotel, numero, descripcion, precio) VALUES (?, ?, ?, ?, ?)");
		
		pst.setInt(1, habitacion.getId());
		pst.setInt(2, habitacion.getId_hotel());
		pst.setString(3, habitacion.getNumero());
		pst.setString(4, habitacion.getDescripcion());
		pst.setDouble(5, habitacion.getPrecio());
		
		pst.execute();
	}
	
	public void insertarReserva(Reserva reserva) throws SQLException {
		pst = super.con.prepareStatement("INSERT INTO reservas (id, id_habitacion, dni, desde, hasta) VALUES (?, ?, ?, ?, ?)");
		
		pst.setInt(1, reserva.getId());
		pst.setInt(2, reserva.getId_habitacion());
		pst.setString(3, reserva.getDni());
		pst.setDate(4, new Date(reserva.getDesde().getTime()));
		pst.setDate(5, new Date(reserva.getHasta().getTime()));
		
		pst.execute();
	}
}
