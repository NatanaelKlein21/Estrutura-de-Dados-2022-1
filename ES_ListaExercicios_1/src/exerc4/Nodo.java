package exerc4;

public class Nodo {

	private int valor;
	private Nodo proximo;
	private Nodo anterior;

	public Nodo() {
		this.valor = 0;
		this.proximo = null;
		this.anterior = null;

	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getProximo() {
		return proximo;
	}

	public void setProximo(Nodo proximo) {
		this.proximo = proximo;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

}
