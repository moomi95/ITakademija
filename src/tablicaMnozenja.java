import java.util.Arrays;


public class tablicaMnozenja {
    public static void main(String[] args) {
        int[] arrayMnozilac = {1, 2, 3};
        int[] arrayMnozenik = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rezultat1 = new int[10];
        int[] rezultat2 = new int[10];
        int[] rezultat3 = new int[10];


        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("#     1       2        3");
        for (int i = 0; i < 25; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 0; i < arrayMnozilac[0]; i++) {

            for (int j = 0; j < arrayMnozenik.length; j++) {
                rezultat1[i + j] = arrayMnozilac[i] * arrayMnozenik[j];

                int output = 0;
                output = output + rezultat1[i + j];
            }
            //System.out.println(Arrays.toString(rezultat1));
 /*              String rezultat11 = (Arrays.toString(rezultat1));
                 System.out.println(rezultat11);
                  int rezultat111 = Integer.parseInt(rezultat11);*/
        }
        for (int i = 1; i < arrayMnozilac[1]; i++) {

            for (int j = 0; j < arrayMnozenik.length; j++) {
                rezultat2[i + j - 1 ] = arrayMnozilac[i] * arrayMnozenik[j];

                int output = 0;
                output = output + rezultat2[i + j - 1];

            }
            String rezultat22 = (Arrays.toString(rezultat2));
            //System.out.println(rezultat22);
        }
        for (int i = 2; i < arrayMnozilac[2]; i++) {

            for (int j = 0; j < arrayMnozenik.length; j++) {
                rezultat3[i + j - 2] = arrayMnozilac[i] * arrayMnozenik[j];

                int output = 0;
                output = output + rezultat3[i + j-2];
            }
            String rezultat33 = (Arrays.toString(rezultat3));
            //System.out.println(rezultat33);
        }
        for (int i = 0; i<10;i++ ){
            System.out.println(i+1 + "      " + rezultat1[i] + "       " + rezultat2[i] + "        " + rezultat3[i]);
        }
    }
}

