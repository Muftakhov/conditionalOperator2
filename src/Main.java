import java.util.IllegalFormatCodePointException;

public class Main {
         public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4();
        task5();
         }
    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1)
        System.out.println("Установите версию приложения для iOS по ссылке");
        else
            System.out.println("Установите версию приложения для Android по ссылке");}
    public static void task2 () {
        System.out.println("Задача 2");
        int clientOS = 0;
        char clientDeviceYear = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");}}
        else {
            if (clientOS == 0){
                System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015)
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                   }}
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0) {
            System.out.println(year+" год является високосным");
        } else
            System.out.println(year+" год не является високосным");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }

            System.out.println("Потребуется дней: " +deliveryDays);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumbe = 13;
        switch (monthNumbe) {
            case 1: case 2: case 12:
            System.out.println( "зима");
            break;
            case 3: case 4: case 5:
                System.out.println( "весна");
                break;
            case 6: case 7: case 8:
                System.out.println( "лето");
                break;
            case 9: case 10: case 11:
                System.out.println( "осень");
                break;
            default:
                System.out.println("такого месяца " +monthNumbe+ " нет, вида времени не существует");
        }


    }
}
