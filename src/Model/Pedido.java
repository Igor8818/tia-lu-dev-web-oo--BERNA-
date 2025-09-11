package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public int id;
    public LocalDate data;
    public String status;
    private List<ItemPedido> itens;

    public Pedido(LocalDate data, int id, String status) {
        this.data = data;
        this.id = id;
        this.status = status;
        this.itens = new ArrayList<>();
    }

    public void adicionar(ItemPedido item) {
        this.itens.add(item);
    }

    public void mostrarPedido() {
        System.out.println("Detalhes do Pedido #" + this.id);
        System.out.println("Status: " + this.status);
        System.out.println("Itens do Pedido:");
        for (ItemPedido item : this.itens) {
            System.out.println("- " + item.getQuantidade() + "x " + item.getItemCardapio().getNome() +
                    " (R$ " + item.getPrecoUnit() + ")");
        }
    }


    public LocalDate getData() {
        return data;
    }

}