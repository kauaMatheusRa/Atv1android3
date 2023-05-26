package devandroid.kauamatheus.listacompras.model;

public class Compra {

    private String nome;
    private String quantidade;
    private String local;

    public Compra(){

    }

    public Compra(String nome, String quantidade, String local) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "nome='" + nome + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
