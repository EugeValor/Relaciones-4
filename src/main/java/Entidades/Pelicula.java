package Entidades;

/**
 *
 * @author 54343
 */
public class Pelicula {
    
    private String titulo;

    private String duracion;

    private String director;

    private int edadMin;

    public Pelicula(String titulo, String duracion, String director, int edadMin) {
        this.titulo=titulo;
        this.duracion=duracion;
        this.director=director;
        this.edadMin=edadMin;
    }

    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", director=" + director + ", edadMin=" + edadMin + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    } 
}
