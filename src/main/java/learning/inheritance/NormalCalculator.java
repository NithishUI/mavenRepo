package learning.inheritance;

class NormalCalculator {
    private int num1 = 0, num2 = 0;

    NormalCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int add(String num1, String num2) {
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }

    public int sub() {
        return num1 - num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int div() {
        return num1 / num2;
    }
}
