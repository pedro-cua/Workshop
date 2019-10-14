/* CoupeOrder.java 
	Implementaod por: 
	Pedro Miguel Cua Sic
	Seccion B
	Carne: 19001516
*/
package whorkshop.orders;
import java.util.Random;

public class CoupeOrder extends PaintOrder implements state{
	Random r = new Random();
	protected double timeCoupe; 
	protected static int correlativo = 0;
	protected int precio;
	int cant = (int)(Math.random()*5+1);
	int des = (int)(Math.random()* 5 + 5);
	
	public CoupeOrder(int number, String plate, int total, double time, double timeCoupe, int precio){
		super(number, plate, total, time);
		this.timeCoupe = timeCoupe;
		this.precio = precio;
	}
	
	@Override
	public void getType(){
		System.out.println("COUPE");
	}
	
	@Override
	public void getPrice(){
		if(!state.equals(total)){
			String r = "?";
			return r;
		}else if(state == total){
			String pago = this.total*this.precio;
			System.out.println("Precio subtotal: " +pago);4
			System.out.println("Descuento: ") + des+"%");
			int a = (pago * 0.0 des);
			System.out.println("Total a pagar: " + a);
		}
	}
	
	@Override 
	public void end(){
		this.state = this.state.DONE;
	}

	@Override
	public void getOrder(){
		this.number = ++correlativo;
	}

	@Override
	public void getPainted(){
		if(state < total){
			int pintado = this.getState;
			return pintado;
		}return null;
	}	

	@Override
	public void getTotal(){
		return this.cant;
	}

	@Override
	public void getTime(){
		return this.timeCoupe = timeCoupe;
	}

	@Override
	public void getLicensePlate(){
		int numPlaca = (int)(Math.random()*99+1);
		int D3 = (int)(Math.random()*10);
		int L1 = r.nextInt(26)+65;
		int L1 = r.nextInt(26)+65;
		int L1 = r.nextInt(26)+65;
		char letra1 = (char)(L1);
		char letra2 = (char)(L2);
		char letra3 = (char)(L3);
		String plate = numPlaca + D3 + letra1 + letra2 + letra3;
		return plate;
	}

	@Override 
	public void getState(){
		String estado;
		if(painted == total){
			estado = state.DONE;
		}else if(painted < total || painted = 1){
			estado = state.PROCESSING;
		}else if(painted = 0){
			estado = state.WAITING;
		}return estado;
	}
}

