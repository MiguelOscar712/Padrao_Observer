public class Estoque implements Observer {

    @Override
    public void atualizar(String produto, int quantidade) {

        if (quantidade < 10) {
            System.out.println(
                    "Estoque: produto " + produto +
                            " está acabando!"
            );
        } else {
            System.out.println(
                    "Estoque atualizado com sucesso."
            );
        }
    }
}