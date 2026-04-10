  package projeto;

public class Revista extends Material implements IExibivel{
    
    private int edicao;

    public Revista(String titulo, int codigo, int quant, int ano, int edicao){
        super(codigo, titulo, quant, ano);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getInformacoes() {
        return "Título da revista: " + getTitulo() + " " + "edição: " + edicao;
    }

    public String exibirResumo() {
        return getTitulo() + " - " + edicao;
    }
}