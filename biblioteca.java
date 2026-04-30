import java.util.ArrayList;
import java.util.List;

import bibliotecaLuciaSanz.libro;

public class biblioteca {

    private List<libro> libros;

    public biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(libro libro) {
        libros.add(libro);
    }

    public int getNumeroLibros() {
        return libros.size();
    }
}

