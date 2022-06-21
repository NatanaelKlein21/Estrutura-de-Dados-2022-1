package exerc3;



public class mainLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaCircular listaCircular = new ListaCircular();
		
		listaCircular.inserirInicio(1);
		listaCircular.inserirInicio(2);
		listaCircular.inserirFinal(3);
		listaCircular.inserirFinal(4);
		
		
		listaCircular.imprimir();
		listaCircular.pesquisar(3);

	}


}
