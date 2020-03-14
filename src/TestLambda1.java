interface Executable1 {
    int execute(int x, int y);
}

class Runner1 {
    public void run(Executable1 e) {
        int a = e.execute(10, 20);
        System.out.println(a);
    }
}

public class TestLambda1 {
    public static void main(String[] args) {
        Runner1 runner = new Runner1();

        runner.run(new Executable1() {
            @Override
            public int execute(int x, int y) {
                System.out.println("Hi !!!");
                System.out.println("Goodbye !!!");
                return x + y;
            }
        });
        runner.run((x, y) -> {
            System.out.println("Hi !!!");
            System.out.println("Goodbye !!!");
            return x + y;
        });
        final int a = 1;
        runner.run((x, y) -> x + y + a);

    }
}