
public class Libro {

	private String ISBN;
	private String titulo; //nombre
	private String autor;
	private int aPublicacion; //telefono
	private int numPag;
	
	protected int contador = 0; // para poder generar un id isbn.
	
	public Libro(String isbn, String titulo, String autor, int publicacion, int numPag) { //generamos los constructores
		
		this.ISBN = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.aPublicacion = publicacion;
		this.numPag = numPag;
		
	}
	
	public Libro(String titulo, String autor, int añoPublicacion) { //generamos los constructores, en los cuales se deben devolver los parametros en el mismo orden
		
		this.ISBN = ""+this.contador; // se le suma un string vacio y le queda el int 
		this.titulo = titulo;
		this.aPublicacion = añoPublicacion;
		this.autor = autor;
		this.numPag = 0;
	}
	
	public void setBorrarLibro() { //se crea una funcion
		
		this.ISBN = ""; 
		this.titulo = "";
		this.aPublicacion = 0;
		this.autor = "";
		this.numPag = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean equals(Libro c) {
		if(this.titulo.trim().equalsIgnoreCase(c.getTitulo().trim())) {
			return true;
		}
			return false;
	}//esto es para comparar si hay libros  iguales
	
	/**
	 * @return the ISBN
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * @param iSBN the ISBN to set
	 */
	private void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * @return the ti

	/**
	 * @param titulo the titulo to set
	 */
	

	/**
	 * @return the aPublicacion
	 */
	public int getaPublicacion() {
		return aPublicacion;
	}

	/**
	 * @param aPublicacion the aPublicacion to set
	 */
	public void setaPublicacion(int aPublicacion) {
		this.aPublicacion = aPublicacion;
	}
	
	/**
	 * @return the numPag
	 */
	public int getNumPag() {
		return numPag;
	}

	/**
	 * @param numPag the numPag to set
	 */
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	public String toString() {
		return "El libro " +titulo+" con ISBN" + "Creado por el autor" + autor + "tiene" + numPag + "paginas";
		
	}

	/** Constructor
	 * @param ISBN
	 * @param titulo
	 */
	public Libro(String ISBN, String titulo) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
	}
	
	/** Constructor
	 * 
	 * @param ISBN
	 * @param titulo
	 * @param autor
	 */
	public Libro(String ISBN, String titulo, String autor) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
		this.setAutor(autor);
	}
	
	/** Constructor
	 * 
	 * @param ISBN
	 * @param titulo
	 * @param autor
	 * @param aPublicacion
	 */
	public Libro(String ISBN, String titulo, String autor, int aPublicacion) {
		this.setISBN(ISBN);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setaPublicacion(aPublicacion);
	}

	/**
	 * Metodo para mostrar por pantalla toda la informacion
	 * del libro
	 */
	public void mostrarInfoLibro() 
	{
		String info;
		info = "ISBN: "+this.ISBN +"\n" +
		"Titulo: " + this.titulo +"\n" +
		"Autor: " + this.autor +"\n" +
		"A�o de publicacion: "  + this.aPublicacion +"\n"+
		"Numero de paginas: " + this.numPag +"\n";
		System.out.println(info);
	}
}
