package gen.my.statements;

import gen.my.base.Base;

import java.util.List;


public class MainFunction extends Function {

    private final List<Base> statements;

    public MainFunction(List<Base> statements) {
        this.statements = statements;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Base stat : statements) {
            builder.append(stat.toString());
            if (!stat.toString().endsWith("}")) {
                builder.append(";");
            }
        }

        return String.format("public static void main(String[] args){%s}", builder);
    }
}
