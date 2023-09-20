import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int numeroPensado = random.nextInt(101);
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivina el número entre 0 y 100.");

        while (true) {
            System.out.print("Intento " + (intentos + 1) + ": ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento < numeroPensado) {
                System.out.println("Es mayor que " + intento);
            } else if (intento > numeroPensado) {
                System.out.println("Es menor que " + intento);
            } else {
                System.out.println("Correcto. Adivinaste en " + intentos + " intentos.");
                break;
            }
        }

        scanner.close();
    }
}
    
