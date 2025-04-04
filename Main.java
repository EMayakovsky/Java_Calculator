import java.util.Scanner;

class Main {

    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length !=3) {
            throw new IllegalArgumentException("Неверный формат ввода");
        }
        try {
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            String operator = parts[1];

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Числа должны быть от 1 до 10");
            }
            int result = 0;
            switch (operator) {
            case "+":
            result = a + b;
            break;
            case "-":
            result = a - b;
            break;
            case "*":
            result = a * b;
            break;
            case "/":
                if (b == 0){
                    throw new IllegalArgumentException("На ноль делить нельзя");
                }
            result = a / b;
            break;
            default:
            throw new IllegalArgumentException("Неподдерживаемая операция");
            }
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка при вводе чисел");
        }
    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Введите арифметические выражение (например, 3+5):");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println("Результат:" +result);
    } catch (Exception e) {
    System.out.println("Ошибка" + e.getMessage());
    }
}
}
