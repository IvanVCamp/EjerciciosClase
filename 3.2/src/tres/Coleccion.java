package tres;

import java.util.Arrays;

public class Coleccion {

    Libro[] libros;
    private String genero;
    private int tamañoColeccion;
    private int nColeccion;

    public Coleccion(String genero, int tamañoColeccion) {
        this.genero = genero;
        this.tamañoColeccion=tamañoColeccion;
        this.libros = new Libro[this.tamañoColeccion];
        this.nColeccion=0;
    }

    void añadirLibro(Libro lib){
        this.libros[this.nColeccion]=lib;
        this.nColeccion++;
    }


    int devuelveAnterior(Libro libro) {
        int cont1=0;
        for (; cont1 < tamañoColeccion; cont1++) {
            if (this.libros[cont1].titulo.equals(libro.titulo)) {
                break;
            }
        }
        if (cont1 >= 1) {
            return (cont1-1);
        }
        else return -1;
    }

    void eliminaLibro(int posicion){
        posicion--;
            for (;posicion < nColeccion;posicion++) {
                if (posicion == tamañoColeccion-1) {
                    libros[posicion] = null;
                }
                else {
                    libros[posicion] = libros[posicion + 1];
                }
            }
            nColeccion--;
        }

    public void mostrarColeccion() {
        for (int i = 0; i < tamañoColeccion; i++) {
            if (i == tamañoColeccion - 1) {
                if (libros[i] != null) {
                    System.out.println(", " + libros[i].titulo + ".");
                } else {
                    System.out.println(".");
                }
            } else if (i == 0 && libros[i] != null) {
                System.out.print(libros[i].titulo);
            } else if (libros[i] != null) {
                System.out.print(", " + libros[i].titulo);
            } else {
                System.out.print("");
            }
        }
    }
}

