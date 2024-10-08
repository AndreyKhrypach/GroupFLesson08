package app;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Lesson08Program {

    public static void main(String[] args) {
        Random random = new SecureRandom();
        int number = random.nextInt(11, 100_000);
        System.out.println(number);
        // task
        // random від 11 - 100_000
        // 12356 - приклад
        // 1 + 2 + 3 + 4 + 5 + 6 = 21
        // приклад
        //7777 = 7 + 7 + 7 + 7 = 28
        // використати % від ділення

//        int[] source = new int[10];
//        for (int i = 0; i < source.length; i++) {
//            source[i] = random.nextInt(10);
//        }
//        //System.out.println(Arrays.toString(source));
//
//        int[] workArray = new int[source.length];
////        for (int i = 0; i < source.length; i++) {
////            workArray[i] = source[i];
////        }
//
//        System.arraycopy(source, 0, workArray, 0, source.length);
//        //workArray = Arrays.copyOf(source, source.length);
//        for (int i = 0; i < source.length - 1; i++) {
//            for (int j = 0; j < source.length - i - 1; j++) {
//                if (source[j] < source[j + 1]){
//                    int temp = source[j];
//                    source[j] = source[j + 1];
//                    source[j+1] = temp;
//                }
//            }
//        }

//        Arrays.sort(workArray);
//        System.out.println(Arrays.toString(source));
//        System.out.println(Arrays.toString(workArray));
//        int[] source = new int[100];
//        for (int index = 0; index < source.length; index++) {
//            source[index] = random.nextInt(100);
//        }
//        System.out.println(Arrays.toString(source));
//        int keyNumber = 2;
//        Arrays.sort(source);
//        System.out.println(Arrays.toString(source));
//        int foundIndex = Arrays.binarySearch(source, keyNumber);
//        System.out.println(foundIndex);

//        for (int index = 0; index < source.length; index++) {
//            if (source[index] == keyNumber){
//                System.out.println("Number found, index = " + index);
//            }
//        }
//        String str = "Hello world";
//        char[] chars = str.toCharArray();
//        for (int index = 0; index < chars.length ; index++) {
//            if(chars[index] == 'l'){
//                System.out.println( chars[index] + " index = " + index);
//            }
//        }
//        String str2 = new String(chars);
//        System.out.println(str2);
//        System.out.println(str.equals(str2));

//        String str1 = "Hello world";
//        String str2 = "Hello world";
//        String str3 = new String("Hello world");
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3));

//        int[] source = new int[100_000];
//        for (int index = 0; index < source.length; index++) {
//            source[index] = random.nextInt(100_000) ;
//        }
//        //System.out.println(Arrays.toString(source));
//
//        long beforeTime = System.currentTimeMillis();
//
//        for (int i = 0; i < source.length - 1; i++) {
//            for (int j = 0; j < source.length - i - 1; j++) {
//                if (source[j] < source[j + 1]){
//                    int temp = source[j];
//                    source[j] = source[j + 1];
//                    source[j+1] = temp;
//                }
//            }
//        }
//        //Arrays.sort(source);
//        long afterTime = System.currentTimeMillis();
//        System.out.println(afterTime - beforeTime);
        //System.out.println(Arrays.toString(source));
    }

}
