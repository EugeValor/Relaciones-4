package Entidades;

import java.util.ArrayList;

/**
 *
 * @author 54343
 */
public class Cine {
    private ArrayList<Pelicula> pelicula;

    private String[][] sala;

    private int entrada;

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", entrada=" + entrada + '}';
    }

    public Cine(ArrayList<Pelicula> pelicula, String[][] sala, int entrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.entrada = entrada;
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }

    public void setPelicula(ArrayList<Pelicula> pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

}
