import java.util.LinkedList;
import java.util.List;

public abstract class Banco implements IBanco {

    protected String nome;
    protected List<Conta> contas = new LinkedList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
