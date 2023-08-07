package lesson5;

public class Car extends Transport implements TransportActions{

    private int seats;

    public Car() {
    }

    public Car(Long id, String brand, String color, int seats) {
        super(id, brand, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void details () {
        super.details();
        System.out.println("Seats: " + seats);
    }

    @Override
    public void start() {
        System.out.println("Car began to drive");
    }

    @Override
    public void stop(String brand, String time) {
        System.out.println(brand + " stopped driving at " + time);
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
