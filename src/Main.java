import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenida(o) a el juego de adivina el nùmero!");

        Scanner lector = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(100); // genera un número aleatorio entre 0 y 100
        int intentos = 0;

        while (intentos < 5) {
            System.out.println("Introduzca el nùmero entre 0 al 100: ");
            int numeroUsuario = lector.nextInt();
            intentos++;

            if ( numeroGenerado == numeroUsuario ) {
                System.out.println("🤩🤩🤩Felicitaciones, adivinaste el nùmero en " + intentos + " intentos!✨✨✨");
                break; // interrumpe el loop while
            } else if (numeroGenerado < numeroUsuario) {
                System.out.println("El nùmero que escribiste es menor al nùmero generado");
            } else {
                System.out.println("El nùmero que escribiste es mayor al nùmero generado");
            }
        }

        if (intentos == 5) {
            System.out.println("🙁🙁🙁Lo siento, no conseguiste adivinar el numero en 5 intentos. El nùmero era " + numeroGenerado);
        }
    }
}

/* Crea un programa que simule un juego de adivinanzas. El programa debe generar un número aleatorio entre 0 y 100, y pedir al usuario que intente adivinar ese número en un máximo de 5 intentos. En cada intento, el programa debe informar si el número ingresado por el usuario es mayor o menor que el número generado.

Consejos:
Para generar un número aleatorio en Java: new Random().nextInt(100);
Utiliza el Scanner para obtener los datos del usuario.
Utiliza una variable para contar los intentos.
Utiliza un bucle para controlar los intentos.
Utiliza la instrucción ‘break;’ para salir del bucle.*/