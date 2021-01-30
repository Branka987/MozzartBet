package com.company;

import java.util.ArrayList;
import java.util.Random;

public class izvuceniBrojevi {
    private Random brojac;
    private ArrayList<Integer> izvuceniBr;

    public izvuceniBrojevi(Random brojac, ArrayList<Integer> izvuceniBr) {
        this.brojac = new Random();
        this.izvuceniBr = new ArrayList<>();
    }

    public Random getBrojac() {
        return brojac;
    }

    public ArrayList<Integer> getIzvuceniBr() {
        return izvuceniBr;
    }
    public void dobijeniBr() {
        int broj = brojac.nextInt(80) + 1;
        int i = 0;

        while (i < 15) {
            if (istiBroj(broj)) {

                izvuceniBr.add(broj);
            }
        }
        }
        public boolean istiBroj( int broj){
            for (int br : izvuceniBr) {
                if (br == broj) {
                    return false;
                }
            }
            return true;
        }
    }
