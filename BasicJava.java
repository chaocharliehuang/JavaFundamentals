public class BasicJava {
    public static void main(String[] args) {
        BasicJava test = new BasicJava();
        test.print1to255();
        test.print1to255Odd();
        test.printSum();
        test.iterateThruArray(new int[]{1, 3, 5, 7, 9, 13});
        test.findMax(new int[]{-3, 2, -1, -13, 22, 7});
        test.getAverage(new int[]{2, 10, 3});
        test.iterateThruArray(test.makeArrOddNumbers());
        test.greaterThanY(new int[]{1, 3, 5, 7}, 3);
        test.iterateThruArray(test.squareTheValues(new int[]{1, 5, 10, -2}));
        test.iterateThruArray(test.eliminateNegNums(new int[]{1, 5, 10, -2}));
        test.iterateThruArray(test.getMaxMinAverage(new int[]{1, 5, 10, -2}));
        test.iterateThruArray(test.shiftOneToFront(new int[]{1, 5, 10, 7, -2}));
    }

    public void print1to255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void print1to255Odd() {
        for (int i = 1; i <= 255; i += 2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateThruArray(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }
    public void iterateThruArray(double[] arr) {
        for (double el : arr) {
            System.out.println(el);
        }
    }

    public void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void getAverage(int[] arr) {
        if (arr.length == 0) {
            System.out.println(0);
        } else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum/arr.length);
        }
    }

    public int[] makeArrOddNumbers() {
        int[] y = new int[255/2 + 1];
        for (int i = 1; i <= 255; i++) {
            y[i/2] = i;
        }
        return y;
    }

    public void greaterThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }

    public int[] squareTheValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }
        return arr;
    }

    public int[] eliminateNegNums(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public double[] getMaxMinAverage(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        return new double[]{max, min, (double) sum/arr.length};
    }

    public int[] shiftOneToFront(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}