package Calculator;

import java.util.Scanner;

/**
 * Created by Obscur on 05.12.17.
 */
public class ArrayCount {
        void workarray() {
        Scanner in = new Scanner(System.in);
        System.out.println("How Much Words?");
        int len = in.nextInt();
        //Запрос длины массива
        String[] words = new String[len];
        for (int i = 0; i<len; i++ ){
            System.out.println("Type Word "+i);
            words[i] = in.next();
            //Заполнение массива
        }
        String maxWord = words [0];
        for (int i = 1; i<len; i++ ){
            int len1 = maxWord.length();
            int len2 = words[i].length();
            if (len1 < len2){
            maxWord = words[i];
            }
        }
        System.out.println("Biggest Word is "+maxWord);
    }
}
