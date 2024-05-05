import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean drivingUnderAge = false;
        int age;

        System.out.print("Digite sua idade: ");
        age = sc.nextInt();

        if (age <= 18) {
            drivingUnderAge = true; // Idade abaixo da permitida para tirar licença
        }

        System.out.println(drivingUnderAge);
        sc.close();

    }
}
