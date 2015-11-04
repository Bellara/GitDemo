package de.whs.demo;

/**
 * Created by Maren on 04.11.15.
 */
public class Rechner {

    public int addieren(int a, int b){
        return a + b;
    }

    public int subtrahieren(int a, int b){
        return a - b;
    }

    public int multiplizieren(int a, int b){
        return a * b;
    }

    public int dividieren(int a, int b){
        if(b != 0){
            return a / b;
        }
        else {
            throw new IllegalArgumentException("Divisor cannot be 0. Please change");
        }
    }

}
