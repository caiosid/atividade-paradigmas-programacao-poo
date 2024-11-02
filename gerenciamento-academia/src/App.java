import academia.Academia;
import academia.aulas.AulaPresencial;
import academia.membros.Aluno;
import academia.membros.Professor;

public class App {
    public static void main(String[] args) {
        Academia academia = new Academia();

        System.out.println(" ");
        System.out.println("Cenário 01: Adição de Membro e Aula");
        System.out.println(" ");

        Aluno alunoPilates = new Aluno(
                "Nalva Rodrigues",
                01,
                true
        );

        Professor professorPilates = new Professor(
                "Livia Fernandes",
                101,
                true
        );

        AulaPresencial pilates = new AulaPresencial(
                "Pilates"
        );

        pilates.setProfessor(professorPilates);
        academia.adicionarMembro(alunoPilates);
        academia.adicionarAula(pilates);
        academia.inscreverMembroEmAula(alunoPilates, pilates);
        academia.listarAulas();
        academia.listarMembros();
    }
}
