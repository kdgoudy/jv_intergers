import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }
}
