
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	private String email;
	private String pass;
	private int tipo_usuario;
	
	public Login(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(int tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	public Usuario ingresar() throws SQLException {
		
		Usuario user = null; //solo lo declare
		@SuppressWarnings("unused")
		Usuario admin = null;
		Conexion conexion = new Conexion();
		
		String consulta = "select * from usuario where Mail="+"'"+this.email+"'"+
				" and Contraseña =" + "'" + this.pass + "'"/* +"and Id_Tipo="+"'"+this.tipo_usuario+"'" */;
		ResultSet rs = conexion.devuelveConsulta(consulta);
		
		while(rs.next()) {
			System.out.println("Ingreso exitoso!");
			
			int id_user = rs.getInt("Id");
			String nombre = rs.getString("Nombre");
			String apellido = rs.getString("Apellido"); //el nombre del parametro debe coincir con el nombre de la columna
			String email = rs.getString("Mail");
			String Fecha_Nac = rs.getString("Fecha_Nac");
			String Contrasenia = rs.getString("Contraseña");
			/* int tipousuario = rs.getInt("Id_Tipo"); */
			user = new Usuario(id_user, nombre, apellido, email, Fecha_Nac, Contrasenia/* , tipousuario */);
			admin = new Usuario(id_user, nombre, apellido, email, Fecha_Nac, Contrasenia/* , tipousuario */);
		}
		
		return user;
		
	}
	

}
