package academia.aulas;

import academia.membros.Membro;
import academia.membros.Professor;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    private int id;
    private String nome;
    private Professor professor;
    private int capacidadeMaxima;
    private List<Membro> listaMembrosInscritos;

    public Aula(int id,int capacidadeMaxima, String nome) {
        this.id = id;
        this.capacidadeMaxima = capacidadeMaxima;
        this.nome = nome;
        this.listaMembrosInscritos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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

    public boolean removerMembro(Membro membro){
        return listaMembrosInscritos.remove(membro);
    }

    public void listarMembrosInscritos(){
        System.out.println("Membros inscritos na aula " + nome + ":");
        for(Membro membro : listaMembrosInscritos){
            System.out.println("- " + membro.getNome());
        }
    }

    @Override
    public String toString() {
    return "Aula{" +
            "nome='" + nome + '\'' +
            ", instrutor='" + professor + '\'' +
            ", capacidadeMaxima=" + capacidadeMaxima +
            ", membrosInscritos=" + listaMembrosInscritos.size() +
    
            '}';
    }

}
