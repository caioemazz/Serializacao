import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serializar {
    public static Scanner s;
    
    public Serializar () throws IOException {
        s = new Scanner(System.in);

        System.out.println("Inseira o nome do produto:");
        String nome = s.nextLine();
        System.out.println("Insira o serial do produto");
        String serial = s.nextLine();
        System.out.println("Insira a marca do produto");
        String marca = s.nextLine();
        System.out.println("Inseira o modelo do produto:");
        String modelo = s.nextLine();
        System.out.println("Insira o preço do produto");
        int preco = s.nextInt();
        System.out.println("Inseira polegadas do produto:");
        String polegadas = s.nextLine();
        System.out.println("Insira voltagem do produto");
        String voltagem = s.nextLine();

        Televisao TV = new Televisao(nome, serial, 1, marca, modelo, preco, polegadas, voltagem);

        FileOutputStream arquivo = new FileOutputStream("C:/Users/107573/Desktop/ProdutosJava/teste.txt");
        ObjectOutputStream out = new ObjectOutputStream(arquivo); 
        out.writeObject(TV);
        out.close(); 
    }

    public void Serializar() {
    }
}
