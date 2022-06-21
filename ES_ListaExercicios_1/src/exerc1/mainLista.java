package exerc1;

public class mainLista {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.insereInicio(1);
		lista.insereFinal(2);
		lista.insereFinal(3);
		lista.insereFinal(4);
		lista.insereFinal(5);
		lista.InsereMeio(50);
		lista.print();

		System.out.println("---------------");
		lista.valorPosicao(50);
		lista.RemoveMeio();
		lista.print();
		
		System.out.println("---------------");
		
		lista.contador();
		lista.contadorPorValor(4);
		
		System.out.println("--------");
		
		
	
	}

}
