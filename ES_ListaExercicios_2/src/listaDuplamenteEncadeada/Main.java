package listaDuplamenteEncadeada;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String nome;
		int codigo,valor; 
		int controle;
		
		ListaDE lista = new ListaDE();
		
		do {

            System.out.println(
            		"\n--------------------------------\n"
            		+"\nESCOLHA UMA DAS OPCOES ABAIXO: \n"
                    + "(1) Inserir o nodo na lista\n"
                    + "(2) Remover o nodo da lista\n"
                    + "(3) Imprimir a lista\n"
                    + "(4) Informar o numero de nodos\n"
                    + "(5) Pesquisar codigo\n"
                    + "(0) Sair\n"
            		+"\n--------------------------------\n");
            
            controle = leitor.nextInt();

            switch(controle) {

            /////// SAIR
            case 0:
            	System.out.println("COMANDOS FINALIZADOS!");
                break;
            /////// INSERIR
            case 1:
                System.out.println("\n--------------------------------\n"
                					+"Digite o codigo para cadastrar: ");
                codigo = leitor.nextInt();
                if(lista.Verificacao(codigo)) {
                    System.out.println("CODIGO EM USO");
                    break;
                }else {
                    System.out.println("Digite o nome para cadastrar:");
                    nome = leitor.next();
                    lista.insereLista(codigo, nome);
                }
                break;
            /////// REMOVER
            case 2:
                System.out.println("\n--------------------------------\n"
                					+"Digite o codigo para remover: ");
                valor= leitor.nextInt();
                lista.removePorValor(valor);
                break;
            /////// IMPRIME
            case 3:
            	System.out.println("\n--------------------------------\n");
                lista.Imprime();
                break;
            /////// NODOS
            case 4:
            	System.out.println("\n--------------------------------\n");
                lista.contador();
                break;
            /////// PESQUISAR    
            case 5:
                System.out.println("\n--------------------------------\n"
                					+"Digite o codigo para pesquisa: ");
                valor = leitor.nextInt();
                lista.Pesquisa(valor);
                break;
            }
        }while(controle!=0);
		
		
	}

}
