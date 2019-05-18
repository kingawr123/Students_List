import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("attendanceList.txt");
        PrintWriter printWriter = new PrintWriter(file);

        Student[] listOfStudents = new Student[2];

        listOfStudents[0] = new Student("Kowalska", "Kinga");
        listOfStudents[1] = new Student("Nowak", "Piotr");

        System.out.println("Obecny: 'Y'. Nieobecny: 'N'.");

        for (int i = 0; i < listOfStudents.length; i++) {

            System.out.println((i + 1) + ". " + listOfStudents[i].secendName + " " + listOfStudents[i].name);

            Scanner scannerToAttendance = new Scanner(System.in);

            if (scannerToAttendance.next().trim().toLowerCase().charAt(0) == 'y') {
                listOfStudents[i].attendance = true;
            } else listOfStudents[i].attendance = false;
        }

        showList(listOfStudents);
        InputFile(printWriter, listOfStudents);

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

    private static void InputFile(PrintWriter printWriter, Student[] array){
        for (int i = 0; i < array.length; i++) {
            printWriter.println((i + 1) + ". " + array[i].secendName + " " + array[i].name + " " + AttendentsCharacter(array[i].attendance));
        }
        printWriter.close();
    }
}
