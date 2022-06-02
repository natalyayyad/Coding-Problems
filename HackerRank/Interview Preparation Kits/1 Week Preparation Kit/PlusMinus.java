import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        DecimalFormat numberFormat = new DecimalFormat("#.000000");
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        positive = positive > 0 ? positive / arr.size() : 0;
        negative = negative > 0 ? negative / arr.size() : 0;
        zero = zero > 0 ? zero / arr.size() : 0;

        System.out.println(numberFormat.format(positive));
        System.out.println(numberFormat.format(negative));
        System.out.println(numberFormat.format(zero));
    }

}
