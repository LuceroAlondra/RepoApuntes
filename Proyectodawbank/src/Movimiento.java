import java.time.LocalDate; //Importamos local date time para guardar la fecha del momento
import java.time.format.DateTimeFormatter; //importo para cambiar formato
public class Movimiento {

	private String idmovimiento;
	private String fechamovimiento;
	private String tipomovimiento;
	private double cantidad;
	private CuentaBancaria cuentabancaria;//se añade cuenta bancaria
	
	public void setMovimiento(String idmovimiento, String tipomovimiento, double cantidad) {//condiciones para recibir datos (los que están aquí)
		LocalDate primerafecha = LocalDate.now();//nos registra el dia de hoy con el formato año/mes/dia
		DateTimeFormatter fechafinal = DateTimeFormatter.ofPattern("dd-MM-yyyy");//Guardamos el tipo de formato que deseamos dia/mes/año
		String formattedDate = primerafecha.format(fechafinal);//Aqui le pasamos el formato a la variable final con el resultado que queremos
		this.idmovimiento = idmovimiento;
		this.fechamovimiento = formattedDate;
		this.tipomovimiento = tipomovimiento;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() { //funcion mostrar info movimiento
		return "Movimiento [idmovimiento=" + idmovimiento + ", fechamovimiento=" + fechamovimiento + ", tipomovimiento="
				+ tipomovimiento + ", cantidad=" + cantidad + ", cuentabancaria=" + cuentabancaria + "]";
	}
	//Creo setters y getters
	public String getIdmovimiento() {
		return idmovimiento;
	}
	
	public void setIdmovimiento(String idmovimiento) {
		this.idmovimiento = idmovimiento;
	}
	
	public String getFechamovimiento() { //Se coloca en LocalDateTime para que el return te devuelva el objeto.
		return fechamovimiento;
	}
	
	public void setFechamovimiento(String fechamovimiento) {//En vez de int se necesita LocalDateTime.
		this.fechamovimiento = fechamovimiento;
	}
	
	public String getTipomovimiento() {
		return tipomovimiento;
	}
	
	public void setTipomovimiento(String tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public CuentaBancaria getCuentabancaria() {
		return cuentabancaria;
	}
	
	public void setCuentabancaria(CuentaBancaria cuentabancaria) {
		this.cuentabancaria = cuentabancaria;
	}
	
}
