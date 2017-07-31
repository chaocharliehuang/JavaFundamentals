import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String[] args) {
        PuzzleJava test = new PuzzleJava();
        test.iterateThruArray(test.task1());
        test.iterateThruArray(test.task2());
        test.task3();
        test.iterateThruArray(test.task4());
        test.iterateThruArray(test.task5());
        System.out.println(test.task6());
        test.iterateThruArray(test.task7());
    }

    public void iterateThruArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }
    public void iterateThruArray(String[] arr) {
        for (String el : arr) {
            System.out.println(el);
        }
    }
    public void iterateThruArray(Integer[] arr) {
        for (Integer el : arr) {
            System.out.println(el);
        }
    }

    public Integer[] task1() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> greaterThan10 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > 10) {
                greaterThan10.add(arr[i]);
            }
        }
        System.out.println(sum);
        Integer[] output = greaterThan10.toArray(new Integer[greaterThan10.size()]);
        return output;
    }

    public String[] task2() {
        String[] arr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> shuffled = new ArrayList<>();
        ArrayList<String> longerThan5 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                longerThan5.add(arr[i]);
            }
            shuffled.add(arr[i]);
        }
        Collections.shuffle(shuffled);
        for (String name : shuffled) {
            System.out.println(name);
        }
        String[] output = longerThan5.toArray(new String[longerThan5.size()]);
        return output;
    }

    public void task3() {
        char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> shuffled = new ArrayList<>();
        for (int i = 0; i < abc.length; i++) {
            shuffled.add(abc[i]);
        }
        Collections.shuffle(shuffled);
        System.out.println(shuffled.get(25));
        char first = shuffled.get(0);
        System.out.println(first);
        if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u') {
            System.out.println("First letter is a vowel!!");
        }
    }

    public int[] task4() {
        Random rand = new Random();
        int[] output = new int[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = rand.nextInt(46) + 55;
        }
        return output;
    }

    public int[] task5() {
        Random rand = new Random();
        int[] output = new int[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = rand.nextInt(46) + 55;
        }
        Arrays.sort(output);
        System.out.println("Minimum value: " + output[0]);
        System.out.println("Maximum value: " + output[9]);
        return output;
    }

    public String task6() {
        Random rand = new Random();
        String output = "";
        for (int i = 1; i <= 5; i++) {
            output += Character.toString((char)(rand.nextInt(26) + 'a'));
        }
        return output;
    }

    public String[] task7() {
        PuzzleJava test = new PuzzleJava();
        String[] output = new String[10];
        for (int i = 0; i < output.length; i++) {
            output[i] = test.task6();
        }
        return output;
    }
}