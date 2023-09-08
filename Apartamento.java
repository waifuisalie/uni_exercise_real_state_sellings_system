package ImobiApartPessoa;

public class Apartamento {
    private int cod;
    private double area_primitiva;
    private double area_comum;
    private float preco = 0;
    private PessoaFisica proprietario;

    public Apartamento(int cod, double area_primitiva, double area_comum, float preco) {
        this.cod = cod;
        this.area_primitiva = area_primitiva;
        this.area_comum = area_comum;
        this.preco = preco;
        this.proprietario = new PessoaFisica();
    }

    public int get_cod() {
        return cod;
    }

    public double get_area_primitiva() {
        return area_primitiva;
    }

    public double get_area_comum() {
        return area_comum;
    }

    public float get_preco() {
        return preco;
    }

    public void set_cod(int cod) {
        this.cod = cod;
    }

    public void set_area_primitiva(double area_p) {
        this.area_primitiva = area_p;
    }

    public void set_area_comum(double area_c) {
        this.area_comum = area_c;
    }
 
    public void set_preco(float preco) {
        this.preco = preco;
    }

    public void set_proprietario(String nome, int telefone) {
        proprietario.setNome(nome);
        proprietario.setTel(telefone);
    }

    public void show_proprietario() {
        proprietario.showProprietario();
    }

    public void show_apartamento_carac() {
        System.out.println("CÓDIGO: " + cod);
        System.out.println("Área Primitiva: " + area_primitiva);
        System.out.println("Área Comum: " + area_comum);
        System.out.println("Preço: " + preco);
        System.out.println("=======================");
    }
}
