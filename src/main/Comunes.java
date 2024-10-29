public class Comunes {

    public  static String comunes(int[] num1, int[] num2) {
        String reultado = "";
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {


                if (num1[i] == num2[j]) {
                    reultado += num1[i] + " ";
                    break;
                }
            }

        }
        return reultado;
    }

    public static void main(String[] args) {

    }
}
