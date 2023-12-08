import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while(choice != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.print("Enter width: ");
                    int width = sc.nextInt();
                    System.out.print("Enter the height: ");
                    int height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("Enter size: ");
                    int s2 = sc.nextInt();
                    for (int i = 1; i <= s2; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("Enter size: ");
                    int s3 = sc.nextInt();
                    for (int i = 0; i < s3; i++) {
                        for (int j = 0; j < s3-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <(2*i+1) ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }

    }
}
