import java.time.LocalDate;

public class Main {
    int age = 2021;
    public static void main(String[] args) {
        printLeapAge(2020);
        outputApplicationVersionOS(0,2021);
        System.out.println(calculateDeliveryDays(99) + " " + "дня/дней будет доставка");
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
        /*
        if (age1 >= currentYear ) {
            if (clientOs == 0) {
                System.out.println("Установите версию для IOS");
            } else {
                System.out.println("Установите версию для Android");
            }
        } else if (clientOs == 0) {
            System.out.println("Установите облегченную версию для IOS");
        } else {
            System.out.println("Установите облегченную версию для Android");
*/
        if (clientOs == 0 && age1 >= currentYear){
             System.out.println("Установите версию для IOS");}
       else if (age1 >= currentYear){
           System.out.println("Установите версию для Android");}
       else if (clientOs == 0){
           System.out.println("Установите облегченную версию для IOS");}
       else
         System.out.println("Установите облегченную версию для Android");

    }

    private static int calculateDeliveryDays (float distance) {
        int day = 0;
        if (distance <= 20){
            day = day + 1;
        }
        else if (distance<60 && distance>20){
            day = day + 2;
        }
        else if (distance<100){
            day= day + 3;
        }
        return day;
    }
    // work branch
}





