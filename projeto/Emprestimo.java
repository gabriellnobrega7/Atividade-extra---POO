 package projeto;

public class Emprestimo implements IExibivel, ICalculavelMulta {
    
    private int id;
    private String usuario;
    private String tipoUsuario; 
    private String material;
    private int data;          
    private int dataPrevista;  
    private int dataReal;     

    public Emprestimo(int id, String usuario, String tipoUsuario, String material, int data, int dataPrevista) {
        this.id = id;
        this.usuario = usuario;
        this.tipoUsuario = tipoUsuario;
        this.material = material;
        this.data = data;
        this.dataPrevista = dataPrevista;
        this.dataReal = -1; 
    }

    public void registrarDevolucao(int dataDevolucao) {
        this.dataReal = dataDevolucao;
    }
    public boolean estaFinalizado() {
        return dataReal != -1;
    }

    public int calcularDiasAtraso() {
        if (estaFinalizado() && dataReal > dataPrevista) {
            return dataReal - dataPrevista;
        }
        return 0;
    }

    @Override
    public double CalcularMulta() {
        int diasAtraso = calcularDiasAtraso();
        double valorPorDia;

        if ("Aluno".equalsIgnoreCase(tipoUsuario)) {
            valorPorDia = 2.50;
        } else if ("Professor".equalsIgnoreCase(tipoUsuario)) {
            valorPorDia = 1.00;
        } else {
            valorPorDia = 2.00;
        }

        return diasAtraso * valorPorDia;
    }
    @Override
    public String exibirResumo() {
        return "Empréstimo ID: " + id +
               " | Usuário: " + usuario +
               " (" + tipoUsuario + ")" +
               " | Material: " + material +
               " | Data: " + data +
               " | Prevista: " + dataPrevista +
               " | Devolução: " + (estaFinalizado() ? dataReal : "não devolvido") +
               " | Multa: R$ " + CalcularMulta();
    }

    public int getId() {
    return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
