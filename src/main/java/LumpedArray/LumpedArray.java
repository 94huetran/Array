package LumpedArray;

import java.util.Scanner;

public class LumpedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap do dai cua tung mang: ");
        int size1 = scn.nextInt();
        int size2 = scn.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

//        int[] arr1 = {2, 4, 5, 6, 7, 8};
//        int[] arr2 = {56, 89, 30, 21, 45};

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Nhap gia tri tung phan tu cua mang 1: ");
            arr1[i] = scn.nextInt();
        }
        System.out.println("phan tu cua mang 1 la: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+"\t");
        }
        System.out.println("Nhap gia tri cho tung phan tu cua mang 2: ");
        for (int j = 0; j < arr2.length; j++) {
            arr2[j] = scn.nextInt();
        }
        System.out.println("phan tu cua mang 2 la: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }

//        int size2 = ((arr1.length) + (arr2.length));
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[i + arr1.length] = arr2[i];
        }
        System.out.println("Mang sau khi gop: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
