import java.util.Scanner;

public class TajetaEmbarque {
	public void DatosTarjeta() {
		
		Scanner reader = new Scanner(System.in);
		
		Pasajero pasajero1 = new Pasajero();
		Vuelo datosVuelo = new Vuelo();
		
		System.out.println("Introducir datos del pasajero");
		System.out.print("Introducir nombre: ");
		String nombre = reader.next();
		
		System.out.print("Introducir telefono: ");
		String telefono = reader.next();
		
		System.out.print("Introducir cantidad de maletas: ");
		int cantidad_maletas = reader.nextInt();
		
		pasajero1.DatosPasajero(nombre, telefono, cantidad_maletas);
		
		System.out.println("Ingresa el nombre de la compañía: ");
		String nombreCompañia = reader.next();
		
		System.out.println("Ingresa el origen  ");
		String origen = reader.next();
		
		System.out.println("Ingresa el destino: ");
		String destino = reader.next();
		
		System.out.println("Ingresa la fecha: ");
		String fecha = reader.next();
		
		System.out.println("Ingresa la puerta enbarque: ");
		int embarque = reader.nextInt();
		
		System.out.println("Ingresa el numero de vuelo: ");
		int numerovuelo = reader.nextInt();
		
		System.out.println("Ingresa la hora: ");
		int horavuelo = reader.nextInt();
		
		System.out.println("Ingresa los minutos: ");
		int minutosvuelo = reader.nextInt();
		
		System.out.println("Ingresa el asiento: ");
		String asiento = reader.next();
		
		System.out.println("Ingresa la zona: ");
		int zona = reader.nextInt();
		
		System.out.println("Ingresa la clase: ");
		char clase = reader.next().charAt(0); //se pone 0 para la primera letra
		
		datosVuelo.DatosVuelo(nombreCompañia, origen, destino, fecha, embarque, numerovuelo, horavuelo, minutosvuelo, asiento, zona, clase);
		
	}
	public void Visualizar() //es una funcion, muestra los datos de pasajero y vuelo
	{
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
