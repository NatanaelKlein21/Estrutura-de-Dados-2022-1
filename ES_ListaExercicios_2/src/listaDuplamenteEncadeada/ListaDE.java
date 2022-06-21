package listaDuplamenteEncadeada;

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
	
	/////////////////////// INSERE LISTA ////////////////////////////
	public void insereLista(int codigo, String nome) {
		Nodo novo = new Nodo();
		novo.setCodigo(codigo);
		novo.setNome(nome);
		novo.setAnterior(null);
		novo.setProximo(null);
		
		Nodo aux = this.inicio;
		if (this.inicio == null) {
			this.inicio = novo;
			return;
		} else if(this.inicio.getCodigo()>=novo.getCodigo()) {
			novo.setProximo(inicio);
			this.inicio.setAnterior(novo);
			this.setInicio(novo);
			return;
		}
		
		while(aux.getProximo()!=null) {
			if(aux.getProximo().getCodigo()>novo.getCodigo()) {
				aux.getProximo().setAnterior(novo);
				novo.setProximo(aux.getProximo());
				aux.setProximo(novo);
				novo.setAnterior(aux);
				return;
			}
			aux=aux.getProximo();
		}
		aux.setProximo(novo);
		novo.setAnterior(aux);
		}
			
	/////////////////////// VERIFICACAO ////////////////////////////	
	public boolean Verificacao(int codigo) {
		Nodo aux = this.inicio;
		
		while(aux!=null) {
			if(codigo==aux.getCodigo()) {
				return true;
		}
			aux=aux.getProximo();
		}
		
		return false;
	}
	
	/////////////////////// IMPRIME ////////////////////////////
	public void Imprime() {
		Nodo aux = this.inicio;
		if (aux == null)
			System.out.println("Lista Vazia");
		else
			while (aux != null) {
				System.out.println(aux.getCodigo()+aux.getNome());
				aux = aux.getProximo();
			}
		}
	
	/////////////////////// CONTADOR ////////////////////////////
	public void contador() {
		Nodo aux = this.inicio;
		int count = 0;
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
	
	/////////////////////// PESQUISA ////////////////////////////
	public Nodo Pesquisa(int valor) {
        Nodo aux = this.inicio;
        int count = 0;
        while (aux != null) {
            count++;
            if (aux.getCodigo() == valor) {
                System.out.println("Posição: "+ count);
            }else if (aux==null) {
                 System.out.println("Código Inexistente");
             }
            aux = aux.getProximo();
        }
        return aux;
    } 

	/////////////////////// REMOVER POR VALOR ////////////////////////////
	// Pesquisar antes de remover
	public Nodo PesquisaPorValor(int valor) {
		Nodo aux = this.inicio;
		if(aux != null) {
			while(aux != null && aux.getCodigo()!= valor )
				aux = aux.getProximo();
		}
		return aux;
	}
	
	public void removePorValor(int valor) {
		Nodo aux = PesquisaPorValor(valor);
		if (aux == null) {
			System.out.println("Codigo nao encontrado");
		} else {
			if (aux.getAnterior() != null)
				aux.getAnterior().setProximo(aux.getProximo());
			else
				this.inicio = aux.getProximo();
			if (aux.getProximo() != null)
				aux.getProximo().setAnterior(aux.getAnterior());
				System.out.println("Codigo removido");

			aux = null;
		}
	}
	
}
