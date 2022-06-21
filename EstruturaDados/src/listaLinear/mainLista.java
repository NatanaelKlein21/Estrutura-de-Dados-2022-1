package listaLinear;

public class mainLista {

	public static void main(String[] args) {
		//Cria lista
		Lista lista = new Lista();
		
		//Insere na lista vazia
		//lista.insereListaVazia(34);
		
		//lista.insereInicio(89);
		
		//Insere no final da lista
		lista.insereFinal(34);
		lista.insereFinal(2);
		lista.insereFinal(23);
		lista.insereFinal(50);
		lista.RemoveInicio();
		//Imprime a lista
		lista.print();
		System.out.println("--------");
		//Remove do final da lista
		//lista.RemoveFinal();
		//lista.RemoveFinal();
		//lista.RemoveFinal();
		//lista.RemoveFinal();
		//Imprime a lista
		//lista.print();
		//lista.Pesquisa(89);
		
		
		
	}
}
