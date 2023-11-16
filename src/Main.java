import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> listA = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("Введите строку для списка A " + (i + 1) + ": ");
                String A = scanner.nextLine();
                listA.add(A);
            }

            System.out.println("Список A: " + listA);

            ArrayList<String> listB = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("Введите строку для списка B " + (i + 1) + ": ");
                String B = scanner.nextLine();
                listB.add(B);
            }
            System.out.println("Список B: " + listB);
            ArrayList<String> listC = new ArrayList<>();
            listC.addAll(listA);
            listC.addAll(listB);
            System.out.println("Список С: " + listC);
            Collections.sort(listC, Comparator.comparing(String::length));

            System.out.println("Отсортированный список C: " + listC);
        }
    }
}