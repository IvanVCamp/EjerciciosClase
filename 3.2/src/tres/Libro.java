package tres;

public class Libro {
    int paginas;
    int pagina_actual;
    double isbn;
    String autor;
    String titulo;
    String [] contenido;


    public Libro(int paginas, double isbn, String autor, String titulo){
        this.paginas=paginas;
        this.pagina_actual=0;
        this.isbn=isbn;
        this.autor=autor;
        this.titulo=titulo;
        this.contenido=new String[paginas];
    }


    public Libro(){
        this.paginas=0;
        this.isbn=0;
        this.autor=null;
        this.titulo=null;
        this.contenido=new String[1];
    }

    void setPaginas(int paginas){this.paginas=paginas;}
    int getPaginas(){return this.paginas;}

    void setAutor(String autor){this.autor=autor;}
    String getAutor(){return this.autor;}

    void setIsbn(double isbn){this.isbn=isbn;}
    double getIsbn(){return this.isbn;}

    void setTitulo(String titulo){this.titulo=titulo;}
    String getTitulo(){return this.titulo;}

    void setContenido(String [] contenido){this.contenido=contenido;}
    String [] getContenido(){return this.contenido;}
}
