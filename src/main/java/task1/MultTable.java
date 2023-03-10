package task1;

public class MultTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.format("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
