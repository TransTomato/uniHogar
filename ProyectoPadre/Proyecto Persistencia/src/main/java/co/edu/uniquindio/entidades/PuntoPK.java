package co.edu.uniquindio.entidades;

import java.io.Serializable;
import java.lang.Double;

/**
 * ID class for entity: Punto
 *
 */ 
public class PuntoPK  implements Serializable {   
   
	         
	private Double latitud;         
	private Double longitud;
	private static final long serialVersionUID = 1L;

	public PuntoPK() {}

	

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
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof PuntoPK)) {
			return false;
		}
		PuntoPK other = (PuntoPK) o;
		return true
			&& (getLatitud() == null ? other.getLatitud() == null : getLatitud().equals(other.getLatitud()))
			&& (getLongitud() == null ? other.getLongitud() == null : getLongitud().equals(other.getLongitud()));
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getLatitud() == null ? 0 : getLatitud().hashCode());
		result = prime * result + (getLongitud() == null ? 0 : getLongitud().hashCode());
		return result;
	}
   
   
}
