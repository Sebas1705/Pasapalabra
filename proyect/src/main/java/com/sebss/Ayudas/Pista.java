package com.sebss.Ayudas;

import com.sebss.Exceptions.EAyudaNoValidaException;
import com.sebss.Palabras.Palabra;

public abstract class Pista extends Ayuda {
    
    //Constantes:
    public static final int PRECIO_ESTANDAR = 5;
    //End Constantes.
    
    //Variables:
    
    //End Variables.
    
    //Constructor:
    public Pista(int precio, Palabra palabra) throws EAyudaNoValidaException{
        super(precio, palabra);
    }
    //End Constructor.
    
    //Metodos:
    
    //End Metodos.

    //Gets:
    
    //End Gets.

    //Sets:
    
    //End Sets.
    
}
