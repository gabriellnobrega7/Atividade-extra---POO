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
        for (Usuario u : usuarios) {
            if (u.getCodigo() == codigo) {
                return u;
            }
        }
        return null;
    }

    public Material buscarMaterialPorCodigo(int codigo) {
        for (Material m : materiais) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    public Emprestimo buscarEmprestimoPorId(int id) {
        for (Emprestimo e : emprestimos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void realizarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
        e.getMaterial().reduzirQuantidade();
    }

    public void registrarDevolucao(int idEmprestimo, int dataDevolucao) {
        Emprestimo e = buscarEmprestimoPorId(idEmprestimo);
        if (e != null) {
            e.registrarDevolucao(dataDevolucao);
            e.getMaterial().aumentarQuantidade();
        }
    }

    public int contarEmprestimosAtivosDeUsuario(int codigoUsuario) {
        int count = 0;
        for (Emprestimo e : emprestimos) {
            if (e.getUsuario().getCodigo() == codigoUsuario && !e.estaFinalizado()) {
                count++;
            }
        }
        return count;
    }

    public List<Usuario> getUsuarios() { return usuarios; }
    public List<Material> getMateriais() { return materiais; }
    public List<Emprestimo> getEmprestimos() { return emprestimos; }
}