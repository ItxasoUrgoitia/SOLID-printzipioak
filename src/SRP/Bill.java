package SRP;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

	private DeductionCalculator deductionCalculator;
    private VATCalculator vatCalculator;

    public Bill(DeductionCalculator deductionCalculator, VATCalculator vatCalculator) {
        this.deductionCalculator = deductionCalculator;
        this.vatCalculator = vatCalculator;
    }

    public void totalCalc() {
        billDeduction = deductionCalculator.calculate(billAmount, deductionPercentage);
        VAT = vatCalculator.calculate(billAmount);
        billTotal = (billAmount - billDeduction) + VAT;
    }

}