import java.util.Scanner;

public class Baitapvenha0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("In ra hình chữ nhật");
            System.out.println("In ra hình vuông");
            System.out.println("In ra tam giác ");
            System.out.println("Exit");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 8; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                case 2:
                    System.out.println("Bạn muốn loại tam giác vuông nào : top-left; top-right; bottom-left;bottom-right");
                    String type = scanner.next();
                    if (type.equals("top-left")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 8; j > i; j--) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                    }
                    if (type.equals("top-right")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 8; j > i; j--) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");
                            }
                        }
                        System.out.println(" ");
                    }
                    if (type.equals("bottom-left")) {
                        for (int i = 1; i <= 8; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" * ");
                            }
                            System.out.println(" ");
                        }
                    }
                    if (type.equals("bottom-right")) {
                        for (int i = 8; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 8; k > i; k--) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                    }
              case 3:
                    for (int i= 1 ;i<=3 ; i++){
                        for (int j = 3 ; j>i; j--){
                            System.out.print(" ");
                        }
                        for (int k=1; k<=(i*2-1);k++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
//                    int star = 1;
//                    for (int i = 1; i <4 ;i++){
//                        for (int k =4 - i ; k >0 ; k--){
//                            System.out.print(" ");
//                        }
//                        for (int j=0; j< star;j++){
//                            System.out.print("*");
//                        }
//                        star += 2;
//                        System.out.println("");
//                    }
            }
        }
        while (number != 4);
    }
}