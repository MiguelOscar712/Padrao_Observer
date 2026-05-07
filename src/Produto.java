import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {

    private String nome;
    private int quantidade;

    private List<Observer> observers;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.observers = new ArrayList<>();
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;

        System.out.println("\nQuantidade atualizada!");

        notificarObservers();
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {

        for (Observer observer : observers) {
            observer.atualizar(nome, quantidade);
        }
    }
}