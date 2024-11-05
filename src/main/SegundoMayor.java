import java.util.Arrays;

public class SegundoMayor {

    public static int segundoMayor(int[] lista) {
        int segundomayor;

        Arrays.sort(lista);

        return segundomayor = lista[lista.length - 2];

    }

    public static void main(String[] args) {
        int[] lista = {43, 65, 23, 100, 99, 31, 45, 4};
        System.out.println(segundoMayor(lista));
    }
}