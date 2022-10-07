import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horasInicio, horasFinal;


        horasInicio = sc.nextInt();
        horasFinal = sc.nextInt();

        int dia;
        if (horasInicio < horasFinal) {
            dia = horasFinal - horasInicio;
        } else {
            dia = 24 - horasInicio + horasFinal;

        }
        System.out.println("O JOGO DUROU " + dia + " HORA(S)");


        sc.close();


    }

}
