package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public class Bedrijf  implements Iterable<String> {


    private HashMap <String, Integer> werknemers = new HashMap<>();


    public void neemInDienst(String naamWerknemer) {

        werknemers.put(naamWerknemer, 20);
    }

    public void neemVakantie(String naamWerknemer, int aantal) {

        if (werknemers.get(naamWerknemer) == null)
            throw new IllegalArgumentException("Werknemer is niet in dienst.");

        else if (werknemers.get(naamWerknemer) < aantal)
            throw new IllegalArgumentException("Niet genoeg vakantie.");

        else {
            int resultaat = werknemers.get(naamWerknemer) - aantal;

            werknemers.put(naamWerknemer, resultaat);
        }
    }


    public void ontsla(String naamWerknemer) {

        if (werknemers.get(naamWerknemer) == null)
            throw new IllegalArgumentException("Werknemer is niet in dienst.");

        werknemers.remove(naamWerknemer);
    }

    public int getVakantieDagen(String naamWerknemer) {
        return werknemers.get(naamWerknemer);
    }


    @Override
    public Iterator<String> iterator() {

        return werknemers.keySet().iterator();
    }
}
