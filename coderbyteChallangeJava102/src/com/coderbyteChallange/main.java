package com.coderbyteChallange;
import java.util.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    //First question
    public static boolean SumMultiplier(int[] arr) {
        int sum = 0;
        int bestIndex = 0;
        int secondBestIndex = 0;
        int second = 0;
        int best = 0;

        for(int i = 0;i<arr.length;i++){
            sum+= arr[i];
            if(arr[i] > best){
                best = arr[i];
                bestIndex = i;
            }
        }
        arr[bestIndex] = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > second){
                second = arr[i];
                secondBestIndex = i;
            }
        }
        if((best * second) > sum  ){
            return true;
        }

        return false;
    }
    //second question -> reverse array
    public static String createArray(String str){

        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String str = "heme ezost";
        char B[] = str.toCharArray();
        Arrays.sort(B);
        System.out.println(B);
    }
}
