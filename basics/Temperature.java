import java.util.Scanner;

class temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double temp, c, f;

        System.out.println("Enter the Temperature: ");
        temp = sc.nextDouble();

        f = (temp * (9.0 / 5)) + 32;
        c = (temp - 32) * (5.0 / 9);

        System.out.println("Fahrenheit: " + f);
        System.out.println("Celsius: " + c);

        sc.close();
    }
}
