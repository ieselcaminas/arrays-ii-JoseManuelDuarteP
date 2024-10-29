public class SumaIgual {

    public  static String sumaIgual(int[] num, int numUsu) {
        String res = "";

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] + num[j] == numUsu) {
                    res += "[" + num[i] + " + " + num[j] + "] ";
                }

            }
        }
        return res;

    }

    public static void main(String[] args) {

    }
}