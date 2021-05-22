package gen.my.expressions;

public class UnaryOperator extends Expression {

    private String var, operator, side;

    public UnaryOperator(String var, String operator, String side) {
        this.var = var;
        this.side = side;
        this.operator = operator;
    }

    @Override
    public String toString() {
        if(side.equals("l")){
            return var + operator;
        } else if(side.equals("r")) {
            return operator + var;
        } else
            return "wrong side";
    }
}
