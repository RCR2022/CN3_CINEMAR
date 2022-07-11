public class Peliculas {

	private int id_p;
	private String titulo_pelicula;
	private String duracion_pelicula;
	private String sinopsis;
	private String idioma;
	private int id_categoria;
	private int id_clasificacion;
	private double precio;
	private int cantidad;
	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Peliculas(int id_p, String titulo_pelicula,String duracion_pelicula,String sinopsis, String idioma, int id_categoria,int id_clasificacion) {
		super();
		this.id_p = id_p;
		this.titulo_pelicula = titulo_pelicula;
		this.duracion_pelicula = duracion_pelicula;
		this.sinopsis = sinopsis;
		this.id_categoria= id_categoria;
		this.id_clasificacion= id_clasificacion;
	}


	public int getId_p() {
		return id_p;
	}


	public void setId_p(int id_p) {
		this.id_p = id_p;
	}


	public String getTitulo_pelicula() {
		return titulo_pelicula;
	}


	public void setTitulo_pelicula(String titulo_pelicula) {
		this.titulo_pelicula = titulo_pelicula;
	}


	public String getDuracion_pelicula() {
		return duracion_pelicula;
	}


	public void setDuracion_pelicula(String duracion_pelicula) {
		this.duracion_pelicula = duracion_pelicula;
	}


	public String getSinopsis() {
		return sinopsis;
	}


	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public int getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}


	public int getId_clasificacion() {
		return id_clasificacion;
	}


	public void setId_clasificacion(int id_clasificacion) {
		this.id_clasificacion = id_clasificacion;
	}


	@Override
	public String toString() {
		return "Peliculas [id_p=" + id_p + ", titulo_pelicula=" + titulo_pelicula + ", duracion_pelicula="
				+ duracion_pelicula + ", sinopsis=" + sinopsis + ", idioma=" + idioma + ", id_categoria=" + id_categoria
				+ ", id_clasificacion=" + id_clasificacion + "]";
	}
	
	
	
	
}