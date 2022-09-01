
/*
SWITCH: Se quiere saber el nivel de acuerdo
a la cantidad de respuestas correctas, entre
0 y 10.
MAESTRO: 10, 9, 8
BUENO: 7, 6
APRENDIZ: 5, 4
NOVATO: 3, 2, 1, 0

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio5 {

    public static void main(String[] args) {
        int respuestascorrectas;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido(a), a continuación ingrese la cantidad de respuestas correctas:");
        respuestascorrectas = scan.nextInt();

        if (respuestascorrectas >= 0 && respuestascorrectas < 4) {
            System.out.println("Novato");
        } else {
            if (respuestascorrectas >= 4 && respuestascorrectas < 6) {
                System.out.println("Aprendiz");
            } else {
                if (respuestascorrectas >= 6 && respuestascorrectas < 8) {
                    System.out.println("Bueno");
                } else {
                    if (respuestascorrectas >= 8 && respuestascorrectas <= 10) {
                        System.out.println("Maestro");
                    } else {
                        System.out.println(
                                "¡ERROR! Nuevamente ingrese un número entre 0 y 10 de acuerdo a sus respuestas correctas.");
                        int correccion = scan.nextInt();
                        if (correccion >= 0 && correccion < 4) {
                            System.out.println("Novato");
                        } else {
                            if (correccion >= 4 && correccion < 6) {
                                System.out.println("Aprendiz");
                            } else {
                                if (correccion >= 6 && correccion < 8) {
                                    System.out.println("Bueno");
                                } else {
                                    if (correccion >= 8 && correccion <= 10)
                                        System.out.println("Maestro");
                                }
                            }
                        }
                    }
                }
            }
        }
        scan.close();
    }
}