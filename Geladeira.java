public class Geladeira extends Produtos {
    public String marca;
    public String modelo;
    public double preco;
    public String polegadas;
    public String voltagem;

    public Geladeira(String nome, String serial, int ID, String marca, String modelo, double preco, String polegadas, String voltagem) {
        super(nome, serial, ID);
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;  
        this.polegadas = polegadas;
        this.voltagem = voltagem;
    }

    public String getDados() {
         return "Nome: " + nome + "\n" + "Marca: " + marca + "\n" +  "Modelo: " + modelo + "\n" + "Preço: " + preco;
    }
}