
/*
CONDICIONAL ANIDADA: Se desea saber cuanto se debe pagar a un
empleado, considerando que si gana menos
de S/. 1000 se le dará un bono del 20%, de
lo contrario ganará un bono de 10% siempre
que no gane más de S/. 5000 en cuyo caso
sólo recibirá un bono del 5%

POR: Fiorela Clariza Quispe Quispe
*/

import java.util.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        double sueldo, aumento;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido(a), a continuación ingrese su sueldo:");
        sueldo = scan.nextDouble();
        scan.close();
        // Aplicando condicional anidado
        if (sueldo < 1000) {
            aumento = (double) Math.floor(Math.round(sueldo * 1.2) * 100) / 100;
            System.out.println("Usted es acreedor del bono por 20%, por lo tanto recibirá "
                    + String.format("%.2f", aumento) + " soles");
        } else { 
            if (sueldo < 5000) {
                aumento = (double) Math.floor(Math.round(sueldo * 1.1) * 100) / 100;
                System.out.println("Usted es acreedor del bono por 10%, por lo tanto recibirá "
                        + String.format("%.2f", aumento) + " soles");
            } else {
                aumento = (double) Math.floor(Math.round(sueldo * 1.05) * 100) / 100;
                System.out.println("Usted es acreedor del bono por 5%, por lo tanto recibirá "
                        + String.format("%.2f", aumento) + " soles");
            }
        }
    }
}
