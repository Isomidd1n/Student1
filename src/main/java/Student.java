import java.util.Scanner;

public class Student {
    String familiya, ism, guruh;
    String[] fanlar = new String[5];

    void scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Talaba famliyasini kiriting: ");
        familiya = scanner.next();
        System.out.print("Talaba ismini kiriting: ");
        ism = scanner.next();
        System.out.print("Talaba guruhini kiriting: ");
        guruh = scanner.next();
        for (int i = 0; i < 5; i++) {
            System.out.print(i + 1 + " ) O'tiladigan darsni kiriting: ");
            fanlar[i] = scanner.next();
        }
    }

    void printSubject() {
        System.out.println(familiya + " " + ism + " " + " " + guruh + " o'quvchisi");
        for (String s : fanlar) {
            System.out.print(s + ", ");
        }
        System.out.print("  fanlaridan dars oladi");
    }
}
