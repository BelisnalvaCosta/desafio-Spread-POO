package CadastroDev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlunoService extends AlunoDev {
    static AlunoDev alunoDev = new AlunoDev();
    static TurmaDev turmaDev = new TurmaDev();

    public AlunoService() {
    }

    public static void adicionarAlunoDev() {
        Scanner scanner = new Scanner(System.in);

        List<Float> Xp = new ArrayList<>();
        System.out.println("\nNome: ");
        String nome = scanner.nextLine();
        alunoDev.setNome(nome);
        System.out.println("\nCPF: ");
        String cpf = scanner.nextLine();
        alunoDev.setCpf(cpf);

        System.out.println("\nQuantosXp?");
        int qtdXp = scanner.nextInt();

        for (int i = 0; i > 0; i++) {
            System.out.println("\nXp " + (i + 1));
            float exp = scanner.nextInt();
            alunoDev.insereXP(exp);
        }

        turmaDev.insereAlunoDev(alunoDev);
        }
    }
