import cadastro.Cadastro;
import pessoa.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro(3);
        PessoaFisica pessoaFisica1 = new PessoaFisica("1", "Ana");
        PessoaFisica pessoaFisica2 = new PessoaFisica("2", "Bruna");
        PessoaFisica pessoaFisica3 = new PessoaFisica("3", "Kaio");
        System.out.println(pessoaFisica.toString());

        cadastro.cadastrar(pessoaFisica1);
        cadastro.cadastrar(pessoaFisica2);
        cadastro.cadastrar(pessoaFisica3);

        System.out.println(cadastro);
    }
}