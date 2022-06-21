package exerc4;

public class ListaDE {

	private Nodo inicio;

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public ListaDE() {
		this.inicio = null;
	}

	public void InsereInicio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setAnterior(null);
		novo.setProximo(null);

		if (this.inicio == null) {
			this.inicio = novo;
		} else {
			novo.setProximo(this.inicio);
			this.inicio.setAnterior(novo);
			this.inicio = novo;
		}

	}

	public void InsereFinal(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setAnterior(null);
		novo.setProximo(null);

		if (this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = this.inicio;
			while (aux.getProximo() != null)
				aux = aux.getProximo();
			aux.setProximo(novo);
			novo.setAnterior(aux);
		}
	}

	public void Imprime() {
		Nodo aux = this.inicio;
		if (aux == null)
			System.out.println("Lista Vazia");
		else {
			while (aux != null) {
				System.out.println(aux.getValor());
				aux = aux.getProximo();
			}
		}
	}

	public void RemoveInicio() {
		Nodo aux = this.inicio;
		if (aux == null) {
			System.out.println(("Lista Vazia!"));
		} else {
			aux = aux.getProximo();
			this.setInicio(aux);
		}

	}

	public void RemoveFinal() {
		Nodo aux = this.inicio;
		if (aux == null) {
			System.out.println("Lista Vazia!");
		} else {
			if(aux.getProximo()==null) {
				System.out.println("Lista com somente 1 valor");
			}
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux=aux.getAnterior();
			aux.setProximo(null);
		}
	}
}
