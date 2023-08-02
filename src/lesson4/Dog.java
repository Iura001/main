package lesson4;

public class Dog extends Animal implements Movemement{

    private int weight;

    public Dog() {
    }

    public Dog(Long id, String name, int age, int weight) {
        super(id, name, age);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void move(String name) {
        System.out.println("Runs " + name);
    }
}
