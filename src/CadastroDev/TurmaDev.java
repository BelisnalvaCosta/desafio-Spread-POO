package CadastroDev;

import br.dio.Spread.desafio.dominio.Dev;

import java.util.ArrayList;

public class TurmaDev {
    ArrayList<Dev> listarAlunoDev;

    public TurmaDev() {
        this.listarAlunoDev = new ArrayList<>();
    }

    void insereDev(Dev novoAlunoDev) {
        listarAlunoDev.add(novoAlunoDev);
    }

    void listarDev() {
        System.out.println("\nLista de Desenvolvedores");

        for (Dev alunoDevNaLista : listarAlunoDev) {
            alunoDevNaLista.listar();
        }
    }

    void listarSituacoes() {
        System.out.println("\nSituações");

        for (Dev AlunoDevNaLista:listarAlunoDev) {
            AlunoDev AlunoNaLista = null;
            AlunoNaLista.mostrarSituacoes();
        }
    }

    public void insereAlunoDev(AlunoDev novoAlunoDev) {
    }
}
