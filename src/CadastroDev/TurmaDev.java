package CadastroDev;

import br.dio.Spread.desafio.dominio.Dev;

import java.util.ArrayList;

public class TurmaDev {
    ArrayList<Dev> listaDeAlunoDev;

    public TurmaDev() {
        this.listaDeAlunoDev = new ArrayList<>();
    }

    void insereDev(Dev novoAlunoDev) {
        listaDeAlunoDev.add(novoAlunoDev);
    }

    void listarDev() {
        System.out.println("\nLista de Desenvolvedores");

        for (Dev devNaLista:listaDeAlunoDev) {
            devNaLista.listar();
        }
    }

    public void insereAlunoDev(AlunoDev novoAlunoDev) {
    }
}
