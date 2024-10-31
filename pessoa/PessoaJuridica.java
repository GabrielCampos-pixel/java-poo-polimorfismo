package pessoa;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }


    public String toString() {
        return "CNPJ:" + this.cnpj + super.toString();
    } 
}       