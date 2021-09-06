public class Animal {
    private String name;
    private int brain;
    private int size;
    private int body;
    private int weight;

    public Animal(String name, int brain, int size, int body, int weight) {
        this.name = name;
        this.brain = brain;
        this.size = size;
        this.body = body;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eat ...!");
    }

    public void move(int speed){
        System.out.println("Animal speed is: " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }
}
