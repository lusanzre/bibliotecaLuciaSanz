package bibliotecaLuciaSanz;

public class libro {
    private String titulo;
    private boolean prestado;

    public libro (String titulo){
        this.titulo = titulo;
        this.prestado = false;
    }

    public String dameElTitulo(){
        return titulo;
    }

    public boolean estaPrestado(){
        return prestado;
    }

    public boolean prestarLibro(){
        if (prestado){
            return false;
        }
        prestado = true;
        return true;
    }

    public boolean devolverLibro(){
        if (!prestado){
            return false;
        }
        prestado = false;
        return true;
    }
}
