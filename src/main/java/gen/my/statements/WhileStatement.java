package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Condition;

import java.util.List;

public class WhileStatement extends Statement {

    private final Condition condition;
    private final List<Base> statements;

    public WhileStatement(Condition condition, List<Base> statements) {
        this.condition = condition;
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

        return String.format("while(%s){%s}", condition.toString(), builder);
    }
}
