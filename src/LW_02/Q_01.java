package LW_02;

public class Q_01 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i * 10 + j + " ");
            }
            System.out.println();
        }

        for (int i = 50; i < 100; i++){
            System.out.print(i + " ");
            if (i%10 == 9) {
                System.out.println();
            }
        }
    }
}
