package level1;

import java.util.Scanner;

public class N_3003 {
    public static void main(String[] args) {
//        체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
        Scanner scanner = new Scanner(System.in);
        int[] arr = {
                1 - scanner.nextInt(),
                1 - scanner.nextInt(),
                2 - scanner.nextInt(),
                2 - scanner.nextInt(),
                2 - scanner.nextInt(),
                8 - scanner.nextInt(),
        };

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
