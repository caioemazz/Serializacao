import java.io.IOException;

public class Principal {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serializar serializa = new Serializar();
        serializa.Serializar();        

        Deserializar des = new Deserializar();
        des.Deserializar();

    }
}