import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int divisao;
        divisao = sc.nextInt();

        if ((divisao % 2) == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();


    }
}
