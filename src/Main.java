import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Задача 1: Линейный алгоритм - среднее арифметическое =====
        System.out.println("=== Задача 1: Среднее арифметическое трёх чисел ===");
        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите число 3: ");
        int num3 = scanner.nextInt();
        double avg = (num1 + num2 + num3) / 3.0;
        System.out.println("Среднее арифметическое: " + avg);
        System.out.println("-------------------------");

        // ===== Задача 2: Условный алгоритм - делимость на 3 и 5 =====
        System.out.println("=== Задача 2: Делимость на 3 и 5 ===");
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " делится на 3 и на 5 одновременно.");
        } else if (number % 3 == 0) {
            System.out.println(number + " делится только на 3.");
        } else if (number % 5 == 0) {
            System.out.println(number + " делится только на 5.");
        } else {
            System.out.println(number + " не делится ни на 3, ни на 5.");
        }
        System.out.println("-------------------------");

        // ===== Задача 3: Цикл - произведение чисел от 1 до n =====
        System.out.println("=== Задача 3: Произведение чисел от 1 до n ===");
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        System.out.println("Произведение чисел от 1 до " + n + " = " + product);
        System.out.println("-------------------------");

        // ===== Задача 4: Комбинация условий и циклов =====
        System.out.println("=== Задача 4: Чётные числа до n ===");
        System.out.print("Введите натуральное число n: ");
        int m = scanner.nextInt();
        int count = 0;
        System.out.print("Чётные числа: ");
        for (int i = 1; i <= m; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nКоличество чётных чисел: " + count);
        System.out.println("-------------------------");

        // ===== Задачи 4-5: Наследование и полиморфизм =====
        System.out.println("=== Задачи 4-5: Наследование и полиморфизм ===");
        Person student1 = new Student("Иван", 20, "ИС-2204");
        Person student2 = new Student("Анна", 21, "БТ-2101");

        student1.displayInfo();
        System.out.println("----------------");
        student2.displayInfo();

        scanner.close();
    }
}

// ===== Базовый класс для наследования =====
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

// ===== Производный класс с переопределением метода =====
class Student extends Person {
    String group;

    Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Группа: " + group);
    }
}
