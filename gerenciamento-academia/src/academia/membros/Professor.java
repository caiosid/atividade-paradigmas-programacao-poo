package academia.membros;

public class Professor extends Membro{
    private boolean salarioEmDia;

    public Professor(String nome, int id, boolean salarioEmDia) {
        super(nome, id, true);
        this.salarioEmDia = salarioEmDia;
    }

    public boolean isSalarioEmDia() {
        return salarioEmDia;
    }

    public void setSalarioEmDia(boolean salarioEmDia) {
        this.salarioEmDia = salarioEmDia;
    }

    @Override
    public String verificarStatusPagamento(){
        return salarioEmDia ?  "Salário em dia" : "Salário atrasado";
    }
}
