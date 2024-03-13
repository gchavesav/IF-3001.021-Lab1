package domain;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void example1() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        fill(a); //llena el arreglo
        show(a);
        //analisis de example1
        long startTime = System.currentTimeMillis();
        int result = ex.example1(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example1\n"
                + "n: "+n+"\n"
                + "Result: "+result+"\n"
                + "Tn: "+tn+ " milliseconds");
    }

    private void show(int[] a) {
        for (int i = 0; i < 100; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private void fill(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(99);
        }
    }
}