import java.time.LocalDate;

public class Pedido {
    public int id;
    public LocalDate data;
    public String Status;


    public Pedido(LocalDate data, int id, String status) {
        this.data = data;
        this.id = id;
        Status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
