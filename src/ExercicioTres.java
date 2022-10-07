import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, result1, result2;
        A = sc.nextInt();
        B = sc.nextInt();
        result1 = A % B;
        result2 = B % A;

        if (result1 == 0 || result2 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
