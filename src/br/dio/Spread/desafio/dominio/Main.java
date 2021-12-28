package br.dio.Spread.desafio.dominio;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso() {
            @Override
            public String getCalcularXP() {
                return null;
            }

            @Override
            public void setCalcularXp(double calcularXp) {
                super.setCalcularXp(calcularXp);
            }

            @Override
            public double calcularXp() {
                return 0;
            }

            @Override
            public void setCargaHoraria(String s) {

            }
        };
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Curso java");
        curso1.setCargaHoraria("8");

        Curso curso2 = new Curso() {
            @Override
            protected String getCalcularXP() {
                return null;
            }

            public double calcularXp() {
                return 0;
            }

            @Override
            public void setCargaHoraria(String s) {

            }
        };
        curso2.setTitulo("Curso javaScript");
        curso2.setDescricao("Curso js e seus conceitos e códigos");
        curso2.setCargaHoraria("6");

        Curso curso3 = new Curso() {
            @Override
            protected String getCalcularXP() {
                return null;
            }

            @Override
            public void setCalcularXp(double calcularXp) {
                super.setCalcularXp(calcularXp);
            }

            @Override
            public double calcularXp() {
                return 0;
            }

            @Override
            public void setCargaHoraria(String s) {

            }
        };
        curso3.setTitulo("Curso C#");
        curso3.setDescricao("Curso C# e seus métodos");
        curso3.setCargaHoraria("12");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Referente o curso de java e boas práticas");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developed");
        bootcamp.setDescreicao("Bootcamp Java Developed");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devBella = new Dev();
        devBella.setNome("Bella");
        devBella.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bella:" + devBella.getConteudosInscritos());
        devBella.progredir();
        devBella.progredir();
        devBella.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Concluidos Bella:" + devBella.getConteudosConcluidos());
        System.out.println("XP: " + devBella.calcularTotalXp());

        System.out.println("-------");

        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anna:" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos Anna:" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devAnna.calcularTotalXp());
    }
}