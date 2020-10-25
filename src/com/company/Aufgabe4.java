package com.company;
/*
Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise.
Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
z.B. [40 35 70 15 45] => 15
Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann, zurückgibt.
z.B. Preise = [15 45 20], Budget = 30 => 20
Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und USB-Laufwerke, den Geldbetrag
Markus ausgeben wird. Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück.
 Er kauft nur die zwei benötigten Gegenstände.
z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
 */

public class Aufgabe4 {

    public int billig_tast(int [] preiselist){
        int min=10000000;
        for(int i=0;i<preiselist.length;i++)
            if(preiselist[i]<min)
                min=preiselist[i];

        return min;
    }
    public int teuer(int[]tastatur, int[]usb){
        int max1=0,max2=0;
        for(int i=0;i<tastatur.length;i++)
            if(tastatur[i]>max1)
                max1=tastatur[i];
        for(int j=0;j<usb.length;j++)
            if(usb[j]>max2)
                max2=usb[j];

        if(max1>max2)
            return max1;
        else
            return max2;
    }

    public int teuer_usb(int buget, int[]usb) {
        int difmin = 100000;
        int aux = -1;
        for (int i = 0; i < usb.length; i++)
            if(usb[i]<=buget && usb[i]>0)
                if(usb[i]==buget)
                    return usb[i];
                else
                    if (buget-usb[i]<difmin){
                        difmin=buget-usb[i];
                            aux=usb[i];}

        return aux;
    }
    public int ausgegebene_Geld(int buget, int[]preis_tast, int []preis_usb) {
        int max = 0, ok = 0;
        for (int i = 0; i < preis_tast.length; i++) {
            for (int j = 0; j < preis_usb.length; j++) {
                if (preis_tast[i] + preis_usb[j] <= buget) {
                    if (preis_tast[i] + preis_usb[j] > max){
                        max = preis_tast[i] + preis_usb[j];
                        ok=1;}
                }
            }
        }
        if (ok == 1)
            return max;
        else
            return -1;
    }

    public static void main(String[] args) {

    }
}

