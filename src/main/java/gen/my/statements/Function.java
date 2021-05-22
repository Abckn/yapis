package gen.my.statements;

import gen.my.base.Base;
import gen.my.expressions.Parameter;

import java.util.List;


public class Function extends Statement {

    private List<Parameter> parameters;
    private List<Base> statements;

    private String name;
    private String type;

    public Function() {
    }

    public Function(List<Parameter> parameters, String name, String type, List<Base> statements) {
        this.parameters = parameters;
        this.name = name;
        this.type = type;
        this.statements = statements;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        StringBuilder params  = new StringBuilder();

        if (statements != null) {
            for (Base statement : statements) {
                builder.append(statement.toString());
                if (!statement.toString().endsWith("}")) {
                    builder.append(";");
                }
            }
        }

        if (parameters != null) {
            for (Base parameter : parameters) {
                params.append(parameter.toString()).append(",");
            }
            params.deleteCharAt(params.length() - 1);
        }

        return String.format("private static %s %s ( %s ) {%s}", type, name, params, builder);
    }
}
