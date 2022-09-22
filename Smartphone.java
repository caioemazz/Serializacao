public class Smartphone extends Produtos {
    public String marca;
    public String modelo;
    public double preco;
    public String polegadas;
    public String tecnologia;

    public Smartphone(String nome, String serial, int ID, String marca, String modelo, double preco, String polegadas, String tecnologia) {
        super(nome, serial, ID);
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;  
        this.polegadas = polegadas;
        this.tecnologia = tecnologia;
    }

    public String getDados() {
         return "Nome: " + nome + "\n" + "Marca: " + marca + "\n" +  "Modelo: " + modelo + "\n" + "Preço: " + preco;
    }
}