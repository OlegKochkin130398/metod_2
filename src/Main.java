import java.time.LocalDate;

public class Main {

    public static void clientCheckOs(int clientOs, int diviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0 && diviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке»..");
        } else System.out.println("«Установите облегченную версию приложения для iOS по ссылке»..");
        if (clientOs == 1 && diviceYear >= 2015) {
            System.out.println("«Установите версию приложения для Android по ссылке»..");
        } else System.out.println("«Установите облегченную версию приложения для iOS по ссылке»..");
    }

    public static void main(String[] args) {
        int clientOs = 1;
        int diviceYear = 2018;
        clientCheckOs(clientOs,diviceYear);
    }
}
