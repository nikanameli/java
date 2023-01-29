package homeone;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < n +1; i++){
            result += i;
        }
        System.out.println(result);
        scanner.close();
    }
}
