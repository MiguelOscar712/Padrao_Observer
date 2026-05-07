public class Main {

    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 20);

        Observer cliente = new Cliente();
        Observer gerente = new Gerente();
        Observer estoque = new Estoque();

        arroz.adicionarObserver(cliente);
        arroz.adicionarObserver(gerente);
        arroz.adicionarObserver(estoque);

        arroz.alterarQuantidade(15);

        arroz.alterarQuantidade(5);
    }
}