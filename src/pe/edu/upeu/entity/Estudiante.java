package pe.edu.upeu.entity;

public class Estudiante {
	private int idestudiante;
	private int idescuela;
	private String apellnombres;
	private String correo;
	private String telefono;
	public Estudiante() {
		super();
	}
	public Estudiante(int idestudiante, int idescuela, String apellnombres, String correo, String telefono) {
		super();
		this.idestudiante = idestudiante;
		this.idescuela = idescuela;
		this.apellnombres = apellnombres;
		this.correo = correo;
		this.telefono = telefono;
	}
	public int getIdestudiante() {
		return idestudiante;
	}
	public void setIdestudiante(int idestudiante) {
		this.idestudiante = idestudiante;
	}
	public int getIdescuela() {
		return idescuela;
	}
	public void setIdescuela(int idescuela) {
		this.idescuela = idescuela;
	}
	public String getApellnombres() {
		return apellnombres;
	}
	public void setApellnombres(String apellnombres) {
		this.apellnombres = apellnombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
