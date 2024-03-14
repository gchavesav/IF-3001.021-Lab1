package domain;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void example1Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example1
        long startTime = System.currentTimeMillis();
        int result = ex.example1(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example1\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds");
    }

    @Test
    void example2Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example2
        long startTime = System.currentTimeMillis();
        int result = ex.example2(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example2\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds");
    }

    @Test
    void example3Test() {
        Example ex = new Example();
        int n = 100000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example3
        long startTime = System.currentTimeMillis();
        int result = ex.example3(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example3\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds");
    }

    @Test
    void example4Test() {
        Example ex = new Example();
        int n = 10000000;
        int a[] = new int[n];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example4
        long startTime = System.currentTimeMillis();
        int result = ex.example4(a);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example4\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds");
    }

    @Test
    void example5Test() {
        Example ex = new Example();
        int n = 3000;
        int m = 5000;
        int a[] = new int[n];
        int b[] = new int[m];
        util.Utility.fill(a, 99); //llena el arreglo
        util.Utility.show(a, 100);
        //analisis de example5
        long startTime = System.currentTimeMillis();
        int result = ex.example5(a, b);
        long endTime = System.currentTimeMillis();
        long tn = endTime - startTime;
        System.out.println("\n\nTest Example5\n"
                + "n: "+util.Utility.format(n)+"\n"
                + "m: "+util.Utility.format(m)+"\n"
                + "Result: "+util.Utility.format(result)+"\n"
                + "Tn: "+util.Utility.format(tn)+ " milliseconds");
    }

}