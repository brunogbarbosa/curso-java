
public package contato;

class usuario {
    private String telefone;
    private String nome;

    public usuario(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public Void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return telefone;
    }

    public Void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void exibirContato() {
        System.out.println("Nome: " + nome + ", Telefone: " + telefone);
    }
}