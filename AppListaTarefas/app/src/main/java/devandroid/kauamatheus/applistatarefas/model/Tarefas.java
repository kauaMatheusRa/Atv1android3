package devandroid.kauamatheus.applistatarefas.model;

import java.util.Date;

public class Tarefas {

    private String titulo;
    private String observacoes;
    private String data;

    public Tarefas(){

    }

    public Tarefas(String titulo, String observacoes, String data) {
        this.titulo = titulo;
        this.observacoes = observacoes;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "tarefas{" +
                "titulo='" + titulo + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", data=" + data +
                '}';
    }
}

