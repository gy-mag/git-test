public class Counter {
    public void run() {
        for (int i = 1; i <= 15; i++) {
            if (new FizzBuzzChecker().isFizzBuzz(i)) {
                System.out.println("Nagi");
            } else if (new FizzChecker().isFizz(i)) {
                System.out.println("Nagi");
            } else if (new BuzzChecker().isBuzz(i)) {
                System.out.println("Nagi");
            } else {
                System.out.println(i);
            }
        }
    }
}
