package gen.my.expressions;

public class NameAndValue extends Expression {

    private final String name;
    private final String value;

    public NameAndValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " = " + value;
    }


}
