
public class TajetaEmbarque {
	public void Visualizar() {
		//tipodedato nombre = valor:
		Pasajero pasajero = new Pasajero();//llamada a una clase lo convertimos en un objeto.
		Vuelo vuelo = new Vuelo();
		
		//datos del pasajero
		System.out.println("Nombre Pasajero: " + pasajero.getNombre());
		System.out.println("Telefono Pasajero: " + pasajero.getTelefono());
		System.out.println("Numero de maletas: " + pasajero.getCantidad_maletas());
		
		//Datos del vuelo
		System.out.println("Compañia: " + vuelo.getCompañia());
		System.out.println("Origen: " + vuelo.getOrigen());
		System.out.println("Destino: " + vuelo.getDestino());
		
	}
}
