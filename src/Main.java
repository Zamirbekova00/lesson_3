public class Main {
    public static void main(String[] args) {
        double[] array = {1.5, -2.4, 5.2, 2.5, 4.0, -6.1, 7.4, 1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        double summa = 0;
        double amount = 0;
        boolean m = false;

        for (double element : array) {
            if (element<0){
                m = true;
            } else if (element > 0 && m) {
                summa = element;
                amount ++;
                System.out.println(element);
            }
        }
        System.out.println("Среднее арифметическое число " + summa/amount);
    }
}
