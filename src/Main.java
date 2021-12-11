import br.dio.Spread.desafio.dominio.Curso;
import br.dio.Spread.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraia("8");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraia("6");

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso C#");
        curso3.setDescricao("Descrição curso C# e seus métodos");
        curso3.setCargaHoraia("12");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição referente o curso de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria);
    }

}
