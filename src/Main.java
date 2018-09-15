import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] listOfStudents = new Student[2];

        listOfStudents[0] = new Student("Kowalska", "Kinga");
        listOfStudents[1] = new Student("Nowak", "Piotr");

        System.out.println("Obecny: 'Y'. Nieobecny: 'N'.");

        for (int i = 0; i < listOfStudents.length; i++) {

            System.out.println((i + 1) + ". " + listOfStudents[i].secendName + " " + listOfStudents[i].name);

            Scanner scanner = new Scanner(System.in);

            if (scanner.next().trim().charAt(0) == 'Y') {
                listOfStudents[i].attendance = true;
            } else listOfStudents[i].attendance = false;
        }

        showList(listOfStudents);

    }

    private static String AttendentsCharacter(boolean attendance) {
        if(attendance == true)return "+";
        else return "-";
    }

    private static void showList(Student[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].secendName + " " + array[i].name + " " + AttendentsCharacter(array[i].attendance));
        }
    }
}
