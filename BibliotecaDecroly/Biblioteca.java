
public class Biblioteca {

	//Creacion de atributos, siempre en privados para encapsularlos
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private int maxLibros;
	private Libro[] coleccion;
	
	private int numEjemplaresActuales = 0;
	
	/**
	 * Constructor completo
	 * @param nombre
	 * @param direccion
	 * @param email
	 * @param telefono
	 * @param maxLibros
	 * @param coleccion
	 */
	public Biblioteca(String nombre, String direccion, String email, String telefono, int maxLibros) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.maxLibros = maxLibros;
		this.coleccion = new Libro[this.getMaxLibros()];//el maximo de libros que uno va a tener en la biblioteca
	}

	/**
	 * Constructor con solo 3 parametros
	 * @param nombre
	 * @param direccion
	 * @param maxLibros
	 */
	public Biblioteca(String nombre, String direccion, int maxLibros) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.maxLibros = maxLibros;
		this.coleccion = new Libro[this.getMaxLibros()];
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	private String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	private void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the maxLibros
	 */
	private int getMaxLibros() {
		return maxLibros;
	}

	/**
	 * @param maxLibros the maxLibros to set
	 */
	private void setMaxLibros(int maxLibros) {
		this.maxLibros = maxLibros;
	}

	/**
	 * @return the coleccion
	 */
	public Libro [] getColeccion() {
		return coleccion;
	}
	
	public void insertarLibro(Libro ejemplar) 
	{
		/* Comprobamos si ejemplar es distinto de null
		 * para evitar  el nullPointerException
		 * Tambien comprobamos que entren mas libros en la biblioteca */
		if (ejemplar != null && numEjemplaresActuales < this.maxLibros) 
		{
			/* Vamos a a�adir un libro a la biblio
			 * Es importante que no este repetido
			 * vamos a usar como elemento unico el ISBN */
			
			//Si no hay libros no necesitamos comprobar nada
			if( numEjemplaresActuales == 0) {
				this.coleccion[0] = ejemplar;
				numEjemplaresActuales ++;
			}
			else if(numEjemplaresActuales > 0)
			{
				/* Ahora vamos a buscar si el elemento esta repetido
				 * recorremos la coleccion comprobando los ISBN */
				boolean existeEjemplar =  false;
				for(int i = 0; i < this.coleccion.length; i++)
				{
					/* Comprobamos si el elemento [i] no sea null,
					 * para evitar el nullPointerException */
					if(this.coleccion[i] != null) 
					{
						if (this.coleccion[i].getISBN().equalsIgnoreCase(ejemplar.getISBN()))
						{
							existeEjemplar = true;
						}
					}
				}//for
				
				/* Comprobamos el existeEjemplar = false en ese caso el elemento
				 * no esta repatido, le a�adimos en la posicion y aumentamos en 
				 * uno el numero de ejemplares
				 */
				if(existeEjemplar) // TODO: Recuerda jhacer esta comprobacion, de isbn distinto
				{
					this.coleccion[numEjemplaresActuales] = ejemplar;
					numEjemplaresActuales++;
				}
				else 
				{
					System.out.println("El ejemplar esta repetido");
				}
			}// else ejemplares > 0
			
		}// if null
	}//metodo

	public void borrarColeccion()
	{
		this.coleccion = new Libro [this.maxLibros];
	}
	
	public void borrarLibro(Libro ejemplar)
	{
		if(ejemplar != null)
		{
			int posicion = -1;
			for (int i = 0; i < this.coleccion.length; i++)
			{
				if(this.coleccion[i] != null) 
				{
					if(this.coleccion[i].getTitulo().equals(ejemplar.getTitulo())) {
						coleccion[i].setBorrarLibro();// se llama a la funcion borrar libro
					}
				}
				
			}//for
		}// if != null
	}//metodo borrarLibro
	
}//clase
