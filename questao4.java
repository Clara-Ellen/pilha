import java.util.Scanner;
import java.util.Stack;

public class questao4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Stack<String> API = new Stack<>();

        int alt;

        do{
            System.out.println("Menu Principal");
            System.out.println("1- Iniciar Pilha");
            System.out.println("2- Adicionar web");
            System.out.println("3- Remover web");
            System.out.println("4- Sair");
            System.out.print("Escreva a alternativa:");
            alt= entrada.nextInt();

            switch(alt){

                case 1:
                iniciar(API);
                break;

                case 2:
                adicionar(API);
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
        
    }while(alt != 3);

    entrada.close();
}
    private static void iniciar(Stack<String>API){
        Stack<String> pilha = new Stack<>();
    }

    private static void remover(Stack<String>API){
        if (!API.isEmpty()) {
            String web;
            web= API.pop();
            System.out.println("https/www." + web + ".com.br foi removida da pilha\n");
            
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void adicionar(Stack<String>API){
        Scanner ent= new Scanner(System.in);
        String web;
        System.out.println("Escreva a web:");
        web = ent.nextLine();
        API.push(web);
        System.out.println("https/www." + web + ".com.br foi adicionada à pilha\n");
    }
}
