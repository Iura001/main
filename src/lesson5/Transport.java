package lesson5;

public class Transport {

    private Long id;

    private String brand;

    private String color;

    public Transport() {
    }

    public Transport(Long id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void details () {
        System.out.println("id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}
