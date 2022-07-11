public class Usuario {
	
	private int id_user;
	private String nombre;
	private String apellido;
	private String email;
	private String Fecha_Nac;
	private String Contrasenia;
	/* private int tipousuario; */
	private Reservas reserva;
	
	public Usuario(int id_user, String nombre, String apellido, String email, String Fecha_Nac,
			String Contrasenia/* , int tipousuario */) {

		this.id_user = id_user;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.Fecha_Nac = Fecha_Nac;
		this.Contrasenia = Contrasenia;
		/* this.tipousuario= tipousuario; */
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_Nac() {
		return Fecha_Nac;
	}

	public void setFecha_Nac(String fecha_Nac) {
		Fecha_Nac = fecha_Nac;
	}

	public String getContrasenia() {
		return Contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
	public Reservas getReserva() {
		return reserva;
	}

	public void setReserva(Reservas reserva) {
		this.reserva = reserva;
	}
	public void agragaPeliculas(Peliculas p) {
		this.reserva.agragaPeliculas(p);
		
	}

	/*
	 * public int getTipousuario() { return tipousuario; }
	 * 
	 * public void setTipousuario(int tipousuario) { this.tipousuario = tipousuario;
	 * }
	 */




}