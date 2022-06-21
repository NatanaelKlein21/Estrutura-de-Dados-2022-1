package exerc2;

public class Fila {

	private Nodo inicio;

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Fila() {
		this.inicio = null;
	}

	public void insereFinal(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);

		if (this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = inicio;
			while (aux.getProximo() != null)
				aux = aux.getProximo();
			aux.setProximo(novo);
		}
	}

	public void ApagaInicio() {
		if (this.inicio != null) {
			Nodo aux = this.inicio;
			this.inicio = this.inicio.getProximo();
			aux = null;
		} else
			System.out.println("Lista Vazia");
	}

	public void print() {
		if (this.inicio == null)
			System.out.println("Lista vazia!");
		else
			for (Nodo aux = this.inicio; aux != null; aux = aux.getProximo())
				System.out.println(aux.getValor());
	}

	public void Pesquisa(int valor) {
		Nodo aux = this.inicio;
		int cont = 1;
		if (this.inicio == null)
			System.out.println("Alista está vazia!");
		else
			while (aux != null && aux.getValor() != valor) {
				aux = aux.getProximo();
				cont++;
			}
		if (aux != null)
			System.out.println("valor encontrado: " + cont);
		else
			System.out.println("Valor não encontrado");
	}
}
