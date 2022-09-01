
/*
SWITCH: Resolver en Java
Se desea saber el nivel de una persona
según la cantidad de respuestas correctas:
4: gran maestro
3: maestro
2: prospecto
1: aprendiz
0: novato

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        int respuestascorrectas;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido(a), a continuación ingrese la cantidad de respuestas correctas:");
        respuestascorrectas = scan.nextInt();
        scan.close();
        switch (respuestascorrectas) {
            case 0: System.out.print("Novato");
            break;
            case 1: System.out.print("Aprendiz");
            break;
            case 2: System.out.print("Prospecto");
            break;
            case 3: System.out.print("Maestro");
            break;
            case 4: System.out.print("Gran Maestro");
            break;
        }
    }
}