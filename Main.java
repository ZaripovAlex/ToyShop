import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Toys> toys = Loader.loadFile();
        Shop shop = new Shop();
        for (Toys t:toys) {
            shop.add(t);
        }
//        toys.forEach (shop::add);

        Map<Integer, Integer> resultMap = new HashMap<>();
        for (Toys t:toys) {
            resultMap.put(t.getId(),0);
        }
//        toys.forEach(toy -> resultMap.put(toy.getId(), 0));

        for (int i = 0; i < 10; i++) {
            int toyId = shop.getRandomToyId();
            resultMap.put(toyId, resultMap.get(toyId) + 1);
        }
        Result.resultsToFile(resultMap, toys);
        resultMap.forEach((id, count) -> {
            Toys toy = toys.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
            if (toy != null) {
                System.out.printf("Игрушка: %s (ID: %d) - выпала %d раз(а)%n", toy.getName(), id, count);
            }
        });
    }
}
