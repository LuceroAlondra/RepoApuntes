import java.util.*;
public class DawBank {
	
	protected int movimientos, retiro, deposito;
	
	
	public static void main(String[] args) { 
		Scanner reader = new Scanner(System.in);
		int counter = 0; //Se crea un contador para poder guardas las posiciones con la informacion empezando desde 0.
		CuentaBancaria cuentabancaria1 = new CuentaBancaria();
		System.out.println("Ingrese su nombre y apellido");
		String nombreCompleto = reader.nextLine();
		
		do {
		System.out.println("Ingrese un IBAN válido\r\n"
				+ "El IBAN contendrá 2 letras (abreviatura de país) y 20 números.");
		String iban1 = reader.next();
		
		cuentabancaria1.setCuentaBancaria(nombreCompleto, iban1); //le pasamos el nombre y el iban
		
		} while(cuentabancaria1.getNombreCompleto().isEmpty());
		
		//System.out.println(cuentabancaria1.toString());//esto logra que se pueda ver el estado de los atributos.
		
		boolean condicion=true; //cuando entra en el 8, se volverá un false
		do {
			System.out.println("1. Datos de la cuenta.\r\n" //se hace copypaste y se ponen automaticamente esos saltos de línea
					+ "2. IBAN.\r\n"
					+ "3. Titular.\r\n"
					+ "4. Saldo.\r\n"
					+ "5. Ingreso.\r\n"
					+ "6. Retirada.\r\n"
					+ "7. Movimientos.\r\n"
					+ "8. Salir.");
			
			int opcion= reader.nextInt();
			switch(opcion) {
			
			case 1:
				System.out.println("Resumen de su cuenta" + cuentabancaria1.toString());
				
				break;
			case 2:
				System.out.println("Su iban es " + cuentabancaria1.getIban()); //obtengo "get" la info saldo
				break;
				
			case 3:
				System.out.println("El nombre completo del titular es : " + cuentabancaria1.getNombreCompleto());
				break;
				
			case 4:
				System.out.println("El saldo de su cuenta es : " + cuentabancaria1.getSaldo());
				break;
				
			case 5:
				System.out.println("Teclee la cantidad que desea ingresar");
				double ingreso = reader.nextDouble();
				cuentabancaria1.setSaldo(ingreso); //se ingresa el saldo en la cuenta
				if(cuentabancaria1.movimiento.length!=counter) {
					cuentabancaria1.movimiento[counter].setMovimiento(("Movimiento" + counter), "Ingreso", ingreso); // aqui se mete la informacion conjunta de movimiento.
					counter++;//String + int = 1 string junto con el entero 	
				}else {
					counter=0;
				}
				
				if(ingreso >= 3000){
					System.out.println("Ingreso superior a 3000, DEBE NOTIFICAR A HACIENDA");	
				}
				break;
				
			case 6:
				System.out.println("Teclee el monto que desea retirar");
				double retirada = reader.nextDouble();
				if((cuentabancaria1.getSaldo() - retirada)<=-50) {
					System.out.println("No puede retirar dinero, saldo insuficiente");
				} else if (cuentabancaria1.getSaldo() - retirada < 0) {
					System.out.println("AVISO SALDO NEGATIVO");
					cuentabancaria1.setSaldo(retirada*-1);//para convertirlo en negativo
					if(cuentabancaria1.movimiento.length!=counter) {
						cuentabancaria1.movimiento[counter].setMovimiento(("Movimiento" + counter), "Retirada", retirada); //fecha, literal y monto retirada
						counter++;
					}else {
						counter=0;
					}
					} else {
					cuentabancaria1.setSaldo(retirada*-1);
					if(cuentabancaria1.movimiento.length!=counter) {
						cuentabancaria1.movimiento[counter].setMovimiento(("Movimiento" + counter),"Retirada", retirada); //fecha, literal y monto retirada
						counter++;	
					}else {
						counter=0;
					}
					}
				
				break;
				
			case 7:
				for (int i = 0; i < cuentabancaria1.movimiento.length; i++) {
					if(cuentabancaria1.movimiento[i].getIdmovimiento() != null) { //si el id movimiento es distinto a null entonces se muestra la operación.
						System.out.println(cuentabancaria1.movimiento[i].toString());	
					}
				}
				break;
				
			case 8:
				condicion = false;//solo pones el nombre de la variable y lo actualizas, tu llamas y trabajas sobre ella
				System.out.println("Gracias por confiar en el banco Lucerito");
				break;
			}
			
			
		}while(condicion);//condicion para que pueda salir
	}
}