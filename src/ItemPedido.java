public class ItemPedido {
    private ItemCardapio itemCardapio;
    int quantidade;
    double precoUnit;

    public ItemPedido(ItemCardapio item, double precoUnit, int quantidade) {
        itemCardapio=item;
        this.precoUnit = item.getPreco();
        this.quantidade = quantidade;
    }

    public ItemCardapio GetItemCardapio(){
        return itemCardapio;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
