import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {
    public void deserializar () throws IOException, ClassNotFoundException  {
        FileInputStream arq = new FileInputStream("C:/Users/107573/Desktop/ProdutosJava/teste.txt"); 
        ObjectInputStream in = new ObjectInputStream( arq );
        
        Televisao TV = (Televisao) in.readObject();
        
        System.out.println(TV.getDados()); 
        in.close();
    }

    public void Deserializar() {
    }
 
}
