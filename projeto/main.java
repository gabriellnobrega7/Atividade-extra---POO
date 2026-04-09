package projeto;

public class main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Aluno arthur = new Aluno("Arthur", "arthur@email.com", 100);
        biblioteca.cadastrarUsuario(arthur);
        
        Livro livro1 = new Livro(1, "O Mundo Perdido", 2, 2018, "Arthur Conan Doyle");
        biblioteca.cadastrarMaterial(livro1);
        
        biblioteca.cadastrarMaterial(new Livro(2, "Fallen", 3, 2013, "Lauren Kate"));

        int diaAtual = 1;
        System.out.println("Realizando Empréstimo");
        
        Usuario u = biblioteca.buscarUsuarioPorCodigo(100);
        Material m = biblioteca.buscarMaterialPorCodigo(1);

        if (u != null && m != null) {
            Emprestimo novoEmprestimo = new Emprestimo(1, u, m, diaAtual);
            
            biblioteca.realizarEmprestimo(novoEmprestimo);
            System.out.println("Empréstimo realizado para: " + u.getNome());
        }

        System.out.println("\nEmpréstimos Ativos");
        for (Emprestimo e : biblioteca.getEmprestimos()) {
            if (!e.estaFinalizado()) {
                System.out.println(e.exibirResumo());
            }
        }

        System.out.println("\nRegistrando Devolução");
        Emprestimo emp1 = biblioteca.buscarEmprestimoPorId(1);
        if (emp1 != null) {
            emp1.registrarDevolucao(12); // Devolvido dia 12 (Prazo de aluno é 7 dias + dia 1 = dia 8)
            System.out.println("Status: " + emp1.exibirResumo());
            System.out.println("Multa calculada: R$ " + emp1.CalcularMulta());
        }
    }
}
