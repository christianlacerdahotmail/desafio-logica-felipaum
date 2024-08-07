package main.java.com.desafio.nivelheroi;

import java.util.Scanner;

//Classe principal, onde instancia o herói, calcula nível e exibe a mensagem.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do herói: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de experiência (XP) do herói: ");
        int xp = scanner.nextInt();

        Heroi heroi = new Heroi(nome, xp);
        String nivel = HeroiNivelClassificador.classificarNivel(heroi.getXp());

        System.out.printf("O Herói de nome %s está no nível de %s.%n", heroi.getNome(), nivel);
    }
}
