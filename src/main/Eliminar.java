import java.util.Arrays;

public class Eliminar {

    public static int[] eliminar(int[] lista, int numUsu) {
        int aux = lista[numUsu];

        for (int i = numUsu; i < lista.length - 1; i++) {
                lista[i] = lista[i + 1];
        }
        lista[lista.length - 1] = aux;

        return lista;
    }

    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(eliminar(lista, 3)));

    }
}