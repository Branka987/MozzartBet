package com.company;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main extends Thread {

    public static void main(String[] args) {

        Date vreme = new Date();
        SimpleDateFormat fomat = new SimpleDateFormat("HH:mm");
        System.out.println("Vreme je: " + fomat.format(vreme));
        Thread thread = new Thread();
        int brojac = 1;
        Scanner sc = new Scanner(System.in);
        try {
            while (brojac <= 20) {

                Igraci igrac = new Igraci();// da smo stavili iznad on bi generisao brojeve jos 7 puta
                for (int i = 0; i < 15; i++) {
                    igrac.izvuciBroj();
                }
                ArrayList<Integer> brojevi = new ArrayList<>();
                System.out.println("Unesi petnaest brojeva: ");
                for (int i = 0; i < 15; i++) {
                    brojevi.add(Integer.parseInt(sc.nextLine()));

                }
                System.out.println("Broj pogodaka " + igrac.brPogodaka(brojevi));
                System.out.println("Dobitna kombinacija: " + igrac);


                Thread.sleep(1000 *60*5);
                brojac++;


            }


        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}

