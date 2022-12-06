
public class Robot {
	public Robot() {
		this.x = 0;
		this.y = 0;
	}
	//funcion mover
	public void mover(int valorX, int valorY) {
		if(this.x < 10 && this.y <10) {//e && significa y
			if((valorX== 1 || valorX== -1) && valorY == 0) { // las dos barras son or
				this.x = this.x+ valorX;//tienes que sumarle el valor de la variable al atributo para que sea recursivo
			}else if (valorX == 0 && (valorY==1|| valorY==-1)) {
				this.y = this.y + valorY;
			}
			
			System.out.println("Posicion de Robbie es : " + this.x + "," + this.y + "\n");
		}
	}
	
	
	
	
	//Getters y Setters
	public int getY() {
		return y;
	}
	public void setY(int y) {//this solo puede llamar a variables que son atributos
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	//Atributos
	private int y; //generar un constructor usando los atributos
	private int x; //constructor es un metodo que sirve para inicializar los atributos, p
}
