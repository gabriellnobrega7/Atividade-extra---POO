  package projeto;

public class Professor extends Usuario{
    
    public Professor(String nome, String email, int codigo){
        super(nome, email, codigo);
    }


     @Override
    public int limiteMaximodeEmprestimos() {
        return 5;
    }

    @Override
    public int prazoDeDevolucao() {
        return 14;
    }

    @Override
    public double valordaMulta() {
        return 1.00;
    }

    @Override
    public String tipodeUsuario() {
        return "Professor";
    }



}
