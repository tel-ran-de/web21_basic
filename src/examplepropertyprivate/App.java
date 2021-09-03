package examplepropertyprivate;

public class App {
    public static void main(String[] args) {
        Mathematics op1 = new Mathematics(10,5);
        System.out.println(op1.division());
        op1.setOperand2(0);
        System.out.println(op1.division());
        op1.setOperand2(3);
        System.out.println(op1.division());

        System.out.println( op1.getOperand2() );

    }
}
