package projeto;

public class Emprestimo implements IExibivel, ICalculavelMulta {
    private int id;
    private Usuario usuario;
    private Material material;
    private int dataEmprestimo;
    private int dataPrevista;
    private int dataReal;

    public Emprestimo(int id, Usuario usuario, Material material, int dataHoje) {
        this.id = id;
        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = dataHoje;
        this.dataPrevista = dataHoje + usuario.prazoDeDevolucao();
        this.dataReal = -1;
    }

    public void registrarDevolucao(int diaDevolucao) {
        this.dataReal = diaDevolucao;
        this.material.aumentarQuantidade(); 
    }

    public boolean estaFinalizado() { return dataReal != -1; }

    public double CalcularMulta() {
        if (!estaFinalizado() || dataReal <= dataPrevista) {
            return 0.0;
        }
        int diasAtraso = dataReal - dataPrevista;
        return diasAtraso * usuario.valordaMulta();
    }

    public String exibirResumo() {
        String status = estaFinalizado() ? "Devolvido no dia " + dataReal : "Em aberto (Previsto: " + dataPrevista + ")";
        return "ID: " + id + " | Usuário: " + usuario.getNome() + " | Material: " + material.getTitulo() + 
               " | Status: " + status + " | Multa: R$ " + CalcularMulta();
    }

    public int getId() { return id; }
    public Usuario getUsuario() { return usuario; }
    public Material getMaterial() { return material; }
}