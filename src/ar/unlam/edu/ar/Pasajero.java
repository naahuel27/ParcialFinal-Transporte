package ar.unlam.edu.ar;

public class Pasajero {

	
	private Integer dni; 
	private String apellido;
	
	
	public Pasajero(Integer dni, String apellido) {
		super();
		this.dni = dni;
		this.apellido = apellido;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	

}
