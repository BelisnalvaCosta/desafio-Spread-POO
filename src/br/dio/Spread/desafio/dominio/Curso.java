 package br.dio.Spread.desafio.dominio;

 public class Curso extends Conteudo {

     private int CargaHoraria;
     private String Titulo;
     private String Descricao;

    @Override
     public double calcularXp() {
         return XP_PADRAO * CargaHoraria;
     }
      public Curso(){
          super();
    }

     public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

     public String getTitulo() {
         return Titulo;
     }

     public void setTitulo(String Titulo) {
         this.Titulo = Titulo;
     }

     public String getDescricao() {
         return Descricao;
     }

     public void setDescricao(String Descricao) {
         this.Descricao = Descricao;
     }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + CargaHoraria +
                '}';
    }

}
