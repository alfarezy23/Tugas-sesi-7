public class LoopAB {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("A ");
                else
                    System.out.print("B ");
            }
            System.out.println();
        }
    }
}

