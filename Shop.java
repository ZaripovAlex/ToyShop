import java.util.PriorityQueue;
import java.util.Random;

public class Shop {
        private PriorityQueue<Toys> queue;

        public Shop() {
            queue = new PriorityQueue<>((a, b) -> b.getWeight() - a.getWeight());
        }

        public void add(Toys toy) {
            queue.add(toy);
        }

        public int getRandomToyId() {
            int tw=0;
            for (Toys t: queue) {
                tw +=t.getWeight();
            }
//            int totalWeight = queue.stream().mapToInt(Toys::getWeight).sum();
            int randomValue = new Random().nextInt(tw);
            int cw = 0;
            for (Toys toy : queue) {
                cw += toy.getWeight();
                if (randomValue < cw) {
                    return toy.getId();
                }
            }
            return -1;
        }
    }


