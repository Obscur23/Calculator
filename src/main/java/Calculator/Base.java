package Calculator;

import java.util.Scanner;

/**
 * @author Anton U.
 * Калькулятор - 4 действия без проверок ввода
 */
public class Base {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Calc - 1, Array - 2");
        int choise = in.nextInt();
        //Инициализируем сканер
        switch (choise) {
            case 1 :
                Calc calc = new Calc();
                calc.Calulator();
                break;
            case 2 :
                ArrayCount arrayclass = new ArrayCount();
                arrayclass.workarray();
                break;
        }
    }

}


//git test2