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
        ArrayList[] h = catalogoPersonajes.getVector();
        for (ArrayList h1 : h) {
            for (int j = 0; j < h1.size(); j++) {
                System.out.println(h1.get(j).toString());
            }
        }
        do {
            System.out.println("---- Catalogo personajes ---");
            System.out.println("1. Crear personaje");
            if (!catalogoPersonajes.getCatalogo().isEmpty()) {
                System.out.println("2. Seleccion de personaje");
            }
            System.out.println("3. Salir\n");
            op = t.nextInt();
            switch (op) {
                case 1:
                    crearPersonaje(catalogoPersonajes);
                    break;
                case 2:
                    if (catalogoPersonajes.getCatalogo().isEmpty()) {
                        System.out.println("Error: Opciones permitidas solo de 1 y 3.\n");
                    } else {
                        mostrarPersonaje(catalogoPersonajes);
                    }
                    break;
                case 3:

                    //System.out.println("Saliendo...");
                    break;
                default:
                    if (catalogoPersonajes.getCatalogo().isEmpty()) {
                        System.out.println("Error: Opciones permitidas solo de 1 y 3.\n");
                    } else {
                        System.out.println("Error: Opciones permitidas solo de 1 a 3.\n");
                    }

            }
        } while (op != 3);

    }

    public static void crearPersonaje(CCatalogoPersonajePrototipo catalogoPersonajes) {
        Scanner t = new Scanner(System.in);
        int op;
        do {
            System.out.println("---- Creacion de personajes ---");
            System.out.println("1. Crear Heroe\n2. Crear Principe\n3. Crear Monstruo\n4. Crear Villano\n5. Regresar");

            op = t.nextInt();
            switch (op) {
                case 1:
                    op = crearHeroe(catalogoPersonajes);
                    break;
                case 2:
                    crearPrincipe(catalogoPersonajes);
                    break;
                case 3:
                    crearMonstruo(catalogoPersonajes);
                    break;
                case 4:
                    crearVillano(catalogoPersonajes);
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
            }
        } while (op != 5);
    }

    static int crearHeroe(CCatalogoPersonajePrototipo catalogoPersonajes) {
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
        catalogoPersonajes.addPersonaje("Heroe", heroe);
        System.out.println("Heroe creado");
        //t.next();
        return 5;
    }

    public static int crearPrincipe(CCatalogoPersonajePrototipo catalogoPersonajes) {
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
        CPrincipe principe = new CPrincipe(nombre, img, peso, altura, inteligencia, habilidad);
        catalogoPersonajes.addPersonaje("Principe", principe);
        System.out.println("Principe creado");
        //t.next();
        return 5;
    }

    public static int crearMonstruo(CCatalogoPersonajePrototipo catalogoPersonajes) {
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
        CMonstruo monstruo = new CMonstruo(nombre, img, peso, altura, inteligencia, habilidad);
        catalogoPersonajes.addPersonaje("Monstruo", monstruo);
        System.out.println("Monstruo creado");
        //t.next();
        return 5;
    }

    private static int crearVillano(CCatalogoPersonajePrototipo catalogoPersonajes) {
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
        CVillano monstruo = new CVillano(nombre, img, peso, altura, inteligencia, habilidad);
        catalogoPersonajes.addPersonaje("Villano", monstruo);
        System.out.println("Monstruo creado");
        //t.next();
        return 5;
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

    private static void mostrarPersonaje(CCatalogoPersonajePrototipo catalogoPersonajes) {
        if (catalogoPersonajes.getCatalogo().containsKey("Heroe")) {
            System.out.println(catalogoPersonajes.getPersonaje("Heroe"));
        }
        if (catalogoPersonajes.getCatalogo().containsKey("Principe")) {
            System.out.println(catalogoPersonajes.getPersonaje("Principe"));
        }
        if (catalogoPersonajes.getCatalogo().containsKey("Monstruo")) {
            System.out.println(catalogoPersonajes.getPersonaje("Monstruo"));
        }
    }

}
