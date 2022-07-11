import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Reservas {

	private ArrayList<Peliculas> arrayProd;
	
	public Reservas() {
		
		this.arrayProd = new ArrayList<Peliculas>();
	}

	public void agragaPeliculas(Peliculas p) {
		this.arrayProd.add(p);
	}
	
	public void recorrerReservas() {
		
		for (int i=0;i<this.arrayProd.size();i++) {
			
		System.out.println(arrayProd.get(i).toString());
			
		}
		
	}
	
	
    public String devuelveDetalle() {
		
    	String cadena = "";
		for (int i=0;i<this.arrayProd.size();i++) {
			
		    cadena = cadena+arrayProd.get(i).toString()+"\n";
			
		}
		
		return cadena;
		
	}
	
	public void reservarPelicula(Usuario user) throws SQLException {
		String sql;
		double total=0;
		Calendar fecha = new GregorianCalendar();
		
		int anio = fecha.get(Calendar.YEAR);
	    int mes = fecha.get(Calendar.MONTH);
	    int dia = fecha.get(Calendar.DAY_OF_MONTH);
	    String fechaActual=anio+"-"+mes+"-"+dia;
	    
	    for (int i=0;i<this.arrayProd.size();i++) {
	    	total +=(arrayProd.get(i)).getPrecio()*arrayProd.get(i).getCantidad();
	    }
	    
	    String detalle = devuelveDetalle();
	 
			
		sql = "insert into ventas values (null,"+
		user.getId_user()+",'"+fechaActual+"','"+detalle+"',"+total+");";
			
			//System.out.println(sql);
			
		Conexion conexion = new Conexion();
		conexion.realizaConsulta(sql);
		System.out.println("Compra cargada con exito!");
			
			
				
	}
}