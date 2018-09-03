package com.company;

import java.util.Iterator;

public class Bedrijf implements Iterable<Bedrijf> {


    private String naamWerknemer;
    private int vakantiedagen;


    public void neemInDienst(String naamWerknemer) {
        this.naamWerknemer = naamWerknemer;
    }

    public void neemVakantie(String naamWerknemer, int aantal) {
        vakantiedagen = aantal;
    }

    public void ontsla(String naamWerknemer) {
        this.naamWerknemer = naamWerknemer;
    }

    public int getVakantieDagen(String naamWerknemer) {
        return vakantiedagen;
    }

/*
    public Iterator<Bedrijf> iterator() {
        Iterator <Bedrijf> iterator = this.iterator();

        while (iterator.hasNext()) {

            return iterator.next();

        }
    }
*/


}
