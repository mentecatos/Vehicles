package vehiculos;

public class Vehicle {
	private final int velocitat_maxima = 120;
	private int cilindrada;
	private int portes;
	private int velocitat_actual = 0;


	//CONTROL ACCELERACIO-------

	public void accelerar(){
		while(this.velocitat_actual < velocitat_maxima){
			this.velocitat_actual += 10;
		}
	}

}
