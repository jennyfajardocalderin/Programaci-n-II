package citybike;

public class Mecanica extends Bicicleta {

	public Mecanica(boolean operativa) {
		super(operativa);
	}
	
	public Mecanica() {
		super();
	}
	
	@Override
	public String toString() {
		return "Mecanica ["+ getNumero() + "]";
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return "M" + this.getNumero();
	}

	@Override
	public boolean usable() {
		// TODO Auto-generated method stub
		if(this.isOperativa()) return true;
		return false;
	}
	
}
