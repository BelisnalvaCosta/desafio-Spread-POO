package CadastroDev;

import java.util.ArrayList;

public class AlunoDev {
    float total = 0;
    String nome, cpf, situacao = "reprovado";
    ArrayList<Float> XpAlunoDev = new ArrayList<>();

    public AlunoDev() {
    }

    public AlunoDev(float total, String nome, String cpf, ArrayList<Float> xpAlunoDev) {
        this.total = total;
        this.nome = nome;
        this.cpf = cpf;
        XpAlunoDev = xpAlunoDev;
    }

    public AlunoDev(String nome, String cpf, float Xp) {
    }

    public static void insereAlunoDev() {
    }

    void insereXP(float Xp) {
        final boolean add = XpAlunoDev.add(Xp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Float> getXpAlunoDev() {
        return XpAlunoDev;
    }

    public void setXpAlunoDev(ArrayList<Float> xpAlunoDev) {
        XpAlunoDev = xpAlunoDev;
    }

    void listar() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nCPF: " + this.cpf);
        System.out.println("\nXpAlunoDev: " + this.XpAlunoDev);

        for (int i = 0; i < XpAlunoDev.size(); i++) {
            System.out.println("Xp " + (i + 1) + ": " + this.XpAlunoDev.get(i));
        }
    }

    void mostrarSituacoes() {
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nToal: " + this.total);
        System.out.println("\nSituação: " + this.situacao);
    }

    void calcularXp() {
        for (float xpDaLista : XpAlunoDev) {
            total = total + xpDaLista;
        }

        if (total >= 70) {
            this.situacao = "Aprovado";
        } else {
            this.situacao = "Reprovado";
        }
    }

    public void listarAlunoDev() {
    }

    public void listarSituacoes() {
    }
}
