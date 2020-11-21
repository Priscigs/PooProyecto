import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Clase SQLUsuarios
 *
 * Clase hija de Clase Conexión
 *
 * @author Priscilla González
 */

public class SQLUsuarios extends Conexion {

	/** method register, creación de cuenta
	*@param user de tipo Usuarios
	*@return boolean
	*/	
	public boolean register(Usuarios user) {
		PreparedStatement preS = null;
		Connection conexion = conectar();

		String sql = "INSERT INTO usuarios (usuario, clave, nombre, correo, nombreN) VALUES (?,?,?,?,?)";

		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getUser());
			preS.setString(2, user.getPassword());
			preS.setString(3, user.getNombre());
			preS.setString(4, user.getCorreo());
			preS.setString(5, user.getNombreN());
			preS.execute();
			return true;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}
	}

	/** method verificarUsuario para que el usuario no se repita al momento de la creación de cuenta
	*@param user de tipo String
	*@return int
	*/	
	public int verificarUsuario(String user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT count(idusuarios) FROM usuarios WHERE usuario = ?";

		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user);
			resS = preS.executeQuery();

			if (resS.next()) {
				return resS.getInt(1);
			}
			return 1;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return 1;
		}
	}

	/** method inicioSesion
	*@param user de tipo Usuarios
	*@return boolean
	*/	
	public boolean inicioSesion(Usuarios user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT idusuarios, usuario, clave, nombre FROM usuarios WHERE usuario = ?";

		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getUser());
			resS = preS.executeQuery();

			if (resS.next()) {
				//columna 3 se encuentra la clave
				if (user.getPassword().equals(resS.getString(3))) {
					
					//Mostrará la fecha y hora en la que inició sesión el usuario
					String nuevoSql = "UPDATE usuarios SET sesion = ? WHERE idusuarios = ?";
					
					preS = conexion.prepareStatement(nuevoSql);
					preS.setString(1, user.getSesion());
					preS.setInt(2, resS.getInt(1));
					preS.execute(); 
					
					user.setId(resS.getInt(1));
					user.setNombre(resS.getString(4));
					return true;
				} 
				else {
					return false;
				}
			}
			return false;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean cronoInicioColores(Usuarios user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT idusuarios, nombreN FROM usuarios WHERE nombreN = ?";
		
		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getNombreN());
			resS = preS.executeQuery();

			if (resS.next()) {
				//Mostrará la fecha y hora en la que inició sesión el usuario
				String nuevoSql = "UPDATE usuarios SET inicioT = ? WHERE idusuarios = ?";
				
				preS = conexion.prepareStatement(nuevoSql);
				preS.setString(1, user.getInicioT());
				preS.setInt(2, resS.getInt(1));
				preS.execute(); 
				return true;
			}
			return false;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean cronoFin(Usuarios user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT idusuarios FROM usuarios WHERE usuario = ?";

		try {
			preS = conexion.prepareStatement(sql);
			preS.setInt(1, user.getId());
			resS = preS.executeQuery();

			if (resS.next()) {
				//Mostrará la fecha y hora en la que inició sesión el usuario
				String nuevoSql = "UPDATE usuarios SET finT = ? WHERE idusuarios = ?";
				
				preS = conexion.prepareStatement(nuevoSql);
				preS.setString(1, user.getFinT());
				preS.setInt(2, resS.getInt(1));
				preS.execute(); 
				
				//user.setId(resS.getInt(1));
				//user.setNombre(resS.getString(2));
				return true;
			}
			return false;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean cronoInicioRompe(Usuarios user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT idusuarios, nombreN FROM usuarios WHERE nombreN = ?";
		
		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getNombreN());
			resS = preS.executeQuery();

			if (resS.next()) {
				//Mostrará la fecha y hora en la que inició sesión el usuario
				String nuevoSql = "UPDATE usuarios SET inicioTRompe = ? WHERE idusuarios = ?";
				
				preS = conexion.prepareStatement(nuevoSql);
				preS.setString(1, user.getInicioTRompe());
				preS.setInt(2, resS.getInt(1));
				preS.execute(); 
				return true;
			}
			return false;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}

	}
	
	public boolean cronoInicioMemo(Usuarios user) {
		PreparedStatement preS = null;
		ResultSet resS = null;
		Connection conexion = conectar();

		String sql = "SELECT idusuarios, nombreN FROM usuarios WHERE nombreN = ?";
		
		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getNombreN());
			resS = preS.executeQuery();

			if (resS.next()) {
				//Mostrará la fecha y hora en la que inició sesión el usuario
				String nuevoSql = "UPDATE usuarios SET inicioTMemo = ? WHERE idusuarios = ?";
				
				preS = conexion.prepareStatement(nuevoSql);
				preS.setString(1, user.getInicioTMemo());
				preS.setInt(2, resS.getInt(1));
				preS.execute(); 
				return true;
			}
			return false;

		} catch (SQLException e) {
			Logger.getLogger(SQLUsuarios.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
			return false;
		}

	}
}
