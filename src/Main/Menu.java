package Main;

import Service.GerCliente;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public static void iniciar() {
        GerCliente gerCliente = new GerCliente();

        System.out.println("========================================");
        System.out.println("         SISTEMA DE DELIVERY");
        System.out.println("========================================");

        System.out.println("O que deseja fazer? ");
        System.out.println("[1] Gerenciamento de Cardápio: ");
        System.out.println("[2] Gerenciamento de Clientes: ");
        System.out.println("[3] Gerenciamento de Pedidos: ");
        System.out.println("[4] Relatórios: ");
        System.out.println("Digite aqui: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:

                break;

            case 2:

                int operCliente;
                do {
                    System.out.println("\n--- Gerenciamento de Clientes ---");
                    System.out.println("Deseja: [1] Adicionar, [2] Remover, [3] Listar ou [4] Voltar?");
                    System.out.print("Digite: ");
                    operCliente = sc.nextInt();

                    switch (operCliente) {
                        case 1:
                            System.out.print("Digite o nome do cliente: ");
                            String nome = sc.next();
                            System.out.print("Digite o telefone do cliente: ");
                            String telefone = sc.next();
                            gerCliente.adicionar(nome, telefone);
                            break;
                        case 2:
                            System.out.println("Qual cliente você quer remover?");
                            // Lógica de remoção
                            break;
                        case 3:
                            gerCliente.listarTodosClientes();
                            break;
                        case 4:
                            System.out.println("Retornando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } while (operCliente != 4);
                break;


        }
    }
}