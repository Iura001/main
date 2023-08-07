package lesson5;

public class Bus extends Transport implements BusActions {

    private int length;

    public Bus() {
    }

    public Bus(Long id, String brand, String color, int length) {
        super(id, brand, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void details () {
        super.details();
        System.out.println("Length: " + length);
    }

    @Override
    public void start() {
        System.out.println("The bus started");
    }

    @Override
    public int remainingSeats(int allSeats, int occupiedSeats) {
        return allSeats - occupiedSeats;
    }
}
