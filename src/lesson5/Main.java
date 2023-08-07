package lesson5;

import lesson4.Animal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car avto = new Car(33l, "Bmw", "Black", 5);
        avto.details();
        avto.start();
//        int speed = avto.acceleration(0, 50);
//        System.out.println(speed);
        System.out.println("Car acellerates to: " + avto.acceleration(0, 50) + "Km/h");
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

        Motorcycle moto = new Motorcycle(id, brand, color, seats);
        moto.details();
        moto.start();
        moto.stop("BMW", "14:00");
        moto.acceleration(0, 100);
        moto.stop("BMW", "14:40");


        Motorcycle moto2 = new Motorcycle();

        System.out.print("Enter the id: ");
        Long id1 = scanner.nextLong();
        System.out.print("Enter the brand: ");
        String brand1 = scanner.next();
        System.out.print("Enter the color: ");
        String color1 = scanner.next();
        System.out.print("Enter the number of seats ");
        int seats1 = scanner.nextInt();

        moto2.setId(id1);
        moto2.setBrand(brand1);
        moto2.setColor(color1);
        moto2.setHp(seats1);

        moto2.details();

        Bus avtobus = new Bus(id, brand, color, seats);
        avtobus.details();
        avtobus.start();
        avtobus.remainingSeats(50, 40);


        Bus avtobus2 = new Bus();

        System.out.print("Enter the id: ");
        Long id2 = scanner.nextLong();
        System.out.print("Enter the brand: ");
        String brand2 = scanner.next();
        System.out.print("Enter the color: ");
        String color2 = scanner.next();
        System.out.print("Enter the length ");
        int seats2 = scanner.nextInt();

        avtobus2.setId(id2);
        avtobus2.setBrand(brand2);
        avtobus2.setColor(color2);
        avtobus2.setLength(seats2);

        avtobus2.details();

        ArrayList<Transport> list = new ArrayList<>();
        list.add(avto);
        list.add(masina);
        list.add(moto);
        list.add(moto2);
        list.add(avtobus);
        list.add(avtobus2);
        for (Transport transport : list) {
            System.out.println(transport.toString());

        }
    }
}