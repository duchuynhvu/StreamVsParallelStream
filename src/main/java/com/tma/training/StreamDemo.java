package com.tma.training;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        long startNanoTime;
        long endNanoTime;
        long startMillisTime;
        long endMillisTime;
        
        List<Employee> eList = getEmpList();

        /*****
         * Here We Are Creating A 'Sequential Stream' & Displaying The Result
         *****/
        
        // ## FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Filter Count?= "
                + eList.stream().filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");

        // ## UNORDERED FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Unordered Filter Count?= "
                + eList.stream()
                    .unordered().filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Unordered Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
                
        // ## SEQUENTIAL FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Sequential Filter Count?= "
                + eList.stream()
                    .sequential().filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Stream: Sequential Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
        
        
        /*****
         * Here We Are Creating A 'Parallel Stream' & Displaying The Result
         *****/
        
        // ## FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Filter Count?= " 
                + eList.parallelStream()
                    .filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");

     // ## UNORDERED FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Unordered Filter Count?= "
                + eList.parallelStream()
                    .unordered().filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Unordered Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
                
        // ## SEQUENTIAL FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Sequential Filter Count?= "
                + eList.parallelStream()
                    .sequential().filter(e -> e.getSalary() > 15000).count());

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("ParallelStream: Sequential Filter Time Taken? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
    }
    
    public static List<Employee> getEmpList() {
        return Arrays.asList(
                new Employee("A", 20000),
                new Employee("B", 3000),
                new Employee("C", 15002),
                new Employee("D", 7856),
                new Employee("E", 200),
                new Employee("F", 50000),
                new Employee("G", 20000),
                new Employee("K", 3000),
                new Employee("L", 15002),
                new Employee("H", 7856),
                new Employee("M", 200),
                new Employee("N", 50000),
                new Employee("AA", 20000),
                new Employee("BB", 3000),
                new Employee("CC", 15002),
                new Employee("DD", 7856),
                new Employee("EE", 200),
                new Employee("FF", 50000),
                new Employee("GG", 20000),
                new Employee("KK", 3000),
                new Employee("LL", 15002),
                new Employee("HH", 7856),
                new Employee("MM", 200),
                new Employee("NN", 50000),
                new Employee("AAA", 20000),
                new Employee("BBB", 3000),
                new Employee("CCC", 15002),
                new Employee("DDD", 7856),
                new Employee("EEE", 200),
                new Employee("FFF", 50000),
                new Employee("GGG", 20000),
                new Employee("KKK", 3000),
                new Employee("LLL", 15002),
                new Employee("HHH", 7856),
                new Employee("MMM", 200),
                new Employee("NNN", 50000));

    }
}