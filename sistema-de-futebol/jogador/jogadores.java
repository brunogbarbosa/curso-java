package jogador;

public class Jogadores {
    private String nome;
    private int idade;
    private String posicao;

    public Jogadores(String nome, int idade, String posicao) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos) - " + posicao;
    }
}
