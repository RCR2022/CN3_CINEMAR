import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;


@SuppressWarnings("unused")
public class InicioAdministrador {
	private Usuario admin;
	private int opcion;
	private Conexion conexion22;
	
	public InicioAdministrador(Usuario admin) {
		this.admin=admin;
		this.opcion=0;
		this.conexion22=new Conexion();
	}
	public InicioAdministrador() {
		// TODO Auto-generated constructor stub
	}

	public Usuario getAdmin() {
		return admin;
	}

	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public Conexion getConexion22() {
		return conexion22;
	}

	public void setConexion22(Conexion conexion) {
		this.conexion22 = conexion;
	}
	
public void Administracion_Control() throws SQLException {
	

		System.out.println("=============================== MENU ADMINISTRADOR CINEMAR ===============================\n");
		System.out.println("                1 - Ver Reservas Clientes.");
		System.out.println(" 				2 - Ver Reservas Cliente Particular");
		System.out.println(" 				3 - Crear una Sala con la Pelicula");
		System.out.println(" 				4 - Modificar una Sala");
		System.out.println(" 				5 - Eliminar una Sala");
		System.out.println(" 				6 - Modificar Descuentos");
	
			
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		 int opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1 : 
			Conexion conexion2 = new Conexion();	
			String sql = "select * from reserva";
			
			ResultSet rs = conexion2.devuelveConsulta(sql);
			
			while(rs.next()) {
				int id= rs.getInt("Id_Reserva");
				String fecha= rs.getString("Fecha");
				boolean des = rs.getBoolean("Descuento");
				int iduser= rs.getInt("Id_Usuario");
				int iddesc= rs.getInt("Id_Descuento");
				int idsala= rs.getInt("Id_Sala");
				
				System.out.println("Id_Reserva:"+id );
				System.out.println("Fecha:"+fecha);
				System.out.println("Id Descuento:"+des );
				System.out.println("Id Usuario:"+iduser);
				System.out.println("Id Descuento:"+iddesc );
				System.out.println("Id Sala: "+idsala);
				System.out.println();}
			break;
		case 2 : 
		
			System.out.println("Ingrese Id Cliente: ");
			Scanner entrada = new Scanner(System.in);
			int opc = entrada.nextInt();
			Conexion conexion = new Conexion();
			String sql2 = "select * from reserva where Id_Reserva = " + "'"+opc+"';";
			
			ResultSet rs2 = conexion .devuelveConsulta(sql2);
			
			while(rs2.next()) {
				
				int id2= rs2.getInt("Id_Reserva");
				String fecha2= rs2.getString("Fecha");
				boolean des2 = rs2.getBoolean("Descuento");
				int iduser2= rs2.getInt("Id_Usuario");
				int iddesc2= rs2.getInt("Id_Descuento");
				int idsala2= rs2.getInt("Id_Sala");
				
				System.out.println("Id_Reserva:"+id2 );
				System.out.println("Fecha:"+fecha2);
				System.out.println("Id Descuento:"+des2 );
				System.out.println("Id Usuario:"+iduser2);
				System.out.println("Id Descuento:"+iddesc2 );
				System.out.println("Id Sala: "+idsala2);
				System.out.println();
				
			}
			
			
			
			
			break;
		case 3 : 
			//Falta implementarlo 
			break;
		default:
			System.out.println("algo salio mal");
		}
	}


}