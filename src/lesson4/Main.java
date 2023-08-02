package lesson4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat coshka = new Cat(33l, "MURZIC", 4, "orange");
        System.out.println(coshka.toString());
        coshka.makeSound();
        coshka.move(coshka.getName());

        Dog sobaka = new Dog(44l, "Bobik", 5, 20);
        System.out.println(sobaka.toString());
        sobaka.makeSound();
        sobaka.move(sobaka.getName());

        Animal animal1 = new Cat(55l, "Lolik", 6, "brown");
        System.out.println(animal1.toString());
        animal1.makeSound();

        Animal animal2 = new Dog(66l, "Dolik", 7, 24);
        System.out.println(animal2.toString());
        animal2.makeSound();

        Fish riba = new Fish(37l, "Biber", 1, "Karasi");
        System.out.println(riba.toString());
        System.out.println(riba.eda());
        riba.move(riba.getName());


        ArrayList<Animal> list = new ArrayList<>();
        list.add(animal1);
        list.add(animal2);
        list.add(coshka);
        list.add(sobaka);
        for (Animal animal: list){
            System.out.println(animal.toString());
        }

    }

}
