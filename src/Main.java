import java.time.LocalDate;

public class Main {
    int age = 2021;
    public static void main(String[] args) {
        printLeapAge(2020);
        outputApplicationVersionOS(1,2022);
        calculateDeliveryDays(99);
    }
    private static void printLeapAge(int age){

        if (age % 4 == 0 && age % 100 != 0 || age % 400 == 0) {
            System.out.println("високосный");
        } else {
                System.out.println("не високосный");
            }
        }
    private static void outputApplicationVersionOS(int clientOs , int age1){
        int currentYear = LocalDate.now().getYear();
        if (age1 > currentYear) {
            if (clientOs == 0) {
                System.out.println("Установите версию для IOS");
            } else {
                System.out.println("Установите версию для Android");
            }
        } else if (clientOs == 0) {
            System.out.println("Установите облегченную версию для IOS");
        } else {
            System.out.println("Установите облегченную версию для Android");

        }
    }

    private static int calculateDeliveryDays (float distance) {
        int day = 0;
        if (distance <= 20){
            day = day + 1;
            System.out.println(day + " день будет доставка");
        }
        else if (distance<60 && distance>20){
            day = day + 2;
            System.out.println(day + " дня будет доставка");
        }
        else if (distance<100){
            day= day + 3;
            System.out.println(day + " дня/дней будет доставка");
        }
        return day;
    }
    // work branch
}





