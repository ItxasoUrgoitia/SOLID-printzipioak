package SRP;

public class VATCalculator {

    private static final float VAT_RATE = 0.16f; // 16%

    public float calculate(float billAmount) {
        return billAmount * VAT_RATE;
    }
}