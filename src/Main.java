import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//задача 1

        int[] arr = new int[]{1, 2, 3};
        double[] arr2 = new double[]{1.57, 7.654, 9.986};
        int[] arr3 = new int[4];

//задача 2
        System.out.println("задача 2");

        for (int j = 0; j <= arr.length - 1; j++) {
            if (j != arr.length - 1) {
                System.out.print(arr[j] + ", ");
            } else {
                System.out.println(arr[j]);
            }
        }
        for (int j = 0; j <= arr2.length - 1; j++) {
            if (j != arr2.length - 1) {
                System.out.print(arr2[j] + ", ");
            } else {
                System.out.println(arr2[j]);
            }
        }
        for (int j = 0; j <= arr3.length - 1; j++) {
            if (j != arr3.length - 1) {
                System.out.print(arr3[j] + ", ");
            } else {
                System.out.println(arr3[j]);
            }
        }

//задача 3
        System.out.println("задача 3");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.println(arr2[i]);
            }
        }
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr3[i] + ", ");
            } else {
                System.out.println(arr3[i]);
            }
        }

//задача 4
        System.out.println("задача 4");

        for (int k = 0; k <= arr.length - 1; k++) {
            if (arr[k] % 2 != 0) {
                arr[k] = arr[k] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}