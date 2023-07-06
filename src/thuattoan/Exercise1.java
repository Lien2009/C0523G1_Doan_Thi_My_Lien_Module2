package thuattoan;

public class Exercise1 {
    public static void main(String[] args) {

        int chieuCao = 10;
        int h = chieuCao / 2;
        int count = 1;
        for (int i = 0; i < chieuCao - 1; i++) {
            for (int j = 0; j < chieuCao; j++) {
                if (h - j == i + 1 || j - h == i || i - h == j - 1 || j - h == chieuCao - i - 2) {
                    if (i > 4) {
                        System.out.print(i - count);
                    } else {
                        System.out.print(i + 1);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            if (i > 4) {
                count+=2;
            }
            System.out.println();
        }
    }
}
