  package projeto;

public class Revista extends Material{
    
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

    @Override
    public String getInformacoes() {
        
        return "T´tulo da revista: " + getTitulo() + " " + "edição: " + edicao;
    }

    @Override
    public String exibirResumo() {
        
        return getTitulo() + " - " + edicao;
    }


}
