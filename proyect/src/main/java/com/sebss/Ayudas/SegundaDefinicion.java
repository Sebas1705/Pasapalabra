package com.sebss.Ayudas;

import com.sebss.Exceptions.EAyudaNoValidaException;
import com.sebss.Palabras.Palabra;

public class SegundaDefinicion extends Pista {
    
    //Variables:
    
    //End Variables.
    
    //Constructor:
    public SegundaDefinicion(int precio, Palabra palabra) throws EAyudaNoValidaException{
        super(precio, palabra);
    }
    //End Constructor.
    
    //Metodos:
    @Override
    public String mostrar_info() {
        return getPalabraAyuda().getDef2().toString();
    }
    //End Metodos.

    //Gets:
    
    //End Gets.

    //Sets:
    
    //End Sets.
    
}
