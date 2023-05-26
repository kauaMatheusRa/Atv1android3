package devandroid.kauamatheus.agendacompromissos.model;

public class Compromisso {
    private String titulo;
    private String data;
    private String horario;
    private String local;

    public Compromisso(){

    }

    public Compromisso(String titulo, String data, String horario, String local) {
        this.titulo = titulo;
        this.data = data;
        this.horario = horario;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "titulo='" + titulo + '\'' +
                ", data='" + data + '\'' +
                ", horario='" + horario + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
