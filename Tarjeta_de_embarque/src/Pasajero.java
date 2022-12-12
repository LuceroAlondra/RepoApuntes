
public class Pasajero {
	
	private String nombre;//="Tales";//Atributos
	private String telefono;//="624261078";
	private int cantidad_maletas;//=2;
	
	//Set es poner algo (cuando llamas a un setter le das un valor al atributo, accedes...Getter es el valor que tenga el atributo lo recojo.
	public String getNombre() {
		return nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	
	public int getCantidad_maletas() {
		return cantidad_maletas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setCantidad_maletas(int cantidad_maletas) {
		this.cantidad_maletas = cantidad_maletas;
	}
	
	public void DatosPasajero(String nombre, String telefono, int cantidad_maletas) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.cantidad_maletas = cantidad_maletas;
	}

}
