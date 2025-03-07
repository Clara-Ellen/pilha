import java.util.Scanner;
import java.util.Stack;

public class questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Stack<String> API = new Stack<>();

        int alt;

        do{
            System.out.println("Menu Principal");
            System.out.println("1- Adicionar Tarefas");
            System.out.println("2- Obter Tarefas");
            System.out.println("3- Sair");
            System.out.print("Escreva a alternativa:");
            alt= entrada.nextInt();

            switch(alt){

                case 1:
                adicionar(API);
                break;

                case 2:
                obter(API);
                break;

                case 3:
                System.out.println("Fechando programa\n");
                break;

                default:
                System.out.println("Alternativa errada, por favor escolha certo\n");

        }
        
    }while(alt != 3);

    entrada.close();
}
     


    private static void obter(Stack<String>API){
        if(!API.isEmpty()){
            String tarefa;
            int tarefa2;
            String tarefa3;
            tarefa= API.peek();
            System.out.println("Proxima tarefa:" + tarefa + "\n");
            tarefa3= API.pop();
            tarefa2 = API.size();
            System.out.println("Quantidade de tarefas:" + tarefa2 + "\n");
        }else{
            System.out.println("A pilha está vazia\n");
        }
    }

    private static void adicionar(Stack<String>API){
        Scanner ent= new Scanner(System.in);
        String titulo;
        System.out.println("Escreva a tarefa:");
        titulo = ent.nextLine();
        API.push(titulo);
        System.out.println("Tarefa adicionado à pilha\n");
    }

}

