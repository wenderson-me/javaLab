package org.example;


import java.util.ArrayList;
import java.util.List;

public class Equipa {

    private String nomeEquipa;
    private String cidade;
    private List<Jogador> plantel;

    // Construtor
    public Equipa(String nomeEquipa, String cidade, List<Jogador> plantel) {
        this.nomeEquipa = nomeEquipa;
        this.cidade = cidade;
        this.plantel = new ArrayList<>();
    }

    // Métodos
    public void adicionarJogador(Jogador jogador) {
        this.plantel.add(jogador);
        System.out.println("Jogador " + jogador.getNome() + " adicionado à equipa " + nomeEquipa + ".");
    }

    //polimorfismo
    public void listarJogadores() {
        System.out.println("Jogadores da equipa " + nomeEquipa + "da cidade de " + cidade + ":");
        for (Jogador jogador : plantel) {
            jogador.apresentarSe();
        }
        System.out.println("------------------------------");
    }

    public String getNomeEquipa() {
        return nomeEquipa;
    }

    public void removerJogador(String nomeJogador) {
        this.plantel.removeIf(jogador -> jogador.getNome().equals(nomeJogador));
        System.out.println("Jogador " + nomeJogador + " removido da equipa " + nomeEquipa + ".");
    }

}


