package main.java.com.desafio.classificadornivelheroi;

public class Heroi {
    private String nome;
    private int xp;

    public Heroi(String nome, int xp) {
        this.nome = nome;
        this.xp = xp;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}


