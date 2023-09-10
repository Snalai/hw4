package org.example.work2;

class PrintAr{

    public <T> void printArray(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PrintAr printAr = new PrintAr();
        Integer[] numbers = {1, 2, 35, 4, 563, 7456, 48};
        String[] people = {"A", "B", "C", "D", "E", "F"};
        printAr.printArray(numbers);
        printAr.printArray(people);

    }
}
