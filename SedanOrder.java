/* SedanOrder.java 
	Implementaod por: 
	Pedro Miguel Cua Sic
	Seccion B
	Carne: 19001516
*/
package whorkshop.orders;
import java.util.Random;

public class SedanOrder extends PaintOrder implements Thread{
	Random r = new Random();
	protected double timeSedan; //tiempo recibido desde el args[2]
	protected static int correlativo = 0;
	protected int precio;
	int cant = (int)(Math.random()*5+1);
	
	public SedanOrder(int number, String plate, int total, double time, double timeSedan, int precio){
		super(number, plate, total, time);
		this.timeSedan = timeSedan;
		this.precio = precio;
	}
	
	while(true){	
		try{
			@Override
			public void getType(){
				System.out.println("SEDAN");
			}
		
			@Override
			public void getPrice(){
				if(!state.equals(total)){
					System.out.println("?");
				}else if(state = total){
					String pago = this.total*this.precio;
					return pago;
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
				}
			}	
		
			@Override
			public void getTotal(){
				return this.cant;
			}
		
			@Override
			public void getTime(){
				return this.timeSedan = this.timeSedan;
			}
		
			@Override
			public void getLicensePlate(){
				int numPlaca = (int)(Math.random()*999+1);
				int L1 = r.nextInt(26)+65;
				int L1 = r.nextInt(26)+65;
				int L1 = r.nextInt(26)+65;
				char letra1 = (char)(L1);
				char letra2 = (char)(L2);
				char letra3 = (char)(L3);
				String plate = numPlaca + letra1 + letra2 + letra3;
				return plate;
			}
		
			@Override 
			public void getState(){
				String estado;
				if(painted == total){
					estado = state.DONE;
				}else if(paintes < total){
					estado = state.PROCESSING;
				}else if(painted == 0){
					estado = state.WAITING;
				}return estado;
			}
		}catch (Exception e){
			e.pintStakTrace;
		}
	}
}
				
