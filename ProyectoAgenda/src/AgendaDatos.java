
public class AgendaDatos {
	
	private Contacto[] contactos;
	
	public AgendaDatos() {//aquí creo los constructores manualmente
		this.contactos = new Contacto[3];
	}
	
	public AgendaDatos(int tamaño) {//constructor
		this.contactos = new Contacto[tamaño];
	}
	
	public void añadirContacto(Contacto c) { //aqui se añade contacto 
		
		if(existeContacto(c)) {
			System.out.println("El contacto con ese nombre ya existe");
		}else if(agendaLlena()){
			System.out.println("La agenda esta llena, no se pueden añadir más contactos");
		}else {
		
		boolean encontrado = false;
		for (int i=0; i<contactos.length && !encontrado;i++) {//se recorren los contactos aquí y evitando los nulos
			if(contactos[i]==null) {
				contactos[i]=c;//c es el contacto que pasan
				encontrado=true;
				}
			}
		
		
		if(encontrado) {
			System.out.println("Se ha añadido..");
		}else {
			System.out.println("No se ha podido añadir..");

		}
	}
}
	
	public boolean existeContacto(Contacto c) {//hare un metodo que me diga si existe o no
		
		for (int i=0; i<contactos.length;i++) {//se recorren los contactos aquí y evitando los nulos
			if(contactos[i]!=null && c.equals(contactos[i])) {// si es distinto de null y el contacto que estamos revisando es igual al contacto que estoy revisando sales
				return true;
			}
		}
		return false;//si nunca se mete es que no existe
	}
	
	public void listaContactos() {
		if(huecosLibre() == contactos.length){
		System.out.println("No hay contactos que mostrar");	
			
		}else {
			for(int i=0;i<contactos.length;i++) {
				if(contactos[i]!=null) {//aqui se controlan nulos
					System.out.println(contactos[i]);
				}
			}
			
		}
		
	}
	
	public void buscarConNombre(String nombre) {
		
		boolean encontrado = false;
		for (int i=0;i<contactos.length && !encontrado;i++) {
			if (contactos[i] !=null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("Su telefono es " + contactos [i].getTelefono());//se puede mostrar el telefono
				encontrado = true;
				
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado el contacto");
		}
	}
	public boolean agendaLlena() {
		
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i] ==null ) {//se indica que la agenda no esta llena
				return false;
			}
		}	
		return true;// está llena
	}
	public void eliminarContacto(Contacto c) {
		
		boolean encontrado = false;
		for(int i=0;i<contactos.length && !encontrado;i++) {
		if(contactos[i]!=null && contactos[i].equals(c)) {
			contactos[i]=null;
			encontrado=true;
		}
	}
	if(!encontrado) {
		System.out.println("Se ha eliminado el contacto");
	}else {
		System.out.println("No se ha eliminado el contacto");
	}
}
	public int huecosLibre() {
		
		int contadorLibre=0;
		for (int i=0;i<contactos.length;i++) {
			if (contactos[i] ==null ) {
				contadorLibre++;
			}
		}
		return contadorLibre;		
	}
}