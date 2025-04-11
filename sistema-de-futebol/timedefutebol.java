import jogador.Jogadores;
import premiacao.Campeao;
import java.util.ArrayList;

public class timedefutebol {
    private String nomeTime;
    private ArrayList<Jogadores> jogadores;
    private ArrayList<Campeao> titulos;

    public timedefutebol(String nomeTime) {
        this.nomeTime = nomeTime;
        this.jogadores = new ArrayList<>();
        this.titulos = new ArrayList<>();
    }

    public void adicionarJogador(Jogadores jogador) {
        jogadores.add(jogador);
    }

    public void adicionarTitulo(Campeao titulo) {
        titulos.add(titulo);
    }

    public void exibirTime() {
        System.out.println("Time: " + nomeTime);
        System.out.println("Jogadores:");
        for (Jogadores j : jogadores) {
            System.out.println("- " + j);
        }

        System.out.println("Títulos:");
        for (Campeao t : titulos) {
            System.out.println("- " + t);
        }
    }

    public static void main(String[] args) {
        timedefutebol time = new timedefutebol("Wesb United");

        Jogadores j1 = new Jogadores("Carlos", 25, "Atacante");
        Jogadores j2 = new Jogadores("Marcos", 28, "Goleiro");
        time.adicionarJogador(j1);
        time.adicionarJogador(j2);

        Campeao c1 = new Campeao("Campeonato Nacional", 2022);
        Campeao c2 = new Campeao("Copa Regional", 2023);
        time.adicionarTitulo(c1);
        time.adicionarTitulo(c2);

        time.exibirTime();
    }
}
