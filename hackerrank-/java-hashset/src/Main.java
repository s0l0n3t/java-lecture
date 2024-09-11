import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        // https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true
        //hashset problem
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> newHashSet = new HashSet<>();
        for(int a = 0;a<t;a++){
            newHashSet.add(pair_left[a] + " "+ pair_right[a]);
            System.out.println(newHashSet.size());
        }
    }
}