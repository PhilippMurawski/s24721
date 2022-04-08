package Zadanie1.src.main.java;

public class MyWater
{
     public static void main(String[] args)
     {
         Large l = new Large();
         Medium m = new Medium();
         Small s = new Small();

         Large lB = new Large();
         Medium mB = new Medium();
         Small sB = new Small();

         double sum2;

         sum2 = (l.addLarge * lB.colb) + (m.addMedium * mB.comb) + (s.addSmall * sB.cosb);
         System.out.println("Zgromadzono " + sum2 + " Litrow wody");

         System.out.println("Duze butelki: " + lB.colb);
         System.out.println("Srednie butelki: " + mB.comb);
         System.out.println("Male butelki: " + sB.cosb);
     }
}
