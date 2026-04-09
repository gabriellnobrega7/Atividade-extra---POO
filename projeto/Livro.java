 package projeto;

public class Livro extends Material{
    
    private String autor;

    public Livro(String titulo, String autor, int codigo, int quant, int ano){
        super(codigo, titulo, quant, ano); 
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String getInformacoes() {
        return "Livro: " + getTitulo() + " | Autor: " + autor;
    }

   @Override
    public String exibirResumo() {
        return getTitulo() + " - " + autor;
    }




}
