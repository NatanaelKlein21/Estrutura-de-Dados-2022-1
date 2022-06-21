package listaDuplamenteEncadeada;

public class ListaDE {
	
	private Nodo inicio;
	
	public ListaDE() {
		this.inicio = null;
	}
	
	// insere no final
	public void insereFinal(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(null);
		novo.setAnt(null);
		
		if(this.inicio == null)
			this.inicio = novo;
		else {
			Nodo aux = this.inicio;
			while(aux.getProx() != null)
				aux = aux.getProx();
			aux.setProx(novo);
			novo.setAnt(aux);
			
		}
	}
	
	// insere no inicio
	public void insereInicio(int valor) {
		Nodo novo = new Nodo();
		novo.setValor(valor);
		novo.setProx(null);
		novo.setAnt(null);
		
		if(this.inicio == null)
			this.inicio = novo;
		else {
			novo.setProx(this.inicio);
			this.inicio.setAnt(novo);
			this.inicio = novo;
		}
	}
	
	// pesquisa antes de remover
	public Nodo Pesquisa(int valor) {
		Nodo aux = this.inicio;
		if(aux != null) {
			while(aux != null && aux.getValor()!= valor )
				aux = aux.getProx();
		}
		return aux;
	}
	// remocao de um nodo por valor
	public void removePorValor(int valor) {
		Nodo aux = Pesquisa(valor);
		if(aux == null)
			System.out.println("Valor n�o encontrado!");
		else {
			if(aux.getAnt() != null)
				aux.getAnt().setProx(aux.getProx());
			else
				this.inicio = aux.getProx();
			if(aux.getProx() != null)
				aux.getProx().setAnt(aux.getAnt());
			
			aux = null;
		}
	}
	
	
	public void Imprime() {
		Nodo aux = this.inicio;
		if(aux == null)
			System.out.println("Lista vazia!");
		else {
			while(aux != null) {
				System.out.println("Valor: "+aux.getValor());
				aux = aux.getProx();
			}
		}
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}

}
