package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Luis", 30));
        personas.add(new Persona("Carlos", 20));

        Collections.sort(personas);

        for (Persona p : personas) {
            System.out.println(p);
        }

        comparaToString();
    }


    public static void comparaToString(){
        String a = "Ana";
        String b = "Carlos";

        int resultado = a.compareTo(b);

        if (resultado < 0) {
            System.out.println(a + " va antes que " + b);
        } else if (resultado > 0) {
            System.out.println(a + " va después que " + b);
        } else {
            System.out.println(a + " es igual a " + b);
        }
    }
}