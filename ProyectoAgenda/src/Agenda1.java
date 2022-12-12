import java.util.*;
import java.util.InputMismatchException;

public class Agenda1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		boolean salir = false;
		int opcion; //guardo la opcion del usuario
		String nombre;
		int telefono;
		
		AgendaDatos agendaTelefonica = new AgendaDatos(3);
		
		Contacto c;
		
		
		while(!salir){
			
			System.out.println("1. Añadir contacto\r\n"
					+ "2. Listar contacto\r\n"
					+ "3. Buscar contacto\r\n"
					+ "4. Existe contacto\r\n"
					+ "5. Eliminar contacto\r\n"
					+ "6. Contactos disponibles\r\n"
					+ "7. Salir");
			try {
				System.out.println("Escriba una de las opciones");
				opcion = reader.nextInt();
				
				switch (opcion) {
				case 1:
					System.out.println("Escribe un nombre");
					nombre = reader.next();
					
					System.out.println("Escribe un telefono");
					telefono = reader.nextInt();
				
					c= new Contacto(nombre,telefono);
					agendaTelefonica.añadirContacto(c);
					
					break;
				case 2:
					agendaTelefonica.listaContactos();
					break;
				case 3:
					System.out.println("Escribe un nombre");
					nombre = reader.next();
					
					agendaTelefonica.buscarConNombre(nombre);
					break;
				case 4:
					System.out.println("Escribe un nombre");
					nombre=reader.next();
					c= new Contacto(nombre,0);
					
					if(agendaTelefonica.existeContacto(c)){
						System.out.println("Existe contacto");
					}else
						System.out.println("No existe contacto");
					break;
				case 5:
					System.out.println("Escribe un nombre");
					nombre=reader.next();
					c= new Contacto(nombre,0);
					
					agendaTelefonica.existeContacto(c);
					
					break;
				case 6:
					System.out.println("Hay " + agendaTelefonica.huecosLibre()+"contactos");
					break;
				case 7:
					if(agendaTelefonica.agendaLlena()) {
					System.out.println("La agenda está llena");
					} else {
						System.out.println("Aún puedes agregar un contacto");
					}
					break;
					
				case 8:
					salir = true;
					break;
				default:
					System.out.println("Solo opciones entre 1 y 8");
				}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Debes insertar un numero");
			reader.next();
		}
		}
	}
}

	


