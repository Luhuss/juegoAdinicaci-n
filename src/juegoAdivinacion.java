import java.util.Random;
import java.util.Scanner;

public class juegoAdivinacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int intentos = 0;
        int intentosMaximos = 5;
        boolean haAdivinado = false;

        System.out.println("Bienvenido al juego de adivinación");
        System.out.println("Tienes 5 intentos para adivinar un número de entre 0 y 100");

        while (intentos < intentosMaximos) {
            System.out.println("Intento " + (intentos + 1) + " Introduce un número: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else  if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número. ");

                haAdivinado = true;
                break;
            }
            intentos++;
        }
        if (!haAdivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAleatorio);
        }

        scanner.close();

    }
}

