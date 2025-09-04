import java.util.Scanner;
public class Menu {
    int op = 0;
    static Scanner sc=new Scanner(System.in);

   public static void iniciar(){
        System.out.println("========================================");
        System.out.println("         SISTEMA DE DELIVERY");
        System.out.println("========================================");

        System.out.println("O que deseja fazer? ");
        System.out.println("[1] Gerenciamento de Cardápio: ");
        System.out.println("[2] Gerenciamento de Clientes: ");
        System.out.println("[3] Gerenciamento de Pedidos: ");
        System.out.println("[4] Relatórios: ");
        System.out.println("Digite aqui: ");
        int op=sc.nextInt();

    }


}
