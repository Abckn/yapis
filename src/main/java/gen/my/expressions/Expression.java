package gen.my.expressions;


import gen.my.base.Base;

public  class Expression extends Base {

    private String expression;

    public Expression() {
    }

    public Expression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression;
    }
}
