package br.dio.Spread.desafio.dominio;

public class Curso {

    private String titulo;
    private String descricao;
    private int cargaHoraia;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraia() {
        return cargaHoraia;
    }

    public void setCargaHoraia(int cargaHoraia) {
        this.cargaHoraia = cargaHoraia;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraia=" + cargaHoraia +
                '}';
    }

    public void setCargaHoraia(String s) {
    }
}

