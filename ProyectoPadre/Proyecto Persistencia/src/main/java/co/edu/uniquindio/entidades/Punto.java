package co.edu.uniquindio.entidades;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Punto
 *
 */
@Entity

@IdClass(PuntoPK.class)
public class Punto implements Serializable {

	   
	@Id
	private Double latitud;   
	@Id
	private Double longitud;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Punto() {
		super();
	}   
	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}   
	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
