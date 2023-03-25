import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача 1");

        isleapYear(2023);

        System.out.println("Задача 2");

        determineTypeSystem(0, 2015);
        determineTypeSystem(1, 2023);

        System.out.println("Задача 3");

        int distance = 50;
        int time = calculateTime(distance);
        System.out.println("Потребуется " + time + " дней, на дистанцию " + distance + " + срок доставки");

    }

    public static void isleapYear(int year) {
        boolean result =  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        System.out.println(year + " Год високосный, результат - " + result);
    }

    public static void determineTypeSystem(int type, int deviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (type == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычнную версию приложения для iOS по ссылке");
            }

        } else if (type == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");

        }

        }
    }

    public static int calculateTime(int distance) {

        if (distance <= 0 || distance > 100) {
            return -1;
        }

        int time = 1;

        if (distance >= 20) {
            ++time;
        }
        if (distance >= 60) {
            ++time;
        }
        return time;

    }

}