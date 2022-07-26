import java.util.Scanner;

public class Baitapvenha2 {
    public static boolean checkprime(int j) {
        Scanner scanner = new Scanner(System.in);
        if (j < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so !!!");
        int number = scanner.nextInt();
        int j = 2;
        while (j<number){
            if(checkprime(j)){
                System.out.println(j);
            }
            j++;
        }
    }
}