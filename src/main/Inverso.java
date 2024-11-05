import java.util.Arrays;

public class Inverso {

    public static int[] inverso(int[] lista) {
        int[] listacopia = new int[lista.length];

        for (int i = 0; i <= lista.length - 1; i++) {
            listacopia[i] = lista[lista.length - 1 - i];
        }
        return listacopia;

    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(inverso(lista)));
    }
}