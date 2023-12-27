public class Tmp {
    public static final int N_ITERATIONS = Integer.MAX_VALUE;
    public String a;
    public String b;

    public Tmp() {
        this.a = "a";
        this.b = "b";
    }

    public String test() {
        return a + b;

    }

    public static void main(String[] args) {
        Tmp tmp = new Tmp();
        tmp.dao();

    }

    private void dao() {

        long tStart, tElapsed;


        tStart = System.currentTimeMillis();
        for (int i = 0; i < N_ITERATIONS; i++) {
            test();
        }

        tElapsed = System.currentTimeMillis() - tStart;
        System.out.println("Method  took " + tElapsed + " ms");

    }
}
