package tokio;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {
    private List<String> items;
    private Random random;

    public Bag() {
        items = new ArrayList<>();
        random = new Random();
    }

    public List<String> getItems() {
        return items;
    }

    // Método para adicionar itens à Bag
    public void putInBag(List<String> itemsToAdd) {
        items.addAll(itemsToAdd);
    }

    // Método para remover e retornar um elemento aleatório da Bag
    public Object takeFromBag() {
        if (items.isEmpty()) {
            throw new IllegalStateException("A sacola está vazia.");
        }
        int randomIndex = random.nextInt(items.size());
        return items.remove(randomIndex);
    }
}

