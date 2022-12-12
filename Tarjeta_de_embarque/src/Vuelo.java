
public class Vuelo {
	private String compañia="Oceanic Airlines";
	public String getCompañia() {
		return compañia;
	}
	public String getOrigen() {
		return origen;
	}
	public String getDestino() {
		return destino;
	}
	public String getFecha() {
		return fecha;
	}
	public int getPuerta_embarque() {
		return puerta_embarque;
	}
	public int getNumero_vuelo() {
		return numero_vuelo;
	}
	public int getHora() {
		return hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public String getAsiento() {
		return asiento;
	}
	public int getZona() {
		return zona;
	}
	public char getClase() {
		return clase;
	}
	private String origen;//="Sidney Australia";
	private String destino;// = "Sleepy Ridge";
	private String fecha;//="24OCT";
	private int puerta_embarque;// =23;
	private int numero_vuelo;// =815;
	private int hora;// =7;
	private int minutos;// =0;
	private String asiento;// ="42B";
	private int zona;// =4;
	private char clase;// = 'C';
	
	public void DatosVuelo(String compañia, String origen, String destino, //no olvidar el void
			String fecha, int puerta_embarque, int numero_vuelo,
			int hora, int minutos, String asiento, int zona, char clase) { //genere un constructor ya que son varios datos no de superclase
		this.compañia = compañia;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.puerta_embarque = puerta_embarque;
		this.numero_vuelo = numero_vuelo;
		this.hora = hora;
		this.minutos = minutos;
		this.asiento = asiento;
		this.zona = zona;
		this.clase = clase;
	}


	
	

}
