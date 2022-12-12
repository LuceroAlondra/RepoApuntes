import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaBancaria {

	private String nombreCompleto;
	private String iban;
	private double saldo; //generate to strings, puedes ver el estado de la cuenta.
	Movimiento[] movimiento = new Movimiento[100];//creo array de objeto Movimiento ya que engloba todos los atributos en cada posicion. 
	
	public CuentaBancaria() {}//constructor que permite crear el objeto sin datos
	
	public void setCuentaBancaria(String nombreCompleto, String iban) {

		Pattern pat = Pattern.compile("[A-Z a-z]{2}[0-9]{4}"); //crear patron
		Matcher mat = pat.matcher(iban);//comprobar patron
		if(mat.matches()) {
			this.nombreCompleto = nombreCompleto;
			this.iban = iban;
			this.saldo = 0;//cada vez que se crea una cuenta bancaria se iguala a 0.
			for(int i = 0; i<movimiento.length; i++) { //por cada movimiento se crea un objeto movimiento "cada posicion es un objeto de movimiento"
				movimiento[i] = new Movimiento();
				movimiento[i].setCuentabancaria(this);//aqui se rellena el movimiento e indica el actual	 
				}
			} else {
				this.nombreCompleto = "";
				System.out.println("El IBAN no es válido");
				}
		}

	@Override
	public String toString() {
		return "CuentaBancaria [nombreCompleto=" + nombreCompleto + ", iban=" + iban + ", saldo=" + saldo + "]";
	}
	//aquí genero mis getters and setters para poder adquirir info en la cuentaprincipal
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = this.saldo+saldo; //recursiva para que pueda ser actualizado el monto sobre si mismo
	}

	public String getIban() {
		return iban;
	}
	
}
