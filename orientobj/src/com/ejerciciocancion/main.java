package com.ejerciciocancion;

import java.time.LocalDate;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ExcepcionesClase {

        Usuario usuario1 = new Usuario("Marioporrita", "marporde2@gmail.com", "patata", false);
        Lista lista1 = new Lista(usuario1, "Mi lista 1", 2000, LocalDate.of(2023, 12, 25), null);

        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {

            System.out.println("\n1) Añadir canciones");
            System.out.println("2) Mostrar lista");
            System.out.println("3) Eliminar canción (por título)");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            op = Integer.parseInt(sc.nextLine());

            if (op == 1) {
                String seguir = "s";

                while (seguir.equalsIgnoreCase("s")) {

                	    System.out.print("Título: ");
                	    String titulo = sc.nextLine();

                	    System.out.print("Artista: ");
                	    String artista = sc.nextLine();

                	    System.out.print("Duración (x.xx): ");
                	    double duracion = Double.parseDouble(sc.nextLine());

                	    System.out.print("Disco: ");
                	    String disco = sc.nextLine();

                	    System.out.print("Año: ");
                	    int anio = Integer.parseInt(sc.nextLine());

                	    System.out.print("Reproducciones: ");
                	    int reproducciones = Integer.parseInt(sc.nextLine());

                	    Cancion c = new Cancion(titulo, artista, duracion, disco, anio, reproducciones);
                	    lista1.agregarCanciones(c);

                	    System.out.println("Canción añadida");


            } 
                
            }else if (op == 2) {

                lista1.mostrarLista();

            } else if (op == 3) {
                System.out.print("Título a eliminar: ");
                String tituloEliminar = sc.nextLine();

                Cancion aux = new Cancion(tituloEliminar, "", 0.0, "", 0, 0);

                lista1.eliminarCanciones(aux);

            } else if (op == 0) {
                System.out.println("Saliendo...");

            } else {
                System.out.println("Opción no válida");
            }
        }

        sc.close();
    }
    }



