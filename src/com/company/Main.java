package com.company;

public class Main {


    public static void main(String[] args) {

        Bedrijf bedrijf = new Bedrijf();

        bedrijf.neemInDienst("Karen");
        bedrijf.neemInDienst("Kristel");
        bedrijf.neemInDienst("Kathleen");
        bedrijf.neemVakantie("Karen", 10);

        System.out.println("Onbestaande werknemer vakatie laten nemen");

        try {
            bedrijf.neemVakantie("Josje", 10);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Teveel vakantie laten opnemen");

        try {
            bedrijf.neemVakantie("Karen", 11);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Onbekende werknemer ontslaan");

        try {
            bedrijf.ontsla("Josje");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        bedrijf.ontsla("Kathleen");

        for (String naam : bedrijf) {
            System.out.printf("%s heeft nog %d vakantiedagen%n", naam, bedrijf.getVakantieDagen(naam));
        }
    }
}


/*
Onbestaande werknemer vakantie laten nemen
Werknemer is niet in dienst
Teveel vakantie laten opnemen
Niet genoeg vakantie
Onbekende werknemer ontslaan
Werknemer is niet in dienst
Kristel heeft nog 20 vakantiedagen
Karen heeft nog 10 vakantiedagen
 */
