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

        System.out.println(" ");
        System.out.println("Cenário 02: Registro de Frequência");
        System.out.println(" ");


        academia.registrarFrequencia(pilates, alunoPilates);
        academia.listarRegistrosFrequencia();


        System.out.println(" ");
        System.out.println("Cenário 03: Erro ao adicionar membro");
        System.out.println(" ");

        Aluno alunoMusculacao = new Aluno(
                "Rodrigo Santos",
                02,
                false
        );

        Professor professorMusculacao = new Professor(
                "Lucas Fernando",
                102,
                true
        );

        AulaPresencial musculacao = new AulaPresencial(
                "Musculacao"
        );

        musculacao.setProfessor(professorMusculacao);
        academia.adicionarMembro(alunoMusculacao);
        academia.adicionarAula(musculacao);

        System.out.println(" ");

        academia.inscreverMembroEmAula(alunoMusculacao, musculacao);
        System.out.println(" ");
        academia.listarAulas();
    }
}
