package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Condition;

import java.util.List;

public class IfStatement extends Statement {

    private final Condition condition;
    private final List<Base> statements;
    private ElseStatement elseStatement;

    public IfStatement(Condition condition, List<Base> statements) {
        this.condition = condition;
        this.statements = statements;
    }

    public IfStatement(Condition condition, List<Base> statements, ElseStatement elseStatement) {
        this.condition = condition;
        this.statements = statements;
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Base stat: statements) {
            builder.append(stat.toString());
            if (!stat.toString().endsWith("}")) {
                builder.append(";");
            }

        }

        if (elseStatement != null) {
            return String.format("if(%s)\n{%s}%s", condition.toString(), builder, elseStatement.toString());
        }

        return String.format("if(%s)\n{%s}", condition.toString(), builder);
    }
}
