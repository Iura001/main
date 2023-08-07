package lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car avto = new Car(33l, "Bmw", "Black", 5);
        avto.details();
        avto.start();
//        int speed = avto.acceleration(0, 50);
//        System.out.println(speed);
        System.out.println("Car acellerates to: " +avto.acceleration(0, 50) + "Km/h");
        System.out.println("Car breaks to: " + avto.brake(50, 30) + "Km/h");
        avto.stop(avto.getBrand(), "14:00");

        Scanner scanner = new Scanner(System.in);

        Car masina = new Car();

        System.out.print("Enter the id: ");
        Long id = scanner.nextLong();
        System.out.print("Enter the brand: ");
        String brand = scanner.next();
        System.out.print("Enter the color: ");
        String color = scanner.next();
        System.out.print("Enter the number of seats ");
        int seats = scanner.nextInt();

        masina.setId(id);
        masina.setBrand(brand);
        masina.setColor(color);
        masina.setSeats(seats);

        masina.details();


        Car avtomobili = new Car(id, brand, color, seats);
        avtomobili.details();

    }
}
