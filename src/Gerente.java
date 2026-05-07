public class Gerente implements Observer {

    @Override
    public void atualizar(String produto, int quantidade) {

        System.out.println(
                "Gerente recebeu atualização do estoque de " +
                        produto
        );
    }
}