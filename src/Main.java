//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// Task 1
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
        /// Task 2
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        /// Task 3
        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }
        /// Task 4
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }
        /// Task 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным.");
        }
        /// Task 6
        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }
        /// Task 7
        for (int g = 1; g <= 512; g = g * 2) {
            System.out.println(g);
        }
        ///  Task 8
        int salary = 29000;
        int capital = 0;
        for (int h = 1; h < 12; h++) {
            capital = capital + salary;
            System.out.println("Месяц " + h + ", сумма накоплений равна " + capital + " рублей.");
        }
    }
}