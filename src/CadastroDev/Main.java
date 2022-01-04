package CadastroDev;

import java.util.Scanner;

public class Main {

    private static AlunoDev NovaTumaDev;

    public static void main(String[] args) {
        int opcao, qtdXp = 0;
        double Xp = 0;
        String nome, cpf;
        TurmaDev navaTurmaDev = new TurmaDev();
        AlunoDev novoAlunoDev = new AlunoDev();
        Scanner Bootcamp;

        //Declarando o Bootcamp
        Bootcamp = new Scanner(System.in);

        do {
            System.out.println("\n---------------");
            System.out.println("    MENU");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Aluno Desenvolvedor");
            System.out.println("2 - Listar Aluno Desenvolvedor");
            System.out.println("3 - Situações");
            System.out.println("0 - Sair");

            opcao = Bootcamp.nextInt();
            Bootcamp.nextLine();

            switch(opcao) {

                case 1:
                    AlunoService.adicionarAlunoDev();

                    break;
                case 2:
                    AlunoService.listarAluno();

                    break;
                case 3:
                    NovaTumaDev.listarSituacoes();

                    break;
                case 0:
                    System.out.println("\nSaindo...");

                    break;
                default:
                    System.out.println("\nOpção invalida!");
            }

        }while(opcao !=0);
    }
}
