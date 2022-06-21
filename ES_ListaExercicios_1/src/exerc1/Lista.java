package exerc1;

public class Lista {

	private Nodo inicio;
	private int contador;

	public Lista() {
		this.inicio = null;
	}

	public void insereInicio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(this.inicio);

		this.inicio = novo;
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

	public void print() {
		if (this.inicio == null)
			System.out.println("Lista vazia!");
		else
			for (Nodo aux = this.inicio; aux != null; aux = aux.getProximo())
				System.out.println(aux.getValor());
	}

	public void InsereMeio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProximo(null);

		System.out.println("a)Inserir um nodo no meio da lista");
		if (this.inicio == null) {
			this.inicio = novo;
		} else {
			Nodo aux = this.inicio;
			contador = 0;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
				contador++;
			}
			aux = this.inicio;
			int contador2 = 1;
			while (contador2 <= contador / 2) {
				aux = aux.getProximo();
				contador2++;
			}
			novo.setProximo(aux.getProximo());
			aux.setProximo(novo);
		}
	}

	public void RemoveMeio() {
		System.out.println("\nb)Remover um nodo do meio da lista;");
		if (this.inicio != null) {
			Nodo aux = this.inicio.getProximo();
			Nodo aux2 = this.inicio;
			if (this.inicio.getProximo() == null)
				this.inicio = null;
			else {
				contador = 0;
				while (aux.getProximo() != null) {
					aux = aux.getProximo();
					contador++;
				}

				int contador2 = 1;
				aux = this.inicio.getProximo();
				aux2 = this.inicio;
				while (contador2 <= contador / 2) {
					aux2 = aux;
					aux = aux.getProximo();
					contador2++;
				}
				aux2.setProximo(aux.getProximo());
				aux = null;
			}

		}

	}

	public void contador() {
		Nodo aux = this.inicio;
		int count = 0;
		System.out.println("c)Informar o numero de nodos da lista;");
		if (aux == null) {
			System.out.println("Lista vazia");
		} else {
			count++;
			while (aux.getProximo() != null) {
				count++;
				aux = aux.getProximo();
			}
		}
		System.out.println("Numeros de nodos da lista: " + count);

	}

	public void contadorPorValor(int valor) {
		Nodo aux = this.inicio;
		int count = 0;
		System.out.println(
				"\nd) Informar o n�mero de vezes que um determinado valor, informado pelo usu�rio, ocorre dentro da lista;");
		if (aux == null) {
			System.out.println("Lista vazia!");
		} else {
			while (aux != null) {
				if (aux.getValor() == valor) {
					count++;
				}
				aux = aux.getProximo();
			}
			System.out.println("O valor informado aparece " + count + " vez");
		}

	}

	public void valorPosicao(int valor) {
		Nodo aux = this.inicio;
		int count = 0;
		System.out.println("e)Informar o valor do nodo presente em uma determinada posi��o informada pelo usu�rio;");
		while (aux != null) {
			count++;
			if (aux.getValor() == valor) {
				System.out.println("Posi��o informada pelo usu�rio: " + count);
			}
			aux = aux.getProximo();
		}
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

}
