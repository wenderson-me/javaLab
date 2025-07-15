package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criar um objeto
        Jogador medio = new Jogador("Carlos", 22, "Médio", 8);
        Jogador avancado = new Jogador("Pedro", 24, "Avançado", 9);
        Jogador defesa = new Jogador("Ana", 23, "Defesa", 5);
        GuardaRedes guardaRedes = new GuardaRedes("João", 25, 1);

        // Criar uma equipa
        Equipa equipa = new Equipa("Sporting", "Lisboa", null);

        // Adicionar jogadores à equipa
        equipa.adicionarJogador(medio);
        equipa.adicionarJogador(avancado);
        equipa.adicionarJogador(defesa);
        equipa.adicionarJogador(guardaRedes);

        // Listar jogadores da equipa
        equipa.listarJogadores();

        // Apresentamos o guarda-redes novamente para ver o estado atualizado
        System.out.println("\n--- Estado atualizado do Guarda-Redes ---");
        guardaRedes.apresentarSe();

        System.out.println("\n--- Simulação de um lance de jogo ---");
        medio.treinar();
        avancado.chutar();
        guardaRedes.defender();
        defesa.passar();
        avancado.marcarGolo();
        medio.chutar();
        guardaRedes.defender();
        System.out.println("fim do jogo!\n");

        // Atualizar a posição de um jogador
        guardaRedes.atualizarPosicao("Guarda Redes reserva");

        // Atualizar o número da camisa de um jogador
        medio.atualizarNumero(10);

        // Remover um jogador da equipa
        equipa.removerJogador("Carlos");

        // alterar o nome de um jogador
        defesa.atualizarNome("Silva");

        // alterar a idade de um jogador
        avancado.setIdade(26);

        // Listar jogadores da equipa novamente
        equipa.listarJogadores();
    }
}