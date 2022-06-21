package arvoreBinaria;

public class ArvoreBinaria {
	
	private Nodo raiz;
	
	public Nodo getRaiz() {
		return raiz;
	}
	
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	
	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	public void insereNaoRecursiva(int valor) {
		Nodo novo = new Nodo(valor);
		
		if(raiz == null)
			raiz = novo;
		else {
			Nodo aux = this.raiz;
			boolean inseriu = false;
			while(!inseriu) {
				if(novo.getValor() < aux.getValor()) {
					if(aux.getEsquerda() != null)
						aux = aux.getEsquerda();
					else {
						aux.setEsquerda(novo);
						inseriu = true;
					}
				}
				else {
					if(aux.getDireita() != null)
						aux =aux.getDireita();
					else {
						aux.setDireita(novo);
						inseriu = true;
					}
				}
			}
		}
	}
	
	public void insereRecursiva(Nodo aux, int valor) {
		if(aux != null) {
			if(valor < aux.getValor()) {
				if(aux.getEsquerda() != null)
					insereRecursiva(aux.getEsquerda(), valor);
				else
					aux.setEsquerda(new Nodo(valor));
					System.out.println("Inseriu"+valor+ " a esquerda de "+aux.getValor());
			}
			else 
				if(valor > aux.getValor()) {
					if(aux.getDireita() != null)
						insereRecursiva(aux.getDireita(), valor);
					else
						aux.setDireita(new Nodo(valor));
					System.out.println("Inseriu"+valor+ " a direita de "+aux.getValor());
				}
		}
		else {
			setRaiz(new Nodo(valor));
			System.out.println("Inseriu "+valor+" na raiz");
		}
		}
	
	public void imprime(Nodo aux) {
		if(aux != null) {
			System.out.println(aux.getValor());
			imprime(aux.getEsquerda());
			imprime(aux.getDireita());
		}
	}
}
