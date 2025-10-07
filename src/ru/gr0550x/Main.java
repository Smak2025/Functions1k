package ru.gr0550x;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void fillArray(int[] array){
        Random rnd = new Random();
        for (int i = 0; i<array.length; i++){
            array[i] = rnd.nextInt(-100, 101);
        }
    }

    public static void showArray(int[] array){
        for (var elem: array){
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void sortBubble(int[] array){
        for (int k = 1; k < array.length; k++){
            for (int i = 0; i < array.length - k; i++){
                if (array[i] > array[i + 1]){
                    var t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
            }
        }
    }

    // Функция не сработает!!!
    public static void swap(int a, int b){
        var t = a;
        a = b;
        b = t;
    }

    public static void sortMin(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    var t = array[i];
                    array[i] = array[j];
                    array[j] = t;
//                    swap(array[i], array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Кол-во эл-ов массива:");
        n = new Scanner(System.in).nextInt();
        var mas = new int[n];
        fillArray(mas);
        showArray(mas);
        sortMin(mas);
        showArray(mas);
    }
}
