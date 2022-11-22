package Collection;

import java.util.Collection;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {

    }
    private void process(Collection<Integer>
                                 firstCollection, List<Integer> list) {
        if (firstCollection.containsAll(list)) {
            System.out.println("Первая коллекция содержит все элементы списка");
        } else {
            System.out.println("Некоторые (или все) элементы из списка отсутствуют в первой коллекции");
        }
    }
}
