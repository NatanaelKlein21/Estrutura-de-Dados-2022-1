package exerc2;

public class mainPF {
	
	 public static void main(String[] args) {
	 Pilha pilha= new Pilha();
	 Fila fila= new Fila(); 
	 System.out.println("pilha");
	 pilha.insereFinal(1);
	 pilha.insereFinal(2);
	 pilha.RemoveFinal();
	 pilha.print();
	 pilha.Pesquisa(3);
	 System.out.println("------");
	 System.out.println("fila");
	 fila.insereFinal(1);
	 fila.insereFinal(2);
	 fila.ApagaInicio();
	 fila.print();
	 fila.Pesquisa(3);
	 }
}
