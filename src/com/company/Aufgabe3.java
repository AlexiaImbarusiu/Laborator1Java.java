package com.company;
import java.math.BigInteger;
public class Aufgabe3 {
    /*
        Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
    Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
    z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
    Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
    z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
    Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]
     */
   /* public static BigInteger[] summe(BigInteger[] a, BigInteger[] b)
    {
        //output kann entweder die gleiche lange haben oder mit 1 langer sein
      BigInteger[]output=new BigInteger[a.length];
      int countPosInArr= a.length-1;
      BigInteger rez;
      for(int i=a.length-1;i>=0;i--){
          rez=a[i].add(b[i]);
          if(BigInteger.valueOf(10).compareTo(rez)==1){ //daca e mai mic decat 10
              output[countPosInArr].add(rez);
              countPosInArr--;
          }else{
              output[countPosInArr]=output[countPosInArr].add(rez.mod(BigInteger.valueOf(10)));

              if(countPosInArr-1<0){
                  //man soll das array vergrossern
                  BigInteger[] biggerarray=new BigInteger[output.length+1];
                  //jetzt abschreiben
                  for(int j=0;j<output.length;j++){
                      biggerarray[j+1]=output[j];
                  }
                  return biggerarray;
              }
              output[countPosInArr-1].add(BigInteger.valueOf(1));
              countPosInArr--;
          }

      }

        return output;
    }*/
    public BigInteger summe(int [] x, int [] y) {
        int i = 0;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (i < x.length) { //wir konvertieren sie zu strings
            s1.append(x[i]);// in s1 fugen wir x ein
            s2.append(y[i]);//in s2 fugen wir y ein
            i++;
        }
        //konvertieren zu Bigintegers
        BigInteger a = new BigInteger(s1.toString());
        BigInteger b = new BigInteger(s2.toString());
        return a.add(b);
    }


    public BigInteger differenz(int [] x, int [] y) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int i = 0;
        while (i < x.length) {
            s1.append(x[i]);
            s2.append(y[i]);
            i++;
        }
        BigInteger a = new BigInteger(s1.toString());
        BigInteger b = new BigInteger(s2.toString());
        return a.subtract(b).abs();
    }


    public BigInteger multiplikation(int [] x, int n) {
        StringBuilder s= new StringBuilder();
        BigInteger rez;
        int i = 0;
        while (i < x.length) {
            s.append(x[i]);
            i++;}
        BigInteger a = new BigInteger(s.toString());
        BigInteger b= BigInteger.valueOf(n);
        rez=a.multiply(b);
        return rez;

    }

    public BigInteger division(int [] x, int n) {
        StringBuilder s= new StringBuilder();
        BigInteger rez;
        int i = 0;
        while (i < x.length) {
            s.append(x[i]);
            i++;}
        BigInteger a = new BigInteger(s.toString());
        BigInteger b= BigInteger.valueOf(n);
        rez=a.divide(b);
        return rez;

    }


    public static void main(String[] args) {

    }
}
