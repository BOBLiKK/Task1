import java.util.Random;

public class BubbleSort {

    public static void sort(int[] arr) {
        int temp;
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void sort(double[] arr){
        double temp;
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void sort(char[] arr){
        char temp;
        boolean isSorted = false;

        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void initialize(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt(100);
        }
    }
    public static void initialize(double[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextDouble() * 100;
        }
    }
    public static void initializeNegative(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = -rand.nextInt(100);
        }
    }
    public static void initializeNegative(double[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = -(rand.nextDouble() * 100);
        }
    }
    public static void initialize(char[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) {
            int temp;
            int min = 97;
            int max = 122;
            int diff = max - min;
            temp = rand.nextInt(diff + 1);
            temp += min;
            arr[i] = (char) temp;
        }
    }
    public static void initializeCapitalLetters(char[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) {
            int temp;
            int min = 65;
            int max = 90;
            int diff = max - min;
            temp = rand.nextInt(diff + 1);
            temp += min;
            arr[i] = (char) temp;
        }
    }
    public static void display(int[] arr){
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void display(double[] arr){
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void display(char[] arr){
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] arrInt = new int[10];
        double[] arrDouble = new double[10];
        char[] arrChar = new char[10];
        initialize(arrInt);
        display(arrInt);
        sort(arrInt);
        display(arrInt);
        System.out.println();

        initializeNegative(arrInt);
        display(arrInt);
        sort(arrInt);
        display(arrInt);
        System.out.println();

        initialize(arrDouble);
        display(arrDouble);
        sort(arrDouble);
        display(arrDouble);
        System.out.println();

        initializeNegative(arrDouble);
        display(arrDouble);
        sort(arrDouble);
        display(arrDouble);
        System.out.println();

        initialize(arrChar);
        display(arrChar);
        sort(arrChar);
        display(arrChar);
        System.out.println();

        initializeCapitalLetters(arrChar);
        display(arrChar);
        sort(arrChar);
        display(arrChar);
        System.out.println();
    }
}
