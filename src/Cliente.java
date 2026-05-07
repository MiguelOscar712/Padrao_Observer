public class Cliente implements Observer {

    @Override
    public void atualizar(String produto, int quantidade) {

        System.out.println(
                "Cliente: o produto " + produto +
                        " agora possui " + quantidade + " unidades."
        );
    }
}