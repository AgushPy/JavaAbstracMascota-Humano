package entidad;

public final class Persona extends SerVivo {
	private String Apellido;
	private int dni;
	private String domicilio;
	private boolean tieneCasa;
	
	public Persona(String nombre, int aniosVida, boolean haceSonido, String apellido, int dni, String domicilio,
			boolean tieneCasa) {
		super(nombre, aniosVida, haceSonido);
		Apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.tieneCasa = tieneCasa;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public boolean isTieneCasa() {
		return tieneCasa;
	}

	public void setTieneCasa(boolean tieneCasa) {
		this.tieneCasa = tieneCasa;
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
