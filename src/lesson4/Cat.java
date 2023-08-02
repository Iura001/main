package lesson4;

public class Cat extends Animal implements Movemement{

    private String color;

    public Cat() {
    }

    public Cat(Long id, String name, int age, String color) {
        super(id, name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound () {
        System.out.println("Meow!");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + getAge()  +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void move(String name) {
        System.out.println(name + " walks");
    }

}
