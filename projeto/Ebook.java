  package projeto;

public class Ebook extends Material implements IExibivel{
    
    private String formato;
    private double tamanhoArquivo;

   public Ebook(int codigo, String titulo, int quant, int ano, String formato, double tamanhoArquivo){
    super(codigo, titulo, quant, ano);
    this.formato = formato;
    this.tamanhoArquivo = tamanhoArquivo;
}

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }
    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getInformacoes() {
         return "Título: " + getTitulo() + " " + "Formato: " + formato + "Tamanho: " + tamanhoArquivo;
    }

    public String exibirResumo() {
        return getTitulo() + " - " + formato;
    }

}
