package lesson5;

public class Motorcycle extends Transport implements TransportActions{

    private int hp;

    public Motorcycle() {
    }

    public Motorcycle(Long id, String brand, String color, int hp) {
        super(id, brand, color);
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void details () {
        super.details();
        System.out.println("Horsepower: " + hp);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle began to drive");
    }

    @Override
    public void stop(String brand, String time) {
        System.out.println(brand + "Motorcycle stopped at: " + time);
    }

    @Override
    public int acceleration(int initialSpeed, int differenceInSpeed) {
        return initialSpeed + differenceInSpeed;
    }

    @Override
    public int brake(int initialSpeed, int differenceInSpeed) {
        return initialSpeed - differenceInSpeed;
    }
}
