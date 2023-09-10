package org.example.work1;
class Print<T> {
    T n;

    public Print(T n) {
        this.n = n;
    }

    public void printElement(){
       System.out.println(n);
    }
}
public class Main {
    public static void main(String[] args) {
        Print<Integer> printI = new Print(3);
        Print<String> printS = new Print("3");
        Print<Double> printD = new Print(3.5);

        printI.printElement();
        printS.printElement();
        printD.printElement();


    }


}
