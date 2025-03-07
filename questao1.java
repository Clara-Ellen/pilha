import java.util.Scanner;
import java.util.Stack;

public class questao1 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Stack<String> API = new Stack<>();


        int alt;

        do{
            System.out.println("Menu Principal");
            System.out.println("1- Adicionar Livro à Pilha");
            System.out.println("2- Consultar Livro da Pilha");
            System.out.println("3- Remover Livro da Pilha");
            System.out.println("4- Esvaziar Livros da Pilha");
            System.out.println("5- Sair");
            System.out.print("Escreva a alternativa:");
            alt= entrada.nextInt();
            
            switch(alt){

                case 1:
                adicionar(API);
                break;

                case 2:
                consultar(API);
                break;

                case 3:
                remover(API);
                break;

                case 4:
                esvaziar(API);
                break;

                case 5:
                System.out.println("Fechando programa\n");
                break;

                default:
                System.out.println("Alternativa errada, por favor escolha certo\n");
            }
         }while(alt != 5);

        entrada.close();
         

    }

    private static void esvaziar(Stack<String>API){
        if (!API.isEmpty()) {
            boolean livro;
            livro= API.removeAll(API);
            System.out.println("A lista foi apagada\n");
            
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void remover(Stack<String>API){
        if (!API.isEmpty()) {
            String livro;
            livro= API.pop();
            System.out.println("Livro" + livro + " foi removido\n");
            
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void consultar(Stack<String>API){
        if(!API.isEmpty()){
            String livro;
            int livro2;
            livro= API.peek();
            System.out.println("Livro do topo:" + livro + "\n");
            livro2 = API.size();
            System.out.println("Quantidade de livros:" + livro2 + "\n");
            
            
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void adicionar(Stack<String>API){
        Scanner ent= new Scanner(System.in);
        String titulo;
        System.out.println("Escreva o título do livro:");
        titulo = ent.nextLine();
        API.push(titulo);
        System.out.println("Livro adicionado à pilha\n");
    }
    

}