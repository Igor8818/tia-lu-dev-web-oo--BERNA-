package Model;

public class ItemPedido {
    private ItemCardapio itemCardapio;
    private int quantidade;
    private double precoUnit;

    public ItemPedido(ItemCardapio item, int quantidade) {
        this.itemCardapio = item;
        this.quantidade = quantidade;
        this.precoUnit = item.getPreco();
    }

    public ItemCardapio getItemCardapio() {
        return this.itemCardapio;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPrecoUnit() {
        return this.precoUnit;
    }
}