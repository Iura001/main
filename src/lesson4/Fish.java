package lesson4;

public class Fish extends Animal implements Nutrition, Movemement{

    private String type;

    public Fish() {
    }

    public Fish(Long id, String name, int age, String type) {
        super(id, name, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fish{" +"id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + getAge() +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public String eda() {
        return "Vodorosli";

    }

    @Override
    public void move(String name) {
        System.out.println(name + " Swim");
    }
}
