/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OppositeDragon
 */
public class MainJuego {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int op;
        CCatalogoPersonajePrototipo catalogoPersonajes = new CCatalogoPersonajePrototipo();
        ArrayList[] vp = catalogoPersonajes.getVector();
        for (ArrayList cpi : vp) {
            for (int j = 0; j < cpi.size(); j++) {
                System.out.println(cpi.get(j).toString());
            }
        }

        do {
            System.out.println("---- Catalogo personajes ---");
            System.out.println("1. Crear personaje\n2. Seleccion de personaje\n3. Salir\n");
            op = t.nextInt();
            switch (op) {
                case 1:
                    crearPersonajes(vp);
                    break;
                case 2:
                    seleccionarPersonajes(vp);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error: Opciones permitidas solo de 1 a 3.\n");
            }
        } while (op != 3);

    }

    public static String elegirHabilidad() {
        Scanner t = new Scanner(System.in);
        int h;
        do {
            System.out.println("Habilidades:\n1. Necromancer\n2. Ambusher\n3. Sniper");
            h = t.nextInt();
            switch (h) {
                case 1:
                    return "Necromancer";
                case 2:
                    return "Ambusher";
                case 3:
                    return "Sniper";
                default:
                    System.out.println("Solo opciones del 1 al 3");
            }

        } while (h < 1 || h > 3);
        return null;
    }

    private static void crearPersonajes(ArrayList[] vp) {
        Scanner t = new Scanner(System.in);
        int op;
        do {
            System.out.println("---- Creacion de personajes ---");
            System.out.println("1. Crear Heroe\n2. Crear Monstruo\n3. Crear Principe\n4. Crear Villano\n5. Regresar");

            op = t.nextInt();
            switch (op) {
                case 1:
                    op = crearHeroes(vp[0]);
                    break;
                case 2:
                    op = crearMonstruos(vp[1]);
                    break;
                case 3:
                    op = crearPrincipes(vp[2]);
                    break;
                case 4:
                    op = crearVillanos(vp[3]);
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
            }
        } while (op != 5);
    }

    private static int crearHeroes(ArrayList lh) {
        Scanner t = new Scanner(System.in);
        System.out.println("\nNombre:");
        String nombre = t.nextLine();
        System.out.println("Nombre imagen:");
        String img = t.nextLine();
        System.out.println("Peso (kg):");
        double peso = Double.parseDouble(t.nextLine());
        System.out.println("Altura (cm):");
        double altura = Double.parseDouble(t.nextLine());
        System.out.println("Inteligencia (1-10):");
        double inteligencia = Double.parseDouble(t.nextLine());
        String habilidad = elegirHabilidad();
        CHeroe heroe = new CHeroe(nombre, img, peso, altura, inteligencia, habilidad);
        heroe.clonar();
        lh.add(heroe);
        System.out.println("Heroe creado");
        //t.next();
        return 5;
    }

    private static int crearMonstruos(ArrayList lm) {
        Scanner t = new Scanner(System.in);
        System.out.println("\nNombre:");
        String nombre = t.nextLine();
        System.out.println("Nombre imagen:");
        String img = t.nextLine();
        System.out.println("Peso (kg):");
        double peso = Double.parseDouble(t.nextLine());
        System.out.println("Altura (cm):");
        double altura = Double.parseDouble(t.nextLine());
        System.out.println("Inteligencia (1-10):");
        double inteligencia = Double.parseDouble(t.nextLine());
        String habilidad = elegirHabilidad();
        CMonstruo m = new CMonstruo(nombre, img, peso, altura, inteligencia, habilidad);
        lm.add(m);
        System.out.println("Monstruo creado");
        //t.next();
        return 5;
    }

    private static int crearPrincipes(ArrayList lp) {
        Scanner t = new Scanner(System.in);
        System.out.println("\nNombre:");
        String nombre = t.nextLine();
        System.out.println("Nombre imagen:");
        String img = t.nextLine();
        System.out.println("Peso (kg):");
        double peso = Double.parseDouble(t.nextLine());
        System.out.println("Altura (cm):");
        double altura = Double.parseDouble(t.nextLine());
        System.out.println("Inteligencia (1-10):");
        double inteligencia = Double.parseDouble(t.nextLine());
        String habilidad = elegirHabilidad();
        CPrincipe p = new CPrincipe(nombre, img, peso, altura, inteligencia, habilidad);
        lp.add(p);
        System.out.println("Principe creado");
        //t.next();
        return 5;
    }

    private static int crearVillanos(ArrayList lv) {
        Scanner t = new Scanner(System.in);
        System.out.println("\nNombre:");
        String nombre = t.nextLine();
        System.out.println("Nombre imagen:");
        String img = t.nextLine();
        System.out.println("Peso (kg):");
        double peso = Double.parseDouble(t.nextLine());
        System.out.println("Altura (cm):");
        double altura = Double.parseDouble(t.nextLine());
        System.out.println("Inteligencia (1-10):");
        double inteligencia = Double.parseDouble(t.nextLine());
        String habilidad = elegirHabilidad();
        CVillano v = new CVillano(nombre, img, peso, altura, inteligencia, habilidad);
        lv.add(v);
        System.out.println("Villano creado");
        //t.next();
        return 5;
    }

    private static void seleccionarPersonajes(ArrayList[] vp) {
        Scanner t = new Scanner(System.in);
        int op;
        do {
            System.out.println("---- Seleccion de personajes ---");
            System.out.println("1. Seleccionar heroes\n2. Seleccionar monstruos\n3. Seleccionar principes\n4. Seleccionar villanos\n5. Regresar");

            op = t.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < vp[0].size(); i++) {
                        System.out.println(vp[0].get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < vp[1].size(); i++) {
                        System.out.println(vp[1].get(i));
                    }
                    break;
                case 3:
                    for (int i = 0; i < vp[2].size(); i++) {
                        System.out.println(vp[2].get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < vp[3].size(); i++) {
                        System.out.println(vp[3].get(i));
                    }
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
            }
        } while (op != 5);
    }

}
