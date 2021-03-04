/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Arancha
 */
public class appRuletaRusa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Un juego para los que buscan quizás el modo de dejar su mundo atrás \n"
                + "una vez empezado no hay vuelta atrás\n"
                + "hasta que pulses la letra - FIN -  \n"
                + "******** C O M E N Z A M O S *********");

        System.out.println("Cuantos jugadores sois? max 10");
        int jugadores = teclado.nextInt();

        JugadorRuso arrayDeRusos[] = new JugadorRuso[jugadores];
        if (jugadores > 0 && jugadores < 11) {
            for (int i = 0; i < arrayDeRusos.length; i++) {
                System.out.println("Nombre del jugador --> " + i);
                String nombre = teclado.next();
                arrayDeRusos[i] = new JugadorRuso(nombre);
            }
        }
        String menu2 = "1 - Avanzar cilindro aleatoriamene \n"
                + "2 - Dispara! \n"
                + "3 - Pista c:\n"
                + "4 - Comprobar jugadores vivos \n"
                + "5 - Fin \n";

        //creamos los revolver
        Revolver r1 = new Revolver();
        Revolver r2 = new Revolver();

        System.out.println(menu2);
        int respuesta = teclado.nextInt();

        while (respuesta != 5) {
            switch (respuesta) {
                case 1:
                    System.out.println("que revolver quieres girar 1 o 2 ");
                    int resp1 = teclado.nextInt();
                    if (resp1 == 1) {
                        r1.girarCilindro();
                    } else if (resp1 == 2) {
                        r2.girarCilindro();
                    } else {
                        System.out.println("Pero que numero has metidoo? 1 o 2 prueba otra vez anda...");
                    }
                    System.out.println(menu2);
                    respuesta = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("Que revolver quieres disparar 1 / 2");
                    int resp2 = teclado.nextInt();
                    if (resp2 == 1) {
                        for (int i = 0; i < arrayDeRusos.length; i++) {
                            arrayDeRusos[i].seDispara(r1);
                        }
                        System.out.println("Todos los jugadores se han disparado con el revolver 1");
                    } else {
                        for (int i = 0; i < arrayDeRusos.length; i++) {
                            arrayDeRusos[i].seDispara(r2);
                        }
                        System.out.println("Todos los jugadores se han disparado con el revolver 2");
                    }
                    System.out.println(menu2);
                    respuesta = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("Pista del revolver 1 ");
                    r1.mirarPosiciones();
                    System.out.println("Pista del revolver 2 ");
                    r2.mirarPosiciones();
                    System.out.println(menu2);
                    respuesta = teclado.nextInt();
                    break;
                case 4:
                    for (int i = 0; i < arrayDeRusos.length; i++) {
                        arrayDeRusos[i].isVivo();
                    }
                    System.out.println(menu2);
                    respuesta = teclado.nextInt();
                    break;
                default:
                    System.out.println("ERROR -1");
            }
        }

    }
}
