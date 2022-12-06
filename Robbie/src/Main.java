import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robbie =new Robot(); //creando robot robbie
		Scanner reader = new Scanner(System.in);
		//tipo de dato objeto de la clase robot, un nombre elatorio= nuevo objeto
		do {
			System.out.println("Introduzca movimiento para Robbie: ");
			
			System.out.println("Movimiento en X: ");
			int movimientoX = reader.nextInt();
			
			System.out.println("Movimiento en Y: ");
			int movimientoY = reader.nextInt();
			
			
		robbie.mover(movimientoX, movimientoY);	
			
		}while(true);
	}

}
