package pessoa;

public class PessoaFisica {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public String toString() {
        return "CPF:" + this.cpf + ", Nome" + this.nome;
    }
}