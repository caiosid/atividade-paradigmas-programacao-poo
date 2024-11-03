package academia.aulas;


public class AulaOnline extends Aula {
    
    public AulaOnline(int id, String nome) {
        super(id, 10, nome);
    }

    @Override
    public boolean verificarDisponibilidade(){
        return getListaMembrosInscritos().size() < 10;
    }

}
