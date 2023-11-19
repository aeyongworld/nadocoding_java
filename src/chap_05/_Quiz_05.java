package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizes = new int[10];
        for (int i = 0; i < 10; i++) {
            sizes[i] = 250 + (i * 5);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + sizes[i] + " (재고 있음)");
        }
    }
}
