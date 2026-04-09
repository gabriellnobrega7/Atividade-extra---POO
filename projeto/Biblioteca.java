    
  package projeto;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private List<Usuario> usuarios;
    private List<Material> materiais;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
        this.materiais = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    

    public void cadastrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void cadastrarMaterial(Material m) {
        materiais.add(m);
    }

    public Usuario buscarUsuarioPorCodigo(int codigo) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCodigo() == codigo) {
                return usuarios.get(i);
            }
        }
        return null;
    }

    public Material buscarMaterialPorCodigo(int codigo) {
        for (int i = 0; i < materiais.size(); i++) {
            if (materiais.get(i).getCodigo() == codigo) {
                return materiais.get(i);
            }
        }
        return null;
    }

    public Emprestimo buscarEmprestimoPorId(int id) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getId() == id) {
                return emprestimos.get(i);
            }
        }
        return null;
    }

    public void realizarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public void registrarDevolucao(int idEmprestimo, int dataDevolucao) {
        Emprestimo e = buscarEmprestimoPorId(idEmprestimo);
        if (e != null) {
            e.registrarDevolucao(dataDevolucao);
        }
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public List<Material> listarMateriais() {
        return materiais;
    }

    public List<Emprestimo> listarEmprestimosEmAndamento() {
        List<Emprestimo> emAndamento = new ArrayList<>();
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            if (!e.estaFinalizado()) {
                emAndamento.add(e);
            }
        }
        return emAndamento;
    }

    public List<Emprestimo> listarEmprestimosFinalizados() {
        List<Emprestimo> finalizados = new ArrayList<>();
        for (int i = 0; i < emprestimos.size(); i++) {
            Emprestimo e = emprestimos.get(i);
            if (e.estaFinalizado()) {
                finalizados.add(e);
            }
        }
        return finalizados;
    }

    public int contarEmprestimosAtivosDeUsuario(int codigoUsuario) {
        int count = 0;
        Usuario u = buscarUsuarioPorCodigo(codigoUsuario);
        if (u != null) {
            for (int i = 0; i < emprestimos.size(); i++) {
                Emprestimo e = emprestimos.get(i);
                if (e.getUsuario().equals(u.getNome()) && !e.estaFinalizado()) {
                    count++;
                }
            }
        }
        return count;
    }

    
}
