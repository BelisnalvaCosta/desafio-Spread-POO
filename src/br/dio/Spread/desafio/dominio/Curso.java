package br.dio.Spread.desafio.dominio;

public abstract class Curso extends Conteudo {

    private double cargaHoraria;

    public double calcularXP() {
    return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", calcularXP='" + getCalcularXP() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    protected abstract String getCalcularXP();

    @Override
    public void setCalcularXp(double calcularXp) {

    }
}

