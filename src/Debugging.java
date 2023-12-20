public class Debugging {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int sum = addNumbers(x, y);
        System.out.println("Сумма чисел: " + sum);
    }

    public static int addNumbers(int a, int b) {
        int result = a + b;
        return result;
    }
}

