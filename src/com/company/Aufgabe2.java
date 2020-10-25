package com.company;
/*
----------------------------------------------------------------------------------------------------------------
Problem 2:
----------------------------------------------------------------------------------------------------------------
Es gibt eine Array mit n positive Zahlen.
Finden Sie die maximale Zahl.
Finden Sie die minimale Zahl.
Finden Sie die maximale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
Finden Sie die minimale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25
 */




public class Aufgabe2 {
    public int max(int[]v){
        int i;
        int maxi=-1;
        for(i=0;i<v.length;i++)
            if(v[i]>maxi)
                maxi=v[i];

        return maxi;

    }
    public int min(int[]v)
    {   int i;
        int mini=1000000000;
        for(i=0;i<v.length;i++)
            if(v[i]<mini)
                mini=v[i];

        return mini;
    }
    public int maxsum(int []v)
    {
        int sum=0,s;
        int mini=min(v);
        for(int i=0;i<v.length;i++)
            sum= sum+ v[i];
        s=sum-mini;//scadem din suma finala cel mai mic numar din array si astfel obtinem suma maxima de n-1 numere;
        return s;
    }
    public int minsum(int[]v)
    {
        int sum=0,s;
        int maxi= max(v);
        for(int i=0;i<v.length;i++)
            sum=sum+v[i];
        s=sum-maxi;
        return s;
    }


    public static void main(String[] args) {
        //do stuff

        System.out.println("Maximale Zahl= " );


        System.out.println("Minimale Zahl= " +"\n");

        System.out.println("Maximale Summe" + "...");
        System.out.println("Minimale Summe" + "...");
    }
}

