package gen.my.expressions;

public class TypeConversion extends Expression {

    private final String type;
    private final String variable;

    public TypeConversion(String type, String variable) {
        this.type = type;
        this.variable = variable;
    }

    @Override
    public String toString() {
        if (type.equals("Integer")) {
            return "Math.round(" + variable + ")";
        }
        else if (type.equals("Float")) {
            return "Float.valueOf(" + variable + ")";
        }
        else {
            try {
                throw new Exception("wrong type");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return "we have exception, we dont need return, come on";
    }
}
