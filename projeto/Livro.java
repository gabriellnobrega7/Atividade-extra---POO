package projeto;

public class Livro extends Material {
    private String autor;

    public Livro(int codigo, String titulo, int quant, int ano, String autor) {
        super(codigo, titulo, quant, ano);
        this.autor = autor;
    }

    public String getInformacoes() {
        return "Livro: " + getTitulo() + " | Autor: " + autor;
    }

    public String exibirResumo() {
        return getTitulo() + " - " + autor + " (Qtd: " + getQuant() + ")";
    }
}