package citybike;

public class Electrica extends Bicicleta {
	private double bateria;

	public Electrica(boolean operativa, double bateria) {
		super(operativa);
		this.bateria = bateria;
	}

	public Electrica() {
		super();
		this.bateria = 0;
	}
	
	public double getBateria() {
		return bateria;
	}

	public void setBateria(double bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Electrica [" + this.getNumero() + ", bateria=" + bateria + "]";
	}
	
}
