import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) throws SQLException {
		int a;
		@SuppressWarnings("resource")
		Scanner ingreso = new Scanner(System.in);
		do {
		System.out.println("========================= LOGIN CINEMAR =========================");
		
		System.out.println("1 - Ingresar");
		System.out.println("2 - Registrarse");
		System.out.println("Ingrese una opcion: ");
		a = ingreso.nextInt();
		}while (a>2);
		
		switch(a) {
		case 1:
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("---- INGRESO -----");
			System.out.println("Ingrese email: ");
			String email = teclado.next();

			System.out.println("Ingrese contraseña: ");
			String contra = teclado.next();

			Login login = new Login(email,contra);
			Usuario user = login.ingresar();

			
			  Conexion conexion = new Conexion();
			 
			  String sql ="select Mail, Contraseña, Id_Tipo FROM usuario where id_tipo = '1'";
			  ResultSet rs = conexion.devuelveConsulta(sql);
			 

			if(rs.next()) {
					@SuppressWarnings("unused")
					String emails1 = rs.getString("Mail");
					@SuppressWarnings("unused")
					String contrasenia1 = rs.getString("Contraseña");
					int inicio = rs.getInt("Id_Tipo");
				if(inicio!=1) {
				  InicioAdministrador adm = new InicioAdministrador();
				  adm.Administracion_Control();
				 
			}else {
				InicioUsuario ini = new InicioUsuario(user);
				ini.visibilizar();
			}
			}else {
				System.out.println("Ingreso no exitoso");
			}
			break;
		case 2:
			
			System.out.println("---- REGISTRO -----");
			Registro registro1 = new Registro();
			registro1.validaDatos();
			break;
		

			}
	 }

}