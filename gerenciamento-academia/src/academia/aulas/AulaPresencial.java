package academia.aulas;

import academia.membros.Professor;

public class AulaPresencial extends Aula{
    
    public AulaPresencial(int id,String nome) {
        super(id, 5, nome);
    }

    @Override
    public boolean verificarDisponibilidade(){
        return getListaMembrosInscritos().size() < 5;
    }

}
