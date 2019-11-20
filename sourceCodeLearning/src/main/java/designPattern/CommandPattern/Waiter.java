package designPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private static List<Command> commandList = new ArrayList<>();

    /**
     * 加菜、点菜
     */
    public void add(Command command,String reason){
        System.out.println("add command :" + command.getClass().getName() + "; reason : " + reason);
        commandList.add(command);
    }

    /**
     * 取消某样菜
     */
    public void remove(Command command,String reason){
        System.out.println("remove command :" + command.getClass().getName() + "; reason : " + reason);
        commandList.remove(command);
    }

    /**
     * 上菜
     */
    public void doCommand(){
        for (Command command : commandList) {
            command.excuteCommand();
        }
    }

}
