package level1;

import java.util.Scanner;

public class N_1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        소수점을 계산할때는 형변환후 계산 해야함
        System.out.println((float) a / b);
    }
}
