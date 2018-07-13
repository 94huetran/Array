package SearchSmallestValue;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap phan tu cho mang:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Phan tu nho nhat cua mang la: "+minValue);

    }

}
