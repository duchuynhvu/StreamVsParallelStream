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
        System.out.print("Stream: Filter Order?\n");
        eList.stream().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));
        
        System.out.println("\n");

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");

        System.out.println("\n------------------------");
        
        // ## UNORDERED FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.print("Stream: Unordered Filter Order?\n");
        eList.stream().unordered().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));
                    
        System.out.println("\n");

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
        
        System.out.println("\n------------------------");
        
        // ## SEQUENTIAL FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.print("Stream: Sequential Filter Order?\n");
        eList.stream().sequential().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));
                    
        System.out.println("\n");

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
        
        
        System.out.println("\n=========================");
        /*****
         * Here We Are Creating A 'Parallel Stream' & Displaying The Result
         *****/
        
        // ## FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.print("ParallelStream: Filter Order?\n"); 
        eList.parallelStream().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));
        
        System.out.println("\n");

        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");

        System.out.println("\n------------------------");
        
     // ## UNORDERED FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.print("ParallelStream: Unordered Filter Order?\n");
        eList.parallelStream().unordered().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));

        System.out.println("\n");
        
        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
                
        System.out.println("\n------------------------");
        
        // ## SEQUENTIAL FILTER
        startNanoTime = System.nanoTime();
        startMillisTime = System.currentTimeMillis();
        System.out.print("ParallelStream: Sequential Filter Order?\n");
        eList.parallelStream().sequential().filter(e -> e.getSalary() > 15000)
                .forEach(e -> System.out.print(e.getName() + " "));

        System.out.println("\n");
        
        endNanoTime = System.nanoTime();
        endMillisTime = System.currentTimeMillis();
        System.out.println("Elapsed time? " 
                + (endNanoTime - startNanoTime) + "(ns), "
                + (endMillisTime - startMillisTime) +"(ms)\n");
    }
    
    public static List<Employee> getEmpList() {
        return Arrays.asList(
                new Employee("1", 20000),
                new Employee("2", 3000),
                new Employee("3", 15002),
                new Employee("4", 7856),
                new Employee("5", 200),
                new Employee("6", 50000),
                new Employee("7", 20000),
                new Employee("8", 3000),
                new Employee("9", 15002),
                new Employee("10", 7856),
                new Employee("11", 200),
                new Employee("12", 50000),
                new Employee("13", 20000),
                new Employee("14", 3000),
                new Employee("15", 15002),
                new Employee("16", 7856),
                new Employee("17", 200),
                new Employee("18", 50000),
                new Employee("19", 20000),
                new Employee("20", 3000),
                new Employee("21", 15002),
                new Employee("22", 7856),
                new Employee("23", 200),
                new Employee("24", 50000),
                new Employee("25", 20000),
                new Employee("26", 3000),
                new Employee("27", 15002),
                new Employee("28", 7856),
                new Employee("29", 200),
                new Employee("30", 50000),
                new Employee("31", 20000),
                new Employee("32", 3000),
                new Employee("33", 15002),
                new Employee("34", 7856),
                new Employee("35", 200),
                new Employee("36", 200),
                new Employee("37", 200),
                new Employee("38", 200),
                new Employee("39", 200),
                new Employee("40", 50000),
                new Employee("41", 20000),
                new Employee("42", 3000),
                new Employee("43", 15002),
                new Employee("44", 7856),
                new Employee("45", 200),
                new Employee("46", 50000),
                new Employee("47", 20000),
                new Employee("48", 3000),
                new Employee("49", 15002),
                new Employee("50", 200),
                new Employee("51", 20000),
                new Employee("52", 3000),
                new Employee("53", 15002),
                new Employee("54", 7856),
                new Employee("55", 200),
                new Employee("56", 50000),
                new Employee("57", 20000),
                new Employee("58", 3000),
                new Employee("59", 15002));

    }
}