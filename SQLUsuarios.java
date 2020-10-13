import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

		String sql = "INSERT INTO usuarios (usuario, clave, nombre, correo) VALUES (?,?,?,?)";

		try {
			preS = conexion.prepareStatement(sql);
			preS.setString(1, user.getUser());
			preS.setString(2, user.getPassword());
			preS.setString(3, user.getNombre());
			preS.setString(4, user.getCorreo());
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
}
