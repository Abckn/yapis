package gen.my.statements;

import gen.my.base.Base;

import java.util.*;

public class ElseStatement extends Statement{
    private final List<Base> statements;

    public ElseStatement(List<Base> statements) {
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

        return String.format("else{%s}", builder);
    }
}
