package modelo;

public class Caballero {

	int id;
	String nombre;
	int fuerza;
	int experiencia;
	String foto;
	Arma arma;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	


	@Override
	public String toString() {
		return "Caballero [id=" + id + ", nombre=" + nombre + ", fuerza=" + fuerza + ", experiencia=" + experiencia
				+ ", foto=" + foto + ", arma=" + arma + "]";
	}
	
	
}
