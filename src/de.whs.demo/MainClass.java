package de.whs.demo;

/**
 * Diese Klasse dient zur Demo von einem Verteilten Versionskontroll-
 * system.
 */
public class MainClass {

    public static void main(String[] args) {

        Rechner rechner = new Rechner();

        System.out.println("3 + 4 = " + rechner.addieren(3,4));
        System.out.println("4 - 1 = " + rechner.subtrahieren(4,1));

        System.out.println("Ende");
    }
}