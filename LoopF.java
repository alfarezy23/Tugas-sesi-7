public class LoopF {
    public static void main(String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= i)
                    System.out.print("F ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }
}

