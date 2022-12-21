import java.util.Random;

public class InsertionSort {

    public static void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int currElement = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElement){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElement;
                prevKey--;
            }
        }
    }
    public static void sort(double[] arr){
        for(int i = 1; i < arr.length; i++){
            double currElement = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElement){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElement;
                prevKey--;
            }
        }
    }
    public static void sort(char[] arr){
        for(int i = 1; i < arr.length; i++){
            char currElement = arr[i];
            int prevKey = i - 1;
            while(prevKey >= 0 && arr[prevKey] > currElement){
                arr[prevKey+1] = arr[prevKey];
                arr[prevKey] = currElement;
                prevKey--;
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
