package examplepropertyprivate;

public class Mathematics {
    private int operand1;
    private int operand2;

    public Mathematics(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        if ( operand2 == 0 ) {
            System.out.println( "Нельзя делить на ноль. Давай другое число" );
        } else {
            this.operand2 = operand2;
        }
    }

    public int division() {
        return operand1 / operand2;
    }
}
