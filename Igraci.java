package com.company;



import java.util.ArrayList;

import java.util.Random;

public class Igraci {
    private Random generator;
    private ArrayList<Integer>brojevi;


    public Igraci() {
        this.generator = new Random();
        this.brojevi = new ArrayList<>();
    }

    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }
    public void izvuciBroj() {
        while(true){
        int broj = generator.nextInt(80) + 1;
        if (neSadrziBr(broj)) {
            brojevi.add(broj);
            break;
        }
    }
    }
    public boolean neSadrziBr(int broj){
        for (int br: brojevi){
            if(br == broj){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String p ="";
        for(int i =0;i<brojevi.size();i++){
            p += brojevi.get(i);
            if (i < brojevi.size() -1){
                p+=", ";
            }
            else {
                p+= ".\n";
            }


        }
        p+= "Sledeca igra pocinje za 5 min.";
        return p;
    }
    public int brPogodaka( ArrayList<Integer> izvuceniBrojevi ){
        int brPogodaka = 0;
        for (int br: brojevi ){
            for (int br1: izvuceniBrojevi){
                if (br == br1){
                    brPogodaka++;
                    break;
                }
            }
        }
        return brPogodaka;
    }
}
