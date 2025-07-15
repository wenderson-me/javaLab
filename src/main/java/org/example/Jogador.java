package org.example;

public class Jogador {

    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Construtor
    // Inicializa os atributos do jogador
    public Jogador(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    // Metodos

    public void apresentarSe() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos, jogo como " + posicao +
                           " e meu número de camisa é " + numeroCamisa + ".");
    }

    public void treinar() {
        System.out.println(nome + " está treinando.");
    }

    public void chutar() {
        System.out.println(nome + " está chutando a bola.");
    }

    public void passar() {
        System.out.println(nome + " está passando a bola.");
    }

    public void marcarGolo() {
        System.out.println(nome + " marcou um golo!");
    }

    public void atualizarPosicao(String novaPosicao) {
        this.posicao = novaPosicao;
        System.out.println(nome + " agora joga como " + novaPosicao + ".");
    }

    public void atualizarNumero(int novoNumero) {
        this.numeroCamisa = novoNumero;
        System.out.println(nome + " agora usa o número " + novoNumero + " na camisa.");
    }

    public void atualizarNome(String novoNome) {
        String nomeAntigo = getNome();
        setNome(novoNome);
        System.out.println("O nome do jogador " + nomeAntigo + " foi atualizado para " + novoNome + ".");
    }


    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }
}
