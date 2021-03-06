package listaDuplamenteEncadeada;

public class Nodo {
	
	private String nome;
	private int codigo;
	private Nodo proximo;
	private Nodo anterior;
	
	
	public Nodo() {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.proximo = proximo;
		this.anterior = anterior;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
