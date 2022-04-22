package entidad;

public class Mascota extends SerVivo{

	public String pelaje;
	public String tipoMascota;
	
	
	public Mascota(String nombre, int aniosVida, boolean haceSonido, String pelaje, String tipoMascota) {
		super(nombre, aniosVida, haceSonido);
		this.pelaje = pelaje;
		this.tipoMascota = tipoMascota;
	}

	
	
	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAniosVida() {
		return aniosVida;
	}

	public void setAniosVida(int aniosVida) {
		this.aniosVida = aniosVida;
	}

	public boolean isHaceSonido() {
		return haceSonido;
	}

	public void setHaceSonido(boolean haceSonido) {
		this.haceSonido = haceSonido;
	}

}
