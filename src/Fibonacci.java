import java.util.ArrayList;

public class Fibonacci implements FibonacciLike, Runnable {
    // Fields
ArrayList<Integer> Sequence;
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    boolean calculateDone;

    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
        Sequence = new ArrayList();
    }

    public void calculate() {
            Sequence.add(number1);
            Sequence.add(number2);
            for (int i = amountofNumbersInSequence - 2; i >= 0; i = i - 1) {
                int x = number2 + number1;
                Sequence.add(x);
                number1 = number2;
                number2 = x;

            }

        calculateDone = true;
        System.out.println(Thread.currentThread().getName() + " is done");

    }
    public boolean print() {
        if (calculateDone) {
            for (Integer num : Sequence) {
                System.out.print(num + " ");
            }
            System.out.println("");
            return true;
        }
        return false;
    }

    @Override
    public void run() {
calculate();
    }
}
