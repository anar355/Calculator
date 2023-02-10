package inheritance;

public class Calculator {
    double accumulator;

    public Calculator(double accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "accumulator=" + accumulator +
                '}';
    }


    public double getAccumulator() {
        return accumulator;
    }

    public void setAccumulator(double accumulator) {
        this.accumulator = accumulator;
    }
}
