package ReverseArray;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Nhap vao so phan tu trong mang: ");
            size = scn.nextInt();
            if (size > 20) {
                System.out.println("Mang khong duoc qua 20 phan tu");
            }
        } while (size > 20);

        arr = new int[size];
        System.out.println("Nhap gia tri phan tu cua mang: ");
        for (int i = 0; i < size; i++) {
            arr[i]=scn.nextInt();
        }
        System.out.println("Mang cua ban la: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+"\t");
        }
        for (int i = 0; i < size/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        System.out.println("Mang cua ban sau khi da dao nguoc la: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]+"\t");
        }

    }
}
