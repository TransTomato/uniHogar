package co.edu.uniquindio.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity

public class Persona implements Serializable {

	   
	@Id
	@Column(name = "cedula", length = 10)
	private String cedula;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "apellido", nullable = false)
	private String apellido;
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;
	@Enumerated
	@Column(name = "genero")
	private Genero genero;
	@ElementCollection
	private Map<String, String> telefono;
	private static final long serialVersionUID = 1L;

	public Persona() {
		super();
	}   
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Map<String, String> getTelefono() {
		return telefono;
	}
	public void setTelefono(Map<String, String> telefono) {
		this.telefono = telefono;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
   
}
