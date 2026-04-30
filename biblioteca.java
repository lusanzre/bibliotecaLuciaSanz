package bibliotecaLuciaSanz;
import java.util.ArrayList;
import java.util.List;

public class biblioteca {

    private List<libro> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    public void añadirLibro(libro libro) {
        libros.add(libro);
    }

    public int darNumeroLibros() {
        return libros.size();
    }
}

