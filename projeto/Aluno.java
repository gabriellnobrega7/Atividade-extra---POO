package projeto;

public class Aluno extends Usuario {
    public Aluno(String nome, String email, int codigo) {
        super(nome, email, codigo);
    }

    public int limiteMaximodeEmprestimos() { 
        return 3; 
    }

    public int prazoDeDevolucao() { 
        return 7; 
    }

    public double valordaMulta() { 
        return 2.50; 
    }

    public String tipodeUsuario() { 
        return "Aluno"; 
    }

    public String exibirResumo() {
        return "Nome: " + getNome() + " | Tipo: Aluno | Código: " + getCodigo();
    }
}