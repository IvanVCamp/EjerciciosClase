package tres;

public class Main {

    public static void main(String[] args) {
        int pos;
        Libro Lib1 = new Libro(20, 12345678, "Brandon Sanaderson", "El camino de los reyes");
        Libro Lib2 = new Libro(200, 212213341, "Brandon Sanderson", "Palabras radiantes");
        Libro Lib3 = new Libro(400,87654321,"Brandon Sanderson","Juramentada");
        Libro Lib4 = new Libro(500,13245678,"Brandon Sanderson","El ritmo de la guerra");
        Coleccion c1 = new Coleccion("Fantasia",4);
        c1.añadirLibro(Lib1);
        c1.añadirLibro(Lib2);
        c1.añadirLibro(Lib3);
        c1.añadirLibro(Lib4);
        pos = c1.devuelveAnterior(Lib2);
        if(pos != -1){
            System.out.println("El anterior a "+c1.libros[pos+1].titulo+" es "+c1.libros[pos].titulo);
        }
        else{
            System.out.println("El libro no tiene otro precediendolo");
        }
        c1.mostrarColeccion();
        c1.eliminaLibro(1);
        c1.mostrarColeccion();
        c1.añadirLibro(Lib1);
        c1.mostrarColeccion();
    }
}
