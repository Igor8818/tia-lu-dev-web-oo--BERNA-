public class Client {

    private static int proximoId = 1;
    private int id;
    private String nome;
    private String telefone;

    public Client(String nome, String telefone, int id) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = proximoId;
        proximoId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
