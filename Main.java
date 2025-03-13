import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Выберите пункт: ");
            System.out.print("1. Сложение");
            System.out.print("2. Вычитание");
            System.out.print("3. Умножение");
            System.out.print("4. Деление");
            System.out.print("5. Выход");
   int person = scanner.nextInt();
   int result;
   if (person == 5){
       break;
   } else if (person == 1){
       System.out.println("Введите первое число : ");
       int a = scanner.nextInt();
       System.out.println("Введите второе число : ");
       int b = scanner.nextInt();
       System.out.println("a : " + a);
       System.out.println("b : " + b);
       result = a + b;
       System.out.println("Ответ : " + result);

   }  else if (person == 2){
            System.out.println("Введите первое число : ");
            int a = scanner.nextInt();
            System.out.println("Введите второе число : ");
            int b = scanner.nextInt();
            System.out.println("a : " + a);
            System.out.println("b : " + b);
            result = a - b;
            System.out.println("Ответ : " + result);

   } else if (person == 3){
       System.out.println("Введите первое число : ");
       int a = scanner.nextInt();
       System.out.println("Введите второе число : ");
       int b = scanner.nextInt();
       System.out.println("a : " + a);
       System.out.println("b : " + b);
       result = a * b;
       System.out.println("Ответ : " + result);

   } else if (person == 4){
       System.out.println("Введите первое число : ");
       int a = scanner.nextInt();
       System.out.println("Введите второе число : ");
       int b = scanner.nextInt();
       if (b == 0) {
           System.out.println("Деление невозможно");
       }
       System.out.println("a : " + a);
       System.out.println("b : " + b);
       result = a / b;
       System.out.println("Ответ : " + result);
   } else {
       System.out.println("Error");
   }
        }
        }
}