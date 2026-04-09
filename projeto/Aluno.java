 package projeto;

public class Aluno extends Usuario {
    
    public Aluno(String nome, String email, int codigo){
        super(nome, email, codigo);
    }

    @Override
    public int limiteMaximodeEmprestimos() {
        return 3;
    }

    @Override
    public int prazoDeDevolucao() {
        return 7;
    }

    @Override
    public double valordaMulta() {
        return 2.50;
    }

    @Override
    public String tipodeUsuario() {
        return "Aluno";
    }
}