public class Iguales {

    public  static boolean sonIguales(int[] vector1, int[] vector2) {
        boolean sonIguales = true;

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                sonIguales = false;
                break;
            }
        }

        return sonIguales;
    }

    public static void main(String[] args) {
        int [] vector1 = {1, 2, 3, 4, 5};
        int [] vector2 = {1, 2, 3, 4, 5};

        System.out.println(sonIguales(vector1, vector2));

    }
}
