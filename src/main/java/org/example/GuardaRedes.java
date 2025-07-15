package org.example;

public class GuardaRedes extends Jogador {

    private int defesasFeitas;

    // A classe GuardaRedes herda da classe Jogador, o que significa que ela
    // possui todos os atributos e métodos da classe Jogador, além de seus próprios atributos e métodos.
    // Construtor
    public GuardaRedes (String nome, int idade, int numeroCamisa) {
        super(nome, idade, "Guarda Redes", numeroCamisa);
        this.defesasFeitas = 0;
    }

    // Metodos
    public void defender() {
        System.out.println(getNome() + " fez uma defesa.");
        defesasFeitas++;
    }

    @Override
    public void apresentarSe() {
        System.out.println("Eu sou o guarda redes e já fiz " + defesasFeitas + " defesas.");
    }
}
