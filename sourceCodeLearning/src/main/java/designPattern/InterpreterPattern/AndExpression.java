package designPattern.InterpreterPattern;

public class AndExpression implements Expression {

    private Expression exp1;

    private Expression exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public Boolean interpert(String target) {
        return exp1.interpert(target) && exp2.interpert(target);
    }
}
