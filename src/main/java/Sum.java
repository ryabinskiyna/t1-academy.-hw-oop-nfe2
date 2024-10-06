public class Sum {

    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (isNumeric(arg)) {
                double number = Double.parseDouble(arg);
                sum += number;
            } else {
                System.out.println("Некорректное значение: " + arg + " (считается как 0)");
            }
        }

        System.out.println("Сумма: " + sum);
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
