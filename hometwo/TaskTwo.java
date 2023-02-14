package hometwo;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class TaskTwo {
    public static void main(String[] args) throws SecurityException, IOException{
        Logger logger = Logger.getLogger("mylogger");
        FileHandler fileHandler = new FileHandler("log.txt");
        logger.addHandler(fileHandler);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++){
            myArray[i] = scanner.nextInt();          
        }
        for (int i = 0; i < n; i++){
            int res = 0;
            for (int m = 0; m < n - i - 1; m++){
                if (myArray[m] > myArray[m + 1]){
                    res = myArray[m];
                    myArray[m] = myArray[m + 1];
                    myArray[m + 1] = res;
                    logger.info(Arrays.toString(myArray));
                }
            }
        }
        scanner.close();
        System.out.println(Arrays.toString(myArray));
    }
}
