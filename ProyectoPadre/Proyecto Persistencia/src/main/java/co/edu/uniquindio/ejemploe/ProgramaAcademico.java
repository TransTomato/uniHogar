package co.edu.uniquindio.ejemploe;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProgramaAcademico
 *
 */
@Entity

public class ProgramaAcademico implements Serializable {

	   
	@Id
	private int codigo;
	private String nombre;
	private int telefono;
	
	@OneToMany(mappedBy="programa")
	private List<EspacioAcademico> espaciosAcademicos;
	private static final long serialVersionUID = 1L;

	public ProgramaAcademico() {
		super();
	}   
	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
   
}
