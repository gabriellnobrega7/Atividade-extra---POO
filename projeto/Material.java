package projeto;

public abstract class Material implements IExibivel {
    private int codigo;
    private String titulo;
    private int ano;
    private int quant;

    public Material(int codigo, String titulo, int quant, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.quant = quant;
        this.ano = ano;
    }

    public int getCodigo() { 
        return codigo; 
    }

    public String getTitulo() { 
        return titulo; 
    }

    public int getQuant() { 
        return quant; 
    }

    public boolean verificarDisponibilidade() { 
        return quant > 0; 
    }
    
    public void reduzirQuantidade() {
        if (quant > 0) quant--;
    }

    public void aumentarQuantidade() { 
        quant++; 
    }

    public abstract String getInformacoes();
}