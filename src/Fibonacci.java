import java.util.ArrayList;

public class Fibonacci implements FibonacciLike, Runnable {
    // Fields
    ArrayList answers;
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;

    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
        answers = new ArrayList();
    }

    public void calculate() {
        try {
            answers.add(number1);
            System.out.println(number2);
            for (int i = amountofNumbersInSequence - 3; i >= 0; i = i - 1) {
                int x = number2 + number1;
                System.out.println(x);
                number1 = number2;
                number2 = x;
                Thread.sleep(1000);
            }
        } catch (Exception ex) {

        }
    }

    @Override
    public void run() {
calculate();
    }
}
