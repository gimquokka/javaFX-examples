package hw5_calc;

public class Calc1 {
    private double op1;
    private double op2;
    private char operator;

    public void setOp1(String op1) {
        this.op1 = Double.valueOf(op1);
    }

    public void setOp2(String op2) {
        this.op2 = Double.valueOf(op2);
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getResult(char operator) {
        switch (operator) {
            case '+':
                return String.valueOf(op1 + op2);
            case '-':
                return String.valueOf(op1 - op2);
            case '*':
                return String.valueOf(op1 * op2);
            case '/':
                return String.valueOf(op1 / op2);
            default:
                return "Error";
        }
    }
}
