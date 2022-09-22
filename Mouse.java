public class Mouse extends Produtos {
    public String marca;
    public String modelo;
    public double preco;
    public int dpiMax;
    public String cor;

    public Mouse(String nome, String serial, int ID, String marca, String modelo, double preco, int dpiMax, String cor) {
        super(nome, serial, ID);
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;  
        this.dpiMax = dpiMax;
        this.cor = cor;
    }

    public String getDados() {
         return "Nome: " + nome + "\n" + "Marca: " + marca + "\n" +  "Modelo: " + modelo + "\n" + "Preço: " + preco;
    }
}