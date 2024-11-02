package academia.aulas;

import academia.membros.Professor;

public class AulaOnline extends Aula {
    
    public AulaOnline( String nome) {
        super(10, nome);
    }

    @Override
    public boolean verificarDisponibilidade(){
        return getListaMembrosInscritos().size() < 10;
    }

}
