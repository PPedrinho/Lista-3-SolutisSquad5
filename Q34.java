package Lista3;
import java.util.Random;
public class Q34 {
    public static void main(String[] args) {
        for(int i = 1; i<=50; i++){
            Random random = new Random();
            int num = random.nextInt(100) + 1;
            System.out.println(num);
        }
    }
}
