package entidad;

public abstract class SerVivo {
	protected String nombre;
	protected int aniosVida;
	protected boolean haceSonido;
	
	public SerVivo(String nombre, int aniosVida, boolean haceSonido) {
		super();
		this.nombre = nombre;
		this.aniosVida = aniosVida;
		this.haceSonido = haceSonido;
	}

	
	
	
}
