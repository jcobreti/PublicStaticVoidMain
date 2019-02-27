package android.edu.publicstaticvoidmain;

public class PublicStaticVoidMain {
   public static void main(String[] entrada) {
        boolean espar = dimeSiEsPar(5);
        if (espar)//espar es true
            System.out.print("PAR");
         else
            System.out.print("IMPAR");

    }
    public static boolean dimeSiEsPar (int x)
        { return (x%2==0)?true:false;
        }
}

