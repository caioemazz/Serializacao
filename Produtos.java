import java.io.Serializable;

public class Produtos implements Serializable{
    public String nome,serial;
    public int ID;

    public Produtos(String nome, String serial, int ID) {
        this.nome = nome;
        this.serial = serial;
        this.ID = ID;
    }

    public String getDados() {
        return "Nome: " + nome + "\n" + "Serial: " + serial + "\n" + "ID: " + ID;
    }
} 