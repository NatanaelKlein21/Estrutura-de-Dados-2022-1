package exerc2;

import exerc4.Nodo;

public class Pilha {

	private Nodo inicio;

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

	public Pilha() {
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

	public void RemoveFinal() {
		Nodo aux;
		if (this.inicio != null)
			if (this.inicio.getProximo() == null)
				this.inicio = null;
			else {
				aux = inicio;
				while (aux.getProximo().getProximo() != null)
					aux = aux.getProximo();
				aux.setProximo(null);
			}
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
