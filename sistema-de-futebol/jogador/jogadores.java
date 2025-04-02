
public package jogador;

import java.time.LocalDate;
import java.time.LocalDateTime;

class jogadores {
    private String nome;
    private int ano_nascimento;
    private int n_camisa;
    private float peso;
    private float altura;    

    public jogadores(String nome, int ano_nascimento, float peso, int n_camisa, float altura) {
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
        this.peso= peso;
        this.n_camisa = n_camisa;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    } 

    public int getIdade() {
        int ano_atual = LocalDate.now().getYear();
        return ano_atual - ano_nascimento;
    }

    public int getN_camisa() {
        return n_camisa;
    }

    public void setN_camisa(int n_camisa) {
        this.n_camisa = n_camisa;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}