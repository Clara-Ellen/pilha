import java.util.Scanner;
import java.util.Stack;

public class questao5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Stack<String> API = new Stack<>();


        int alt;

        do{
            System.out.println("Menu Principal");
            System.out.println("1- Adicionar Tarefa à Pilha");
            System.out.println("2- Checar Tarefa da Pilha");
            System.out.println("3- Remover Tarefa da Pilha");
            System.out.println("4- Sair");
            System.out.print("Escreva a alternativa:");
            alt= entrada.nextInt();
            
            switch(alt){

                case 1:
                adicionar(API);
                break;

                case 2:
                checar(API);
                break;

                case 3:
                remover(API);
                break;

                case 4:
                System.out.println("Fechando programa\n");
                break;

                default:
                System.out.println("Alternativa errada, por favor escolha certo\n");
            }
         }while(alt != 5);

        entrada.close();
         

    }


    private static void remover(Stack<String>API){
        if (!API.isEmpty()) {
            String livro;
            livro= API.pop();
            System.out.println("Tarefa" + livro + " foi removida\n");
            
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void checar(Stack<String>API){
        if(API.isEmpty()){
            System.out.println("Todas as tarefas foram concluidas\n");
            
        }else{
            System.out.println("Ainda há tarefas a concluir\n");
        }
    }

    private static void adicionar(Stack<String>API){
        Scanner ent= new Scanner(System.in);
        String titulo;
        System.out.println("Escreva a tarefa:");
        titulo = ent.nextLine();
        API.push(titulo);
        System.out.println("Tarefa adicionada à pilha\n");
    }
    
}
