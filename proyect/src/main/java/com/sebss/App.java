package com.sebss;

import com.sebss.Interfaz.VentanaPrincipal;

// import java.io.*;
// import com.sebss.Almacenes.Almacen_Palabras;
// import com.sebss.Exceptions.EPalabraNoValidaException;
// import com.sebss.Palabras.Definicion;
// import com.sebss.Palabras.Palabra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new VentanaPrincipal().setVisible(true);
        // "data/bin/ResumenPalabrasPorDefecto.txt"
        // Almacen_Palabras a = new Almacen_Palabras();
        // try {
        //     BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("data/bin/ResumenPalabrasPorDefecto.txt"),"UTF-8"));
        //     String texto=reader.readLine();
        //     while(texto!=null){
        //         while(texto.startsWith(" Palabra:")){
        //             String palabra=texto.substring(10,texto.length());
        //             System.out.println(palabra);
        //             texto=reader.readLine();
        //             String def1=texto.substring(7,texto.length());
        //             System.out.println(def1);
        //             texto=reader.readLine();
        //             String def2=texto.substring(7,texto.length());
        //             System.out.println(def2);
        //             System.out.println("--------------------------");
        //             a.añadirPalabra(new Palabra(palabra.charAt(0),palabra,new Definicion(def1),new Definicion(def2)));
        //         }
        //         texto=reader.readLine();
        //     }
        //     reader.close();
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // try {
        //     a.grabarFichero("data/bin/Palabras.data");
        // } catch (IOException e) {
        //     System.out.println(e.getMessage());
        // }
        // try {
        //     a.cargarFichero("data/bin/Palabras.data");
        // } catch (ClassNotFoundException | IOException e) {
        //     e.printStackTrace();
        // }
        // System.out.println(a.stringAlmacenPalabras());
    }
}
