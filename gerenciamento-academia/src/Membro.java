
public class Membro {
    private String nome;
    private int id;
    private  boolean pagamentoEmDia;

    public Membro(String nome, int id, boolean pagamentoEmDia){
        this.nome = nome;
        this.id = id;
        this.pagamentoEmDia = pagamentoEmDia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPagamentoEmDia() {
        return pagamentoEmDia;
    }

    public void setPagamentoEmDia(boolean pagamentoEmDia) {
        this.pagamentoEmDia = pagamentoEmDia;
    }

    public String verificarStatusPagamento(){
        return pagamentoEmDia ? "Pagamento em dia" : "Pagamento atrasado";
    }
}
