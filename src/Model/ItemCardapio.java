package Model;

public class ItemCardapio {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private double preco;

    public ItemCardapio(String nome, double preco) {

        this.id = proximoId;
        proximoId++;

        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionar(){

    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Preço: R$" + String.format("%.2f", preco);
    }
}