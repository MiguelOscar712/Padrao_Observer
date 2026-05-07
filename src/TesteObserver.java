public class TesteObserver {

    public static void main(String[] args) {

        System.out.println("TESTE OBSERVER MERCADINHO");

        Produto arroz = new Produto("Arroz", 20);

        Observer cliente = new Cliente();
        Observer gerente = new Gerente();
        Observer estoque = new Estoque();

        arroz.adicionarObserver(cliente);
        arroz.adicionarObserver(gerente);
        arroz.adicionarObserver(estoque);

        System.out.println("\nTESTE 1 - Atualização normal");
        arroz.alterarQuantidade(15);

        System.out.println("\nTESTE 2 - Estoque baixo");
        arroz.alterarQuantidade(5);

        System.out.println("\nTESTE 3 Removendo cliente");
        arroz.removerObserver(cliente);

        arroz.alterarQuantidade(2);

        System.out.println("\nFIM DOS TESTES");
    }
}