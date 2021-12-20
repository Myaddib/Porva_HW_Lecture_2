package basic.java_cursor.education;

import java.util.Arrays;
import java.util.Random;

public class Main {
// * 1. Заповнити масив тільки парними числами
// * 2. Заповнити масив рандомними числами
// * 3. Вивести середнє значення масиву
// * 4. Вивести суму всіх значень кратних 3
// * 5. Вивести значення всіх парних індексів масиву
// * 6. Просортувати масив в порядку зростання
// * 7. Вивести найменше значення в масиві
// * 8. Вивести найбільше значення масиву
// * 9. Вивести суму значень всіх парних індексів
// * 10.  Вивести перших 20 символів з таблиці ASCI

    public static void main(String[] args) {
        // write your code here

// 1. Заповнити масив тільки парними числами
        int paired_array_lengeth = 50;
        int multiplicity = 2;
        int summa_multiplicity_3 = 0;
        int average_value = 0;
        int summa_par_ind = 0;
        int maxx_array;
        int minn_array;

        Random random = new Random();
        int bingo = 0;


        int[] paired_array = new int[paired_array_lengeth];
        for (int i = 0; i < paired_array.length; i++) {

            do {
                bingo = random.nextInt(1000);                                   // 2. Заповнити масив рандомними числами
            } while (bingo % multiplicity != 0);                                     // 1. Заповнити масив тільки парними числами
            paired_array[i] = bingo;                                                  //  1. Заповнити масив тільки парними числами 2. Заповнити масив рандомними числами
            average_value = average_value + paired_array[i];                          // 3. Вивести середнє значення масиву
            if (paired_array[i] % 3 == 0) {
                summa_multiplicity_3 = summa_multiplicity_3 + paired_array[i];         // 4. Вивести суму всіх значень кратних 3
            }
            if (i % 2 == 0 && i != 0) {
                System.out.println("Task 5: Indice array " + i + " = " + paired_array[i]); // 5. Вивести значення всіх парних індексів масиву
                summa_par_ind = summa_par_ind + paired_array[i];                       // 9.  Вивести суму значень всіх парних індексів
            }

        }

        System.out.println("Task 3: Average value array = " + average_value / paired_array_lengeth); // 3. Вивести середнє значення масиву
        System.out.println("Task 4: Sum mulltiplicity 3 = " + summa_multiplicity_3);                 // 4. Вивести суму всіх значень кратних 3
        System.out.println("Task 9: Sum of paired indices = " + summa_par_ind);                        // 9.  Вивести суму значень всіх парних індексів

        maxx_array = paired_array[1];
        minn_array = paired_array[1];
        Arrays.sort(paired_array); // 6.   Просортувати масив в порядку зростання
        for (int i = 0; i < paired_array.length; i++) {
            if (maxx_array < paired_array[i]) {
                maxx_array = paired_array[i];      // 8.   Вивести найбільше значення масиву
            } else if (minn_array > paired_array[i]) {      // 7.   Вивести найменше значення в масиві
                minn_array = paired_array[i];
            }
        }
        System.out.println("Task 7: The smallest value of the array = " + minn_array);// 7.   Вивести найменше значення в масиві
        System.out.println("Task 8: The largest value of the array = " + maxx_array); // 8.   Вивести найбільше значення масиву

        for (int i = 0; i < 20; i++) {
            System.out.print((char) i+"  "); // 10.  Вивести перших 20 символів з таблиці ASCI
        }
    }
}


