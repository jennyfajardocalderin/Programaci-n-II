package citybike;

import java.util.Objects;

public abstract class Bicicleta {
	private static int contador = 1;
	
	private int numero;
	private boolean operativa;

	public Bicicleta(boolean operativa) {
		super();
		this.numero = Bicicleta.contador;
		Bicicleta.contador++;
		this.operativa = operativa;
	}
	
	public Bicicleta() {
		super();
		this.numero = Bicicleta.contador;
		Bicicleta.contador++;
		this.operativa = true;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Bicicleta.contador = contador;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	public boolean isOperativa() {
		return operativa;
	}

	public void setOperativa(boolean operativa) {
		this.operativa = operativa;
	}

	@Override
	public String toString() {
		return "Bicicleta [numero=" + numero + ", operativa=" + operativa + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bicicleta other = (Bicicleta) obj;
		return numero == other.numero;
	}

	public abstract String getCodigo();
	public abstract boolean usable();
	
}
