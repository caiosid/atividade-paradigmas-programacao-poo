package academia;

import academia.aulas.Aula;
import academia.frequencias.RegistroFrequencia;
import academia.membros.Membro;
import java.util.ArrayList;
import java.util.List;

public class Academia {
    private List<Membro> listaMembros;
    private List<Aula> listAulas;
    private List<RegistroFrequencia> listaRegistroFrequencia;

    public Academia(){
        this.listaMembros = new ArrayList<>();
        this.listAulas = new ArrayList<>();
        this.listaRegistroFrequencia = new ArrayList<>();
    }

    public void adicionarMembro(Membro membro){
        listaMembros.add(membro);
    }

    public void adicionarAula(Aula aula){
        listAulas.add(aula);
    }

    public boolean inscreverMembroEmAula(Membro membro, Aula aula){
        return aula.inscreverMembro(membro);
    }

    public void registrarFrequencia(Aula aula,Membro membro){
        RegistroFrequencia registro = new RegistroFrequencia(aula, null, membro);
    }

    public void listarRegistrosFrequencia(){
        System.out.println("Registro de Frequência");
        for(RegistroFrequencia registro : listaRegistroFrequencia){
            System.out.println("Membro: " + registro.getMembro().getNome() +
                               ", Aula: " + registro.getAula().getNome() +
                               ", Data: " + registro.getDate());
    
        }
    }

    public void listarMembros(){
        System.out.println("Membros da Academia: ");
        for(Membro membro : listaMembros){
            System.out.println("- " + membro.getNome());
        }
    }

    public void listarAulas(){
        System.out.println("Aulas Disponíveis: ");
        for(Aula aula : listAulas){
            System.out.println("- " + aula.getNome() + " (Instrutor: " +
                    (aula.getProfessor() != null ? aula.getProfessor().getNome() : "Nenhum") + ")");
        }
    }


}
