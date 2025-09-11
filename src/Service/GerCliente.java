package Service;

import Model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class GerCliente {
    private List<Cliente> listaCliente;

    public GerCliente() {
        this.listaCliente = new ArrayList<>();
    }

    public void adicionar(String nome, String telefone) {
        Cliente novoCliente = new Cliente(nome, telefone);
        this.listaCliente.add(novoCliente);
        System.out.println("Cliente " + nome + " adicionado com sucesso com o ID: " + novoCliente.getId());
    }

    public void listarTodosClientes() {
        if (listaCliente.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("--- Lista de Clientes ---");
            for (Cliente cliente : listaCliente) {
                System.out.println("ID: " + cliente.getId() + " | Nome: " + cliente.getNome() + " | Telefone: " + cliente.getTelefone());
            }
        }
    }
}