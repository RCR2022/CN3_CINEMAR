import java.sql.SQLException;
import java.util.Scanner;

public class Registro {
	private static final int Null = 0;
	@SuppressWarnings("unused")
	private int Id_user;
	private String nombre;
	private String apellido;
	private String email;
	private String Fecha_Nac;
	private String Contrasenia;
	

	public Registro() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingresar Nombre: ");
		this.nombre = teclado.next();
		
		System.out.println("Ingresar Apellido: ");
		this.apellido= teclado.next();
		
		System.out.println("Ingresar Mail: ");
		this.email= teclado.next();
		
		System.out.println("Ingresar Fecha Nac. (en formato YYYY-MM-DD): ");
		this.Fecha_Nac= teclado.next();
		
		System.out.println("Ingresar Contraseña: ");
		this.Contrasenia= teclado.next();
		
		Id_user = Null;
		
	}
	
	public void validaDatos() throws SQLException {
	
	if(this.nombre!=""&&this.apellido!=""&&this.email!=""&&this.Fecha_Nac!=""&&this.Contrasenia!="") { //podriamos buscar si el email esta en la bdd
		
		String sql = "insert into usuario values(null,"+"'"+this.nombre+"',"+
		"'"+this.apellido+"',"+"'"+this.email+"',"+"'"+this.Fecha_Nac+"',"+"'"+this.Contrasenia+"',1);";
		
		Conexion conexion = new Conexion();
		
		conexion.realizaConsulta(sql);
		
	}
	
	else {
		System.out.println("DATOS MAL INGRESADOS");
	}
	
}}
