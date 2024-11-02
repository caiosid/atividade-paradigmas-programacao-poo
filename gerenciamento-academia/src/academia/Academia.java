package academia;

import academia.aulas.Aula;
import academia.frequencias.RegistroFrequencia;
import academia.membros.Membro;
import java.util.ArrayList;
import java.util.Date;
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

    public boolean inscreverMembroEmAula(Membro membro, Aula aula) {
        if (!membro.isPagamentoEmDia()) {
            System.out.println("Não é possível inscrever " + membro.getNome() +
                    " na aula " + aula.getNome() +
                    ". Pagamento não está em dia.");
            return false;
        }
        return aula.inscreverMembro(membro);
    }


    public void registrarFrequencia(Aula aula, Membro membro) {
        if (!membro.isPagamentoEmDia()) {
            System.out.println("Não é possível registrar a frequência para " + membro.getNome()
                    + ". Pagamento não está em dia.");
            return;
        }

        Date dataAtual = new Date();
        RegistroFrequencia registro = new RegistroFrequencia(aula, dataAtual, membro);
        listaRegistroFrequencia.add(registro);
        System.out.println("Frequência registrada para " + membro.getNome() +
                " na aula " + aula.getNome() + ".");
    }

    public void listarRegistrosFrequencia() {
        System.out.println("Registro de Frequência");
        if (listaRegistroFrequencia.isEmpty()) {
            System.out.println("Nenhum registro de frequência encontrado.");
        } else {
            for (RegistroFrequencia registro : listaRegistroFrequencia) {
                System.out.println("Membro: " + registro.getMembro().getNome() +
                        ", Aula: " + registro.getAula().getNome() +
                        ", Data: " + registro.getDate());
            }
        }
    }


    public void listarMembros(){
        System.out.println("Membros da Academia: ");
        for(Membro membro : listaMembros){
            System.out.println("- " + membro.getNome());
        }
    }

    public void listarAulas() {
        System.out.println("Aulas e seus Membros:");
        for (Aula aula : listAulas) {
            System.out.println("Aula: " + aula.getNome() + " (Instrutor: " + (aula.getProfessor() != null ? aula.getProfessor().getNome() : "Nenhum") + ")");
            List<Membro> membrosInscritos = aula.getListaMembrosInscritos();
            if (membrosInscritos.isEmpty()) {
                System.out.println("  Nenhum membro inscrito.");
            } else {
                System.out.println("  Membros inscritos:");
                for (Membro membro : membrosInscritos) {
                    System.out.println("    - " + membro.getNome() + " (ID: " + membro.getId() + ")");
                }
            }
            System.out.println();
        }
    }


}
