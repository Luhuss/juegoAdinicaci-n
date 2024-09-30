import java.util.Random; // Importa la clase Ramdom para generar números aleatorios.
import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario.

public class juegoAdivinacion { // Declaración de la clase principal del juego.

    public static void main(String[] args) { // Metodo principal donde comienza la ejecución del programa.
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer los datos del usuario.
        Random random = new Random(); // Crea un objeto Random para generar un número aleatorio.
        int numeroAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100 (inclusive).
        int intentos = 0; // Inicializa el contador de intentos del usuario.
        int intentosMaximos = 5; // Define el número máximo de intentos permitidos.
        boolean haAdivinado = false; // Variable booleana para indicar si el número ha sido adivinado.

        // Mensajes iniciales que explican las reglas del juego.
        System.out.println("Bienvenido al juego de adivinación");
        System.out.println("Tienes 5 intentos para adivinar un número de entre 0 y 100");

        // Bucle que continúa mientras los intentos sean menores que el límite máximo.
        while (intentos < intentosMaximos) {
            System.out.println("Intento " + (intentos + 1) + " Introduce un número: "); // Lee el número que introduce el usuario.
            int numeroUsuario = scanner.nextInt();

            // Compara el número del usuario con el número aleatorio
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor."); // Informa que el número es mayor al ingresado.
            } else  if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor."); // Informa que el número es menor al ingresado.
            } else {
                System.out.println("¡Felicidades! Adivinaste el número. "); // Informa que el usuario ha adivinado correctamente.
                haAdivinado = true; // Cambia la variable booleana para indicar que ha ganado.
                break; // Sale del bucle ya que el usuario ha adivinado correctamente.
            }
            intentos++; // Incrementa el contador de intentos.
        }
        // Si el jugador no ha adivinado el número en los intentos permitidos.
        if (!haAdivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAleatorio);
        }

        scanner.close(); // Cierra el objeto Scanner para liberar los recursos utilizados.

    }
}

/*
Imports:

Random: Genera un número aleatorio.
Scanner: Permite leer entradas del usuario desde la consola.
Variables:

numeroAleatorio: Almacena el número aleatorio generado.
intentos: Cuenta cuántas veces el usuario ha intentado adivinar.
intentosMaximos: El número máximo de intentos permitidos (en este caso, 5).
haAdivinado: Una bandera booleana que indica si el usuario ha acertado.
Lógica del juego:

El programa solicita al usuario que ingrese un número en cada intento.
Dependiendo de si el número ingresado es mayor o menor que el número aleatorio, el programa le da pistas al usuario.
Si adivina el número, se interrumpe el bucle.
Si no adivina en los 5 intentos, el juego termina mostrando el número correcto.
Este código implementa un juego simple de adivinación de números, que refuerza conceptos de control de flujo como bucles y condicionales.
 */