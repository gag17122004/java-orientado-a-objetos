package Animais;

public class Cachorro {

    // atributos
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

    //construtor default

    //construtores definidos pelo usuario
    Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo){
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;

        numeroDeCachorros ++;
    }

    //métodos
    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() { return this.nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public int getAltura() { return altura; }

    public void setAltura(int altura) { this.altura = altura; }

    public int getTamanhoDoRabo() { return tamanhoDoRabo; }

    public void setTamanhoDoRabo(int tamanhoDoRabo) { this.tamanhoDoRabo = tamanhoDoRabo; }

    public String getEstadoDeEspirito() { return estadoDeEspirito; }

    public void EstadoDeEspirito(int EstadoDeEspirito) { this.estadoDeEspirito = estadoDeEspirito; }

    public String pegar() { return "Bolinha"; }

    public String interagir(String acao){

        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro";
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!!");
    }
}
