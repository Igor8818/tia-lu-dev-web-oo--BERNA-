package Model;

public class Cliente {

    private static int proximoId = 1; // Contador estático
    private int id;
    private String nome;
    private String telefone;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = proximoId;
        proximoId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

}