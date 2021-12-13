package br.dio.Spread.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo {

    private static final double XP_PADRAO = 0;
    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public void setCargaHoraria(String s) {

    }

    @Override
    public void setCalcularXp(double calcularXp) {

    }

    public Mentoria () {
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}


