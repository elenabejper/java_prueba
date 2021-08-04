
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class TestLibro {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate fechaAdquisicion = LocalDate.of(2015, 01, 06);
        Libro libro1 = new Libro("Divergente", "Veronica Roth", 463, fechaAdquisicion, GeneroLibro.NOVELA );
        Libro libro2 = new Libro("Insurgente", "Veronica Roth", 463, fechaAdquisicion, GeneroLibro.NOVELA);
        System.out.println(libro1);
        libro1.setTitulo("Leal");
        libro1.setNumeroPaginas(491);
        System.out.println(libro1);
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        System.out.println(listaLibros);

    }
}
