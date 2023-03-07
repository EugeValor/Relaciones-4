package Servicio;

import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author 54343
 */
public class ServicioCine {
    
    int cont = 0;
    String[] nombres = {"Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero", "Pablo", "Anita", "Mariana", "Facu", "Leo", "Barbara", "Mile", "Lero"};
    ArrayList<Espectador> publico = new ArrayList();
    ArrayList<Pelicula> cartelera = new ArrayList();
    String[][] sala = new String[8][6];
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Cine c = new Cine(cartelera, sala, 000);

    public void crearEspectadores() {

        for (String nombre : nombres) {
            int ed = (int) ((Math.random() * 55) + 10);
            int din = (int) ((Math.random() * 4800) + 200);
            Espectador es1 = new Espectador(nombre, ed, din);
            publico.add(es1);
        }
        System.out.println("Cantidad de espectadorxs: "+publico.size());
    }

    public void crearPeliculas() {
        int op;
        do {
            System.out.println("Ingrese el nombre de la Peli");
            String nombre = sc.next();
            System.out.println("Ingrese el Director de la peli");
            String director = sc.next();
            System.out.println("Ingrese la Duracion");
            String duracion = sc.next();
            System.out.println("Edad minima:");
            int edadMin = sc.nextInt();

            Pelicula p1 = new Pelicula(nombre, duracion, director, edadMin);
            cartelera.add(p1);
            System.out.println("¿Desea agregar otra Pelicula? 1=si/2=no");
            op = sc.nextInt();
        } while (op != 2);
    }

    public void llenarSala() {

        int aux = 9;
        for (int i = 0; i <= 7; i++) {
            aux--;
            for (int j = 0; j <= 5; j++) {
                switch (j) {
                    case 0:
                        sala[i][j] = (aux) + " A";
                        break;
                    case 1:
                        sala[i][j] = (aux) + " B";
                        break;
                    case 2:
                        sala[i][j] = (aux) + " C";
                        break;
                    case 3:
                        sala[i][j] = (aux) + " D";
                        break;
                    case 4:
                        sala[i][j] = (aux) + " E";
                        break;
                    case 5:
                        sala[i][j] = (aux) + " F";
                        break;
                    default:
                        break;
                }
            }
        }
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(sala[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
    }

    public void meterGente() {

        for (Espectador che : publico) {
            if (che.getEdad() >= cartelera.get(0).getEdadMin() && che.getDineroDisp() >= c.getEntrada() && cont < 48) {
                do {
                    int fila = (int) (Math.random() * 8);
                    int col = (int) (Math.random() * 6);
                    if (!sala[fila][col].contains("X")) {
                        cont++;
                        sala[fila][col] += " X";
                        break;
                    }
                } while (cont <= 48);

            }
        }
    }

    public void mostrarSala() {
        System.out.println("Los asientos fueron asignados bajo la siguiente distribucion.");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(sala[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
            
        }
        if (cont == 48) {
                System.out.println("La sala esta completa.");
            }
    }
}
