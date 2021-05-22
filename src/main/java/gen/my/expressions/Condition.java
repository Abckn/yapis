package gen.my.expressions;

public class Condition extends Expression {

    private final String operator;

    public Condition(String left, String operator, String right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String toString() {
        return left + operator + right;
    }
}
