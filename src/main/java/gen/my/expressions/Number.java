package gen.my.expressions;

public class Number extends Expression {

    private final String number;
    private String fraction;


    public Number(String number) {
        this.number = number;
    }

    public Number(String number, String fraction) {
        this.number = number;
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        if(fraction == null){
            return number;
        } else {
            return number + "." + fraction +"f";
        }
    }
}
