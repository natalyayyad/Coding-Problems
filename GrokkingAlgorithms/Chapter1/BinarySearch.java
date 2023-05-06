import java.net.HttpURLConnection;
import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
        int[] numArray = IntStream.range(1, 100).toArray();
        System.out.println(binarySearch(numArray, 67));
    }

    static int binarySearch(int[] list, int goal) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == goal)
                return mid;
            else if (guess < goal)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
