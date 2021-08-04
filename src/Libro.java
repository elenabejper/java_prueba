import java.time.*;

public class Libro {

    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private LocalDate fechaAdquisicion;
    private GeneroLibro genero;

    //metodo constructor
    public Libro(String titulo, String autor, Integer numeroPaginas, LocalDate fechaAdquisicion, GeneroLibro genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.fechaAdquisicion = fechaAdquisicion;
        this.genero = genero;
    }

    //Getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String t) {
        titulo = t;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String a) {
        autor = a;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(Integer np) {
        numeroPaginas = np;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }
    public void setFechaAdquisicion(LocalDate fa) {
        fechaAdquisicion = fa;
    }

    public GeneroLibro getGenero() {
        return genero;
    }
    public void setGenero(GeneroLibro g) {
        genero = g;
    }

    //toString
    public String toString() {
        return "Libro[titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + ", fechaAdquisicion=" + fechaAdquisicion + ", genero=" + genero + "]";
    }
}
