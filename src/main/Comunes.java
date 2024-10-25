public class Comunes {
    public static void main(String[] args) {
        int[] num1 = {5,5,1,8,3};
        int[] num2 = {5,8,3};
        String reultado = "";
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {


                if (num1[i] == num2[j]) {
                    reultado += num1[i];
                    break;
                }
            }

        }
        System.out.println(reultado);
    }
}
