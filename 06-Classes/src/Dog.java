public class Dog  extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int size, int body, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew...!");
    }

    @Override
    public void eat() {
        chew();
        System.out.println("Dog.eat()");
        super.eat();
    }

    public void walk(){
        System.out.println("Dog is walking: ");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog is running: ");
        super.move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs()");
    }

//    @Override
//    public void move(int speed) {
//        System.out.println("Dog move is called");
//        moveLegs(speed);
//        super.move(speed);
//    }
}
