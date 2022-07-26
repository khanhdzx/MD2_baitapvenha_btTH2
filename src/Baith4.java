import java.util.Scanner;

public class Baith4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Độ F sang Độ C");
            System.out.println("2. Độ C sang Độ F");
            System.out.println("3. Exit");
            System.out.println("Nhập sự lựa chọn của bạn");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F :");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F sang Độ C" + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C :");
                    celsius = input.nextDouble();
                    System.out.println("Độ C sang Độ F"+ celsiusToFahrenheit(celsius));
                    break;
                }
                case 0 :
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5 )* celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenhei){
        double celsius = ( 5.0 / 9) * (fahrenhei - 32);
        return celsius;
    }
}
