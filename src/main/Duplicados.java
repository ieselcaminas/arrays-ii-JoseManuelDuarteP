public class Duplicados {

    public  static String duplicados(int[] num) {
        String res ="";

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {

                if (num[i] == num[j]) {
                    res = num[i] + " ";
                }

            }
        }
        return res;

    }

    public static void main(String[] args) {

    }
}