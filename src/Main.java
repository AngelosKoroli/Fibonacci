public class Main {
    public static void main(String[] args) {
        Fibonacci fib1 = new Fibonacci(12,5,2);
        Thread thread1 = new Thread(fib1);

        Fibonacci fib2 = new Fibonacci(12,1,2);
        Thread thread2 = new Thread(fib2);

        Fibonacci fib3 = new Fibonacci(12,10,4);
        Thread thread3 = new Thread(fib3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}