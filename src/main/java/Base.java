import java.util.Scanner;

/**
 * @author Anton U.
 * Калькулятор - 4 действия без проверок ввода
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Инициализируем сканер
        boolean cycle = true;
        //Инициализируем переменную цикла повторений
        do {
            //Начало цикла калькулятора
            System.out.println("First Digit");
            float first = in.nextFloat();
            //Ввод первого после подсказки
            System.out.println("Second Digit");
            float second = in.nextFloat();
            //Ввод второго после подсказки
            System.out.println("Operation: + - * /");
            String oper = in.next();
            //Ввод действия
            //in.nextLine() работает некорректно, 10х Stackoverflow
            if (oper.equals("+")) {
                float result = first + second;
                System.out.println("Addition ");
                System.out.printf("%+.4f", result);
                //Считаем сумму
            }
            if (oper.equals("-")) {
                float result = first - second;
                System.out.println("Difference ");
                System.out.printf("%+.4f", result);
                //Считаем разность
            }
            if (oper.equals("*")) {
                float result = first * second;
                System.out.print("Multiplication ");
                System.out.printf("%+.4f", result);
                //Считаем умножение
            }
            if (oper.equals("/")) {
                float result = first / second;
                System.out.print("Division ");
                System.out.printf("%.4f", result);
                //Считаем деление
            }
            System.out.println();
            System.out.println("For Continue press y, for Exit any key");
            String answer = in.next();
            //Запрос продолжения
            if (!answer.equals("y")){
                cycle = false;
            }
        }while (cycle);
        System.out.println("Bye!");
    }

}