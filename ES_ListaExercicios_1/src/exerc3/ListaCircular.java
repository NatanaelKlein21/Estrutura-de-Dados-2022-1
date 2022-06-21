package exerc3;

public class ListaCircular {
	private Nodo inicio;

	// Inserir no inicio
	public void inserirInicio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);
		if (this.inicio == null) {
			this.inicio = novo;
			novo.setProximo(inicio);
		} else if (this.inicio.getProximo() == this.inicio) {
			Nodo aux = this.inicio;
			this.inicio = novo;
			novo.setProximo(aux);
			aux.setProximo(novo);

		} else {
			Nodo aux2 = this.inicio;
			Nodo aux = this.inicio;
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			this.inicio = novo;
			aux.setProximo(novo);
			novo.setProximo(aux2);
		}
	}

	// Remover no inicio
	public void removerInicio() {

		Nodo aux = this.inicio;
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else if (aux.getProximo() == inicio) {
			this.inicio = null;
			System.out.println("Lista vazia");
		} else {
			Nodo aux2 = this.inicio;
			while (aux.getProximo() != inicio)
				aux = aux.getProximo();
			aux2 = aux2.getProximo();
			this.inicio = aux2;
			aux.setProximo(inicio);
		}
	}

	// Inserir no final
	public void inserirFinal(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);

		if (this.inicio == null) {
			this.inicio = novo;
			novo.setProximo(inicio);
		} else {
			Nodo aux = inicio;
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
			}
			aux.setProximo(novo);
			novo.setProximo(inicio);
		}
	}

	// Remover no final
	public void removerFinal() {

		int cont = 0;
		Nodo aux = this.inicio;
		if (inicio == null) {
			System.out.println("Lista vazia");
		} else if (aux.getProximo() == inicio) {
			this.inicio = null;
			System.out.println("Lista vazia");
		} else {
			while (aux.getProximo() != inicio) {
				aux = aux.getProximo();
				cont++;
			}
			cont--;
			aux = this.inicio;
			for (int i = 0; i < cont; i++)
				aux = aux.getProximo();
			aux.setProximo(inicio);
		}

	}

	// Pesquisar
	public void pesquisar(int valor) {

		Nodo aux = this.inicio;
		int cont = 0;
		if (aux == null) {
			System.out.println("Lista vazia");
		} else if (valor == inicio.getValor()) {
			cont = 1;
			System.out.println("O valor pesquisado esta na posição: " + cont);

		} else {
			aux = aux.getProximo();
			cont = 2;
			while (aux != inicio && aux.getValor() != valor) {
				aux = aux.getProximo();
				cont++;
				if (aux == inicio) {
					cont = 0;
					System.out.println("Valor não encontrado");
				}
			}
			if (cont != 0)
				System.out.println("O valor pesquisado esta na posição: " + cont);
		}
	}

	// Imprimir
	public void imprimir() {
		Nodo aux = inicio;
		if (aux == null) {
			System.out.println("Lista vazia");
		} else {

			while (aux.getProximo() != inicio) {
				System.out.println(aux.getValor());
				aux = aux.getProximo();
			}
			System.out.println(aux.getValor());
		}
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public ListaCircular() {
		this.setInicio(null);
	}

}
