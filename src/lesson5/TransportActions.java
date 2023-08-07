package lesson5;

public interface TransportActions {
    public void start();

    public void stop(String brand, String time);

    public int acceleration (int initialSpeed, int differenceInSpeed);

    public int brake (int initialSpeed, int differenceInSpeed);
}
