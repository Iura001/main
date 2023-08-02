package lesson3;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Students> studentsList = new ArrayList<>();

        studentsList = arrayRead("src/Resources/students.txt", studentsList);
        unifiedArrayprint(studentsList);


        studentsList.add(new Students(56l, "Vasea", 45, "Decebal"));
        studentsList.add(new Students(50l, "Vasile", 89, "Dimo"));

        studentsOutIn("src/Resources/studentsOut.txt", studentsList);



    }

    public static void unifiedArrayprint(ArrayList<Students> studentsArrayList) {
        for (Students s : studentsArrayList) {
            System.out.println(s.toString());
        }
    }

    public static ArrayList<Students> arrayRead (String path, ArrayList<Students> studentsList) throws IOException {
        String line = "";
        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
        while ((line = reader.readLine()) != null) {
            String[] dataStudents = line.split(" ");
            String id = dataStudents[0];
            String name = dataStudents[1];
            String age = dataStudents[2];
            String adress = dataStudents[3];

            studentsList.add(new Students(Long.parseLong(id), name,Integer.parseInt(age), adress));
        }

        return studentsList;
    }

    public static void studentsOutIn (String path, ArrayList<Students> studentsList ) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        for (Students s : studentsList) {
            fileWriter.write(s.getId() + " " + s.getName() + " " + s.getAge() + " " + s.getAdress() + "\n" );
        }
        fileWriter.close();


    }

}
