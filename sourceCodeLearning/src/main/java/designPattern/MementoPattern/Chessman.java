package designPattern.MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 棋子信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chessman {
    private String label;
    private int x;
    private int y;

    public ChessMemento get(){
        return  new ChessMemento(this.label,this.x,this.y);
    }

    public void save(ChessMemento memento){
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void show(){
        System.out.println(String.format("当前旗子是%s ，位置是 <%d,%d>",this.label,this.x,this.y));
    }
}
