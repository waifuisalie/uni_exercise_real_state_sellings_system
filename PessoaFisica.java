package ImobiApartPessoa;

public class PessoaFisica {
    private String nome;
    private String telefone;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTel(String telefone) {
        this.telefone = telefone;
    }

    public void showProprietario() {
        System.out.println("=======================");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone " + telefone);
    }
}
