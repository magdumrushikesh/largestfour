
public class LargeFour {
    public static void main(String[] args) {
        int last = 0;
        for (int i = 10000; i > 0; i--) {
            if (i % 10 == 0 && i % 13 == 0) {
                last = i;
                break;
            }
        }
        System.out.println("The largest four digits num divisible by 10 and 13 : " + last);
    }
}

