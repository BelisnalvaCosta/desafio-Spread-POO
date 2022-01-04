package br.dio.Spread.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo{

    private LocalDateTime data;

    public Mentoria(){}

    public double calcularXp() {
        return XP_PADRAO + 20d;
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