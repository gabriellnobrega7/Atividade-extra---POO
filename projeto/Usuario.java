 package projeto;

public abstract class Usuario implements IExibivel {
    
    private String nome;
    private String email;
    private int codigo;

    public Usuario(String nome, String email, int codigo){

        this.nome = nome;
        this.email = email;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public String exibirResumo () {
        return null;
    }

    public abstract int limiteMaximodeEmprestimos();
    public abstract int prazoDeDevolucao();
    public abstract double valordaMulta();
    public abstract String tipodeUsuario();

}
