/*
Uso de ArrayList
 */
package usoarraylist;

import java.util.ArrayList;

/**
 *
 * @author carlosjoseanguiano
 */
public class UsoArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombre = new ArrayList<String>();
        
        nombre.add("Carlos");
        nombre.add("Jose");
        nombre.add("Anguiano");
        
        System.out.println(nombre);
        
        //Agregar valores por indice
        nombre.add(1,"Prueba Uno");
        System.out.println(nombre);
        //Remover valores
        nombre.remove(0);
        System.out.println(nombre);
        //Sobreescribir valores
        nombre.set(0, "JoseGael");
        System.out.println(nombre);
        //Obtener valores
        String a = nombre.get(1);
        System.out.println(a);
        //Obtener valores del ultimo 
        String b = nombre.get(nombre.size()-1);
        System.out.println(b);
        
        System.out.println(a + " " + b);
    }
    
}
