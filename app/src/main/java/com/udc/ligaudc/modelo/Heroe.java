package com.udc.ligaudc.modelo;

public class Heroe {
    /**
     * clase heroe estructura de superheroes
     */
    private String nombre;
    private int imagen;

    /**
     * constructor
     * @param nombre
     * @param imagen
     */

    public Heroe(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    /**
     * metodos setter and getter
     *
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
