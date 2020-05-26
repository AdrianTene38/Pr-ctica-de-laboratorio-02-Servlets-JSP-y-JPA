package ec.edu.ups.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */

@Entity
@Table (name="Usuario")
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String cedula ;
	private String nombre;
	private String apellido;
	private String correo;
	private String contra;
	private static Persona instance;
	public Persona(String cedula, String nombre, String apellido, String correo, String contra) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contra = contra;
	}


	public Persona() {
		super();
	}

	public static Persona getInstance() {
		return instance;
	}


	public static void setInstance(Persona instance) {
		Persona.instance = instance;
	}


	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contra=" + contra + "]";
	}



}
