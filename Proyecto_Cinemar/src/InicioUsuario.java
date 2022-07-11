
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InicioUsuario {
	private Usuario user;
	private Conexion conexion;

	public InicioUsuario(Usuario user) {
		this.user=user;
		this.conexion=new Conexion();
	}

	public InicioUsuario() {
		// TODO Auto-generated constructor stub
	}

	public void visibilizar() throws SQLException {
		int b;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("=============================== MENU USUARIO CINEMAR ===============================\n");
			System.out.println("Bienvenido/a "+this.user.getNombre()
			+" "+this.user.getApellido());
			System.out.println("                     1 - Crear una reserva.");
			System.out.println("                     2 - Ver mis reservas.");
			System.out.println("                     3 - Ver el historial.");
			System.out.println("Elige una opcion");
			b= teclado.nextInt();

		}while (b>3);
		switch (b) {
		case 1 : 

			System.out.println("Que pelicula quieres reservar para hoy?");

			String sql = "SELECT * from sala Id_Sala INNER JOIN pelicula Titulo_Pelicula";
			ResultSet rs = conexion.devuelveConsulta(sql);

			while(rs.next()) {
				int id = rs.getInt("Id_Sala");	@SuppressWarnings("unused") 
				String butaca = rs.getString("Butaca"); 
				String dia = rs.getString("Dia"); 
				String horario = rs.getString("Horario");@SuppressWarnings("unused") 
				String eliminar = rs.getString("Eliminar");	@SuppressWarnings("unused") 
				int idpeli = rs.getInt("Id_Peli");

				String nombre= rs.getString("Titulo_Pelicula"); 
				String duracion = rs.getString("Duracion_Pelicula"); 
				String sinopsis=rs.getString("Sinopsis");@SuppressWarnings("unused") 
				String idioma = rs.getString("Idioma");	@SuppressWarnings("unused") 
				int categoria = rs.getInt("Id_Categoria");@SuppressWarnings("unused") 
				int clasificacion = rs.getInt("Id_Clasificacion");

				System.out.println("SALA Nº: "+id );
				System.out.println("Fecha: "+dia);
				System.out.println("Horario: "+horario);
				System.out.println("Nombre Pelicula: "+nombre );
				System.out.println("Sinopsis: "+sinopsis );
				System.out.println("Tiempo Duracion: "+duracion );
				System.out.println();
				}

				System.out.println("Seleccione id de la pelicula : ");
				int idSel = teclado.nextInt();
	
				String consultaBDD = "Select * from sala "
						+ "where Id_Peli ="+"'"+idSel+"'";
				ResultSet rs3 = conexion.devuelveConsulta(consultaBDD);
	
				if(rs3.next()) {
					@SuppressWarnings("unused")
					String nomP = rs3.getString("Titulo_Pelicula"); 
					@SuppressWarnings("unused")
					int reserva = rs3.getInt("Id_Peli");
												
						@SuppressWarnings("unused")
						String rs4 = "INSERT INTO RESERVA VALUES (null,'dia',NULL,'Null','Null','id'";
						System.out.println("Pelicula agregada a Reservas!");
	
					}
					else {
						System.out.println("No hay reserva de la pelicula");
					}
				
			break;
		case 2 :
			System.out.println("Mostrando Reservas... ");

			String sql2 = "SELECT * FROM cinemar.reserva";
			ResultSet rs4 = conexion.devuelveConsulta(sql2);

			while(rs4.next()) {
				int id = rs4.getInt("Id_Reserva");
				String fecha = rs4.getString("Fecha");
				String descuento = rs4.getString("Descuento");
				String idusuario = rs4.getString("Id_Usuario");
				String iddescuento = rs4.getString("Id_Descuento");
				int idsala = rs4.getInt("Id_Sala");

				System.out.println("Reserva Nº: "+id );
				System.out.println("Fecha: "+fecha);
				System.out.println("Descuento: "+descuento);
				System.out.println("Id Usuario: "+idusuario );
				System.out.println("Id Descuento: "+iddescuento );
				System.out.println("Id Sala: "+idsala );
				System.out.println();
			}

			
			break;
		case 3 : 
			/*Opcion 3 Ver Historial falta implementarlo*/
			break;
		default:
			System.out.println("Verificar error");
		}
	}
}
