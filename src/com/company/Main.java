package com.company;
import java.math.BigInteger;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Catalog a=new Catalog();
        int array[]= new int[]{58,30,40,76,84};
        System.out.println("Aufgabe 1");
        System.out.println("Nicht ausreichende Noten: "+Arrays.toString(a.nicht_ausreichend(array)));
        System.out.println("Durchschnitt: " + a.durchschnitt(array));
        System.out.println("abgerundet: " + Arrays.toString(a.abgerundeteArray(array)));
        System.out.println("Maximal abgerundet: " + a.maxabgerundet(array));
        System.out.println("\nAufgabe 2");
        Aufgabe2 b= new Aufgabe2();
        int v[]=new int[]{2,3,10,20,14};
        System.out.println("Max Zahl: " + b.max(v));
        System.out.println("min zahl: " + b.min(v));
        System.out.println("max sum: " + b.maxsum(v));
        System.out.println("Min Summe: " + b.minsum(v));
        System.out.println("\nAufgabe 3");
        Aufgabe3 c= new Aufgabe3();
        int x[]=new int[]{2, 3, 6, 0, 0, 0, 0, 0, 0};
        int y[]=new int[]{5, 4, 0, 0, 0, 0, 0, 0, 0};
        int n=2;
        System.out.println("Summe big " + c.summe(x,y));
        System.out.println("Diff big " + c.differenz(x,y));
        System.out.println("Multiplikation Big " + c.multiplikation(x,n));
        System.out.println("Division Big" + c.division(x,n));


        System.out.println("\nAufgabe 4");
        Aufgabe4 d=new Aufgabe4();
        int tast[]=new int[]{12,45,67,31,50};
        int usb[]=new int[]{15,20,45,80,18};
        int buget=50;
        System.out.println("billigste Tastatur: "+ d.billig_tast(tast));
        System.out.println("teuerste gegenstand: "+ d.teuer(tast,usb));
        System.out.println("teuerste usb: "+ d.teuer_usb(buget,usb));
        System.out.println("ausgegebene geld: "+ d.ausgegebene_Geld(buget,tast,usb));


    }
}
