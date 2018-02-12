package refactoring;
/**
 * @author M.Fowler traducción: Manuel García
 * 13.1 creamos el método getPrecio(int diasAlquilados) desde clase AlquilerR getPrecio()
 * 15.1 creamos el método getPuntosClienteFrecuente(int diasAlquilados) desde la clase AlquilerR getPuntosClienteFrecuente();
 * 17.1 Set codigoPrecio en el Constructor, crear instancia Precio y se modifica los elementos en el método SET
 * 20. Se invoca el método getPrecio(int) de la clase PrecioR a partir de la instancia precio en el método getPrecio(int) en esta clase 
 * 23. Movemos el método getPuntosClienteFrecuente(int) para Precio
 * 24. Usamos la instancia precio nuevamente para invocar el método movido a la clase precio getPuntosClienteFrecuente(int) 
 */
public class PeliculaRefactoring {

	public static final int NORMAL =0;
	public static final int ESTRENO =1;
	public static final int INFANTIL =2;
	
	private String titulo;
	private int codigoPrecio;
	
	private PrecioRefactoring precio;
	
	public PeliculaRefactoring(String titulo, int codigoPrecio) {
		this.titulo=titulo;
		setCodigoPrecio(codigoPrecio);
	}
	
	double getPrecio(int diasAlquilados) {
		return precio.getPrecio(diasAlquilados);
	}
	
	int getPuntosClienteFrecuente(int diasAlquilados) {
		return precio.getPuntosClienteFrecuente(diasAlquilados);
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
		switch(codigoPrecio) {
		case NORMAL: precio = new PrecioNormal(); break;
		case INFANTIL: precio = new PrecioInfantil(); break;
		case ESTRENO: precio = new PrecioEstreno(); break;
		default: throw new IllegalArgumentException("Código de Precio Incorrecto");
		}
	}
	
}
