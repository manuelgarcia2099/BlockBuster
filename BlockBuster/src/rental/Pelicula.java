package rental;
/**
 * 
 * @author M.Fowler traducción: Manuel García
 *
 */
public class Pelicula {
	
	public static final int NORMAL =0;
	public static final int ESTRENO =1;
	public static final int INFANTIL =2;
	
	private String titulo;
	private int codigoPrecio;
	
	public Pelicula(String titulo, int codigoPrecio) {
		this.titulo=titulo;
		this.codigoPrecio=codigoPrecio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigoPrecio() {
		return codigoPrecio;
	}

	public void setCodigoPrecio(int codigoPrecio) {
		this.codigoPrecio = codigoPrecio;
	}
	
	
			
			

}
