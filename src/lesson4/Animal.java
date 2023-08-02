package lesson4;

public class Animal {


    private Long id;

    private String name;

    private int age;

    public Animal(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }



    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;


    }

    public void makeSound () {
        System.out.println("General sound: ");
    }





    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
