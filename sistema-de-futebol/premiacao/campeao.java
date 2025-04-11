package premiacao;

public class Campeao {
    private String titulo;
    private int ano;

    public Campeao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return titulo + " - " + ano;
    }
}
