package designPattern.InterpreterPattern;

/**
 * 解释器模式
 * 制定一系列规则，选择不同的规则来处理输入的信息
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression maleExpression = getMaleExpression();
        Expression marriedExpression = getMarriedExpression();

        System.out.println("Is john male?");
        System.out.println(maleExpression.interpert("John"));
        System.out.println("Is Julie a single woman?");
        System.out.println(marriedExpression.interpert("Single Julie"));

    }

    //规则  名字为John或Mike的人是男性
    public static Expression getMaleExpression(){
        TerminalExpression john = new TerminalExpression("John");
        TerminalExpression mike = new TerminalExpression("Mile");
        return new OrExpression(john, mike);
    }

    //规则 Julie是一名已婚女性
    public static Expression getMarriedExpression(){
        TerminalExpression julie = new TerminalExpression("Julie");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }


}
