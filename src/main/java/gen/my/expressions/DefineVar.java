package gen.my.expressions;


public class DefineVar extends Expression {

    private final String type;
    private final NameAndValue nameAndValue;

    public DefineVar(String type, NameAndValue nameAndValue) {
        this.type = type;
        this.nameAndValue = nameAndValue;
    }

    public String getType() {
        return type;
    }

    public NameAndValue getNameAndValue() {
        return nameAndValue;
    }

    @Override
    public String toString() {
        return type + " " + nameAndValue.toString();
    }


}
