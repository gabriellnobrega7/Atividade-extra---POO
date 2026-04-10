package projeto;

public class Professor extends Usuario {
    
    public Professor(String nome, String email, int codigo){
        super(nome, email, codigo);
    }

    public int limiteMaximodeEmprestimos() {
        return 5;
    }

    public int prazoDeDevolucao() {
        return 14;
    }

    public double valordaMulta() {
        return 1.00;
    }

    public String tipodeUsuario() {
        return "Professor";
    }

    public String exibirResumo() {
        return "Nome: " + getNome() + " (" + tipodeUsuario() + ") | Código: " + getCodigo();
    }
}