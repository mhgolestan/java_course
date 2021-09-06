public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int getCurrentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.getCurrentDirection = 0;
    }

    public void steer(int direction){
        this.getCurrentDirection += direction;
        System.out.println("Vehicle.steer: " + this.getCurrentDirection);
    }

    public void move(int velcisty, int direction){
        this.currentVelocity = velcisty;
        this.getCurrentDirection = direction;
    }
}
