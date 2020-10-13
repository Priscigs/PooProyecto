/**
 * Clase Usuario
 *
 *
 * @author Priscilla González
 */

public class Usuarios {
	private int id;
	private String user;
	private String password;
	private String nombre;
	private String correo;
	private String sesion;
	
	/** method getId
	*@param ninguno
	*@return int
	*/
	public int getId() {
		return id;
	}
	
	/** method setId
	*@param id
	*@return ninguno
	*/	
	public void setId(int id) {
		this.id = id;
	}
	
	/** method getUser
	*@param ninguno
	*@return String
	*/
	public String getUser() {
		return user;
	}
	
	/** method setUser
	*@param user
	*@return ninguno
	*/	
	public void setUser(String user) {
		this.user = user;
	}
	
	/** method getPassword
	*@param ninguno
	*@return String
	*/
	public String getPassword() {
		return password;
	}
	
	/** method setPassword
	*@param password
	*@return ninguno
	*/	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/** method getNombre
	*@param ninguno
	*@return String
	*/
	public String getNombre() {
		return nombre;
	}
	
	/** method setNombre
	*@param nombre
	*@return ninguno
	*/	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/** method getCorreo
	*@param ninguno
	*@return String
	*/
	public String getCorreo() {
		return correo;
	}
	
	/** method setCorreo
	*@param correo
	*@return ninguno
	*/	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/** method getSesion
	*@param ninguno
	*@return String
	*/
	public String getSesion() {
		return sesion;
	}
	
	/** method setSesion
	*@param sesion
	*@return ninguno
	*/	
	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
}
