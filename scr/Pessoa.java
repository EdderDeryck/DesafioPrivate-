public class Pessoa {
    private String nome;
    private int idade;
    private String sobrenome;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, int idade, String sobrenome, String cpf, String telefone) {
        this.nome = nome;
        this.setIdade(idade);
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade >= 15 && idade <= 110) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }

    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public boolean validarCpf() {
        return this.cpf != null && this.cpf.length() == 11;
    }

    public int getIdade() {
        return this.idade;
    }
}