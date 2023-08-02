import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        double num1 = 38;
        double num2 = 25.7;
        double num3 = 56.84;

        double average = calculateAverage(num1, num2, num3);
        System.out.println("Average: " + average);

        String text = "I'm an intern at PowerIt!";
        int numVowels = countVowels(text);
        System.out.println("Number of vowels: " + numVowels);


        System.out.println("First 50 Pentagonal Numbers:");
        displayFirst50PentagonalNumbers();


        String password1 = "PowerIT123";
        String password2 = "PowerIT";
        String password3 = "Power12$IT";
        System.out.println("\nIs password1 valid? " + isValidPasswordMain(password1));
        System.out.println("Is password2 valid? " + isValidPasswordMain(password2));
        System.out.println("Is password3 valid? " + isValidPasswordMain(password3));



        displayCurrentDateTime();




        int year1 = 2000;
        int year2 = 1900;
        System.out.println(year1 + " is a leap year? " + isLeapYear(year1));
        System.out.println(year2 + " is a leap year? " + isLeapYear(year2));


        }


        public static double calculateAverage(double num1, double num2, double num3) {
            return (num1 + num2 + num3) / 3.0;
        }


    public static int countVowels(String input) {
        String lowercaseInput = input.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < lowercaseInput.length(); i++) {
            char ch = lowercaseInput.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void displayFirst50PentagonalNumbers() {
        for (int n = 1; n <= 50; n++) {
            int pentagonalNumber = n * (3 * n - 1) / 2;
            System.out.print(pentagonalNumber + " ");
        }
//        System.out.println();
    }


    public static boolean isValidPasswordMain(String password){
        if (isValidPassword(password) && isValidPassword1(password) && isValidPassword2(password)){
            return true;
        }
        return false;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) {
            return false;
        }
        return true;
    }

    public static boolean isValidPassword1(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            switch (password.charAt(i)){
                case '0', '1', '2','3','4','5','6','7','8','9':
                    count++;
                    break;
            }
        }
        if (count<2)
            return false;
        else return true;
    }

    public static boolean isValidPassword2(String password){
        for (int i = 0; i < password.length(); i++) {
            switch (password.charAt(i)){
                case '!', '@', '$','%':
                    return false;
            }
        }
        return true;
    }


    public static void displayCurrentDateTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Current date and time: " + formattedDateTime);
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            return true;
        }
        return false;
    }

}