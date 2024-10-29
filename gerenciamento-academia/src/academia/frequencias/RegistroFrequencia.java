package academia.frequencias;

import academia.aulas.Aula;
import academia.membros.Membro;
import java.util.Date;

public class RegistroFrequencia {
    private Aula aula;
    private Membro membro;
    private Date date;

    public RegistroFrequencia(Aula aula, Date date, Membro membro) {
        this.aula = aula;
        this.membro = membro;
        this.date = date;
    }

    public Aula getAula() {
        return aula;
    }

    public Membro getMembro() {
        return membro;
    }

    public Date getDate() {
        return date;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
    return "RegistroFrequencia{" +
            "aula=" + aula.getNome() +
            ", membro=" + membro.getNome() +
            ", date=" + date +
            '}';
    }
}
