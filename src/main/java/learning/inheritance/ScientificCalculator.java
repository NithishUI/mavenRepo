package learning.inheritance;

class ScientificCalculator extends NormalCalculator {
    private int num3 = 0, num4 = 0;

    ScientificCalculator(int num1, int num2) {
        super(num1, num2);
        this.num3 = num1;
        this.num4 = num2;
    }

    public int modulo() {
        return num3 % num4;
    }
}
