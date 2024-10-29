package academia.aulas;

import academia.membros.Membro;
import java.util.ArrayList;
import java.util.List;

public class Aula {
    private String nome;
    private String instrutor;
    private int capacidadeMaxima;
    private List<Membro> listaMembrosInscritos;

    public Aula(int capacidadeMaxima, String instrutor, String nome) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.instrutor = instrutor;
        this.nome = nome;
        this.listaMembrosInscritos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Membro> getListaMembrosInscritos() {
        return listaMembrosInscritos;
    }

    public boolean inscreverMembro(Membro membro){
        if(membro.isPagamentoEmDia() && verificarDisponibilidade()){
            listaMembrosInscritos.add(membro);
            return  true;
        }
        return false;
    }

    public boolean verificarDisponibilidade(){
        return listaMembrosInscritos.size() < capacidadeMaxima;
    }

    public void listarMembrosInscritos(){
        System.out.println("Membros inscritos na aula " + nome + ":");
        for(Membro membro : listaMembrosInscritos){
            System.out.println("- " + membro.getNome());
        }
    }
 
}
