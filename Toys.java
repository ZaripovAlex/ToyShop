public class Toys {
    private int id;
    private String name;
    private int weight;



    public Toys(int id, int weight, String name) {
        this.id = id;
        this.weight = weight;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }}
