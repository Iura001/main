package lesson2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Clients> clientsArrayList = new ArrayList<>();

        Clients vasea = new Clients(33l, "Vasea", 25, 'm');
//        System.out.println(vasea.toString());
        clientsArrayList.add(vasea);

        Clients dima = new Clients();
        dima.setId(45l);
        dima.setName("Dima");
        dima.setAge(22);
        dima.setGender('m');
//        System.out.println(dima.getName() + " " + dima.getAge());
        clientsArrayList.add(dima);


        clientsArrayList.add(new Clients(34l,"Alioha", 33,'f'));
        clientsArrayList.add(new Clients(36l,"Aliona", 35,'f'));
        System.out.println("Spisok pered izmeneniami" );
        unifiedArrayprint(clientsArrayList);

        Collections.sort(clientsArrayList , (cl1, cl2) -> cl1.getName().compareTo(cl2.getName()));
        System.out.println("\nSpisok posle izmeneniami" );
        unifiedArrayprint(clientsArrayList);


    }

    public static void unifiedArrayprint(ArrayList<Clients> clientsArrayList) {
        for (Clients c : clientsArrayList) {
            System.out.println(c.toString());
        }
    }

    public static void arrayPrint1(ArrayList<Clients> clientsArrayList){
        for (int i = 0; i < clientsArrayList.size(); i++) {
            System.out.println(clientsArrayList.get(i));
        }
    }

}
