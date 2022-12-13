import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		boolean salir = false;
		int opcion = 0; // guardo la opcion del usuario

		/*System.out.println("Ingrese un nombre para su biblioteca"); Descomentar para poner los datos
		String nombre = reader.nextLine();
		System.out.println("Escriba un telefono");
		String telefono = reader.nextLine();
		System.out.println("Escriba una direccion");
		String direccion = reader.nextLine();
		System.out.println("Escriba un email válido");
		String email = reader.nextLine();*/
		System.out.println("Escriba el maximo de libros que desea tener");
		int maxLibros = reader.nextInt();
		
		Biblioteca biblio = new Biblioteca("Lu", "direccion", "email", "telefono", maxLibros); // ya tengo la bibili
		while (!salir) {

			System.out.println("1. Cambiar nombre de biblioteca " + "2. Agregar libro\r\n" + "3. Buscar libro "
					+ "4. Datos del libro\r\n" + "5. Eliminar libro " + "6. Libros disponibles\r\n"
					+ "7. Ver datos de Biblioteca " + "8. Salir");

			System.out.println("Escriba una de las opciones");
			opcion = reader.nextInt();
			reader.nextLine(); // Consumimos la linea que espera nextInt() debido a un error que encontre

			switch (opcion) {
			case 1:
				System.out.println("Escribe un nuevo nombre");
				String nombre = reader.nextLine();
				biblio.setNombre(nombre);
				System.out.println(biblio.getNombre());
				break;
			case 2:
				System.out.println("Ponga el titulo del libro");
				String titulo = reader.nextLine();
				System.out.println("El autor del libro");
				String autor = reader.nextLine();
				System.out.println("El año de publicacion del libro");
				int añopublicacion = reader.nextInt();
				Libro libro1 = new Libro(titulo, autor, añopublicacion);
				// Ejemplar libro nos pide un objeto y un nombre
				biblio.insertarLibro(libro1); // aquí se pasa un libro a biblioteca
				break;
			case 3:
				System.out.println("Escribe el titulo para la busqueda ");
				nombre = reader.nextLine();
				Libro[] busquedaLibro = new Libro[biblio.getColeccion().length];
				
				busquedaLibro = biblio.getColeccion(); // lo que se guarda de get coleccion se guarda lo de
				// busqueda libro
				for (int i = 0; i < busquedaLibro.length; i++) {
					if(busquedaLibro[i] != null) {
						if (busquedaLibro[i].getTitulo().equals(nombre)) {
							System.out.println(busquedaLibro[i].toString());// aqui se busca el libro en la posicion del
							break;// rompo el bucle al encontrar el libro
						}
					}
					}
				break;
			case 4:
				busquedaLibro = biblio.getColeccion();
				for (int i = 0; i < busquedaLibro.length; i++) {
					if(busquedaLibro[i] != null) {
						System.out.println((i + 1) + " " + busquedaLibro[i].getTitulo());// aqui se busca el libro en la
						
					}// posicion del array y solo se
					// muestra el titulo
				}
				System.out.println("Escribe el numero del libro el cual desea la informacion");
				int seleccionInfo = reader.nextInt();

				busquedaLibro[seleccionInfo - 1].mostrarInfoLibro();// aquí se muestra la informacion del libro
				// seleccionado
				break;
			case 5:
				busquedaLibro = biblio.getColeccion();
				for (int i = 0; i < busquedaLibro.length; i++) {
					if(busquedaLibro[i] != null) {
						System.out.println((i + 1) + " " + busquedaLibro[i].getTitulo());// aqui se busca el libro en la
						
					}// posicion del array y solo se
					// muestra el titulo
				}
				System.out.println("Escribe el nombre del libro el cual desea borrar");
				seleccionInfo = reader.nextInt();
				biblio.borrarLibro(busquedaLibro[seleccionInfo-1]);
				busquedaLibro = biblio.getColeccion();
				for (int i = 0; i < busquedaLibro.length; i++) {
					if(busquedaLibro[i] != null) {
						System.out.println((i + 1) + " " + busquedaLibro[i].getTitulo());// aqui se busca el libro en la
						
					}// posicion del array y solo se
					// muestra el titulo
				}
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				salir = true;
				break;
			default:
				System.out.println("Solo opciones entre 1 y 8");
			}
		}
	}

}
