package rental;

import java.util.Enumeration;
import java.util.Vector;

import org.apache.log4j.Logger;

public class Cliente {
	
	private static final Logger log = Logger.getLogger(Cliente.class);
	
	private String nombre;
	private Vector alquileres = new Vector();
	
	public Cliente(String nombre) {
		this.nombre=nombre;
	}
	
	public void agregarAlquiler(Alquiler alquiler) {
		alquileres.addElement(alquiler);
	}
	
	public String cuenta() {
		
		double pagoTotal=0;
		int puntosClienteFrecuente=0;
		Enumeration alquileresDelCliente = alquileres.elements();
		
		String resultado= "Reporte de Alquiler de "+getNombre();
		
		while(alquileresDelCliente.hasMoreElements()) {
			double pagoUnitario =0;
			Alquiler cadaVezQueRento = (Alquiler) alquileresDelCliente.nextElement();
			
			//Determinar el precio por cada tipo de Película
			switch (cadaVezQueRento.getPelicula().getCodigoPrecio()) {
			case Pelicula.NORMAL:
				pagoUnitario +=2;
				if(cadaVezQueRento.getDiasAlquilados() > 2) {
					pagoUnitario += (cadaVezQueRento.getDiasAlquilados() - 2)*1.5;
				}
				break;
			case Pelicula.ESTRENO:
				pagoUnitario += cadaVezQueRento.getDiasAlquilados()*3;
				break;
			case Pelicula.INFANTIL:
				pagoUnitario += 1.5;
				if(cadaVezQueRento.getDiasAlquilados()>3) {
					pagoUnitario += (cadaVezQueRento.getDiasAlquilados() - 3)*1.5;
				}
				break;
			}
			
			//Agregar los puntos de Cliente Frecuente
			puntosClienteFrecuente ++;
			
			//Agregar un punto de Cliente Frecuente por el alquiler de una pelicula de Estreno por 2 días a más.
			if( (cadaVezQueRento.getPelicula().getCodigoPrecio()== Pelicula.ESTRENO) && cadaVezQueRento.getDiasAlquilados() >1){
				puntosClienteFrecuente ++;
			}
			
			//Mostrar valores por este Alquiler
			resultado += " >>> " + cadaVezQueRento.getPelicula().getTitulo() + " $/"+String.valueOf(pagoUnitario);
			
			pagoTotal += pagoUnitario;
			
		}
		
		// Agregar detalle final
		resultado += " Pago Total: "+String.valueOf(pagoTotal)+" -  Usted ganó : "+String.valueOf(puntosClienteFrecuente)+" puntos de Cliente Frecuente";
		
		
		log.debug("resultado => "+resultado);
		return resultado;
		
	}

	public String getNombre() {
		return nombre;
	}
	
}
