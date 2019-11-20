package designPattern.InterpreterPattern;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public Boolean interpert(String target) {
        Boolean isContains = false;
        if(data != null){
            isContains = target.contains(data);
        }
        return isContains;
    }
}
