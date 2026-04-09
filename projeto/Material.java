  package projeto;

public abstract class Material implements IExibivel{
    
    private int codigo;
    private String titulo;
    private int ano;
    private int quant;

    public Material(int codigo, String titulo, int quant, int ano){

        this.titulo = titulo;
        this.ano = ano;
        this.codigo = codigo;
        this.quant = quant;

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean verificarDisponibilidade(){

        return quant > 0;

    }

    public void reduzirQuantidade(){

        if(quant > 0){
            quant--;

        }
    }

     public void aumentarQuantidade() {
        quant++;
    }

    public abstract String getInformacoes();



}
