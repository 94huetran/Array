package AddElementInArray;

import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int size;
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        size = scn.nextInt();
        int[] arr = new int[size];
        System.out.print("Nhap phan tu cho mang:");
        for (int i = 0; i < arr.length;i++) {
            arr[i]= scn.nextInt();
        }
        System.out.println("Nhap phan tu can chen: ");
        int x = scn.nextInt();
        System.out.println("Nhap vi tri index can chen: ");
        int index = scn.nextInt();

        if (index <= 1 && index > arr.length - 1) {
            System.out.println("Khong chen duoc vao mang.");
        }

        int[] arr2 = new int[size + 1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr[i];
        } arr2[index] = x;
        for (int i = index + 1; i < arr2.length; i++) {
            arr2[i] = arr[i-1];
        }

        System.out.println("Mang moi la: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"\t");
        }
    }

}
