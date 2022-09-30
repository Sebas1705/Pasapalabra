package com.sebss.Ayudas;

import com.sebss.Exceptions.EAyudaNoValidaException;
import com.sebss.Palabras.Palabra;

public class Compra extends Ayuda {
    //Constantes:
    public static final int PRECIO_ESTANDAR = 20;
    //End Constantes.
    
    //Variables:
    
    //End Variables.
    
    //Constructor:
    public Compra(int precio, Palabra palabra) throws EAyudaNoValidaException{
        super(precio, palabra);
    }
    //End Constructor.
    
    //Metodos:
    @Override
    public String mostrar_info() {
        return getPalabraAyuda().getPalabra().toString();
    }
    //End Metodos.

    //Gets:
    
    //End Gets.

    //Sets:
    
    //End Sets.
    
}
