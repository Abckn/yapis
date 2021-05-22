package gen.my.expressions;

public class Parameter  extends Expression{
    private String type, name;
    private Number number;

    public Parameter(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Parameter(String name) {
        this.name = name;
    }

    public Parameter(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(number != null){
            return number.toString();
        } else if(type == null)
            return name;
        else
            return type + " " + name;
    }
}
