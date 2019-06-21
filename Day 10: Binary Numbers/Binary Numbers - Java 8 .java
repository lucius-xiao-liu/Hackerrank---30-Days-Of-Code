import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int count = 0;
        int consecutive = 0;
        while(n>0) {
            int binary = n%2;
            n = n/2;
            if (binary == 1){
                count++;
                while (count > consecutive) {
                    consecutive = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(consecutive);

        scanner.close();
    }
}
