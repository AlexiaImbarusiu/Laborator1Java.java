package com.company;
/*
     ----------------------------------------------------------------------------------------------------------------
    Die Java Universität hat die folgenden Benotung Regel:
    Jeder Student bekommt eine Note zwischen 0 und 100.
    Eine Note weniger als 40 ist eine nicht ausreichende Note.
    Der Professor rundet die Note mit die folgenden Regel ab:
    Ob die Differenz zwischen die Note und die nächste multipel von 5 weniger als 3 ist, dann wird die Note zu die nächste multipel von 5 abgerundet.
    Ob die Note weniger als 38 ist, wird die Note nicht abgerundet.
    z.B. 84 => 85
         29 => 29
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode den Durchschnittswert liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode eine Array mit die abgerundete Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode die maximale abgerundete Note liefern.
     */
public class Catalog {

    public int[] nicht_ausreichend(int[] note){
        int [] arr = new int[note.length];
        int j=0;
        for(int i=0;i<note.length; i++) {
            if (note[i] <= 40) {
                arr[j] = note[i];
                j++;
            }
        }
        int[] nichtausreichend=new int[j];
        for(int k=0;k< arr.length;k++)
             if(arr[k]!=0)
                nichtausreichend[k]=arr[k];
        return nichtausreichend;

    }
    public int durchschnitt(int [] note){
        int summe=0,m;
        for(int i=0;i<note.length;i++)
        {
            summe=summe+note[i];
        }
        m= summe/note.length;
        return m;
    }
    public int abgerundet(int n){
        int aux;
        if(n<38)
        {
           return n;
        }
        if(n%5==0)
            return n;
        aux=n;
        while(aux%5!=0)
            aux++;//mergem pana la urmatorul multiplu de 5
        if(aux-n<3) {
            return aux;
        }
        else
            return n;
    }



    public int[] abgerundeteArray(int[] note){
        int []v=new int[10];
        int j=0,aux = 0;
        for(int i=0;i<note.length;i++)
        {
            v[j]=abgerundet(note[i]);
            j++;
        }
        int[]abgerundet=new int[j];
        for(int k=0;k<v.length;k++)
            if(v[k]!=0)
                abgerundet[k]=v[k];
        return abgerundet;

    }
    public int max(int[] note)
    {
        int maxi=-1;
        for(int i=0;i<note.length;i++)
            if(note[i]>maxi)
                maxi=note[i];

        return maxi;
    }
    public int maxabgerundet(int[]note){
        return max(abgerundeteArray(note));
    }
}
