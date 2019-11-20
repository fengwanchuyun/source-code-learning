package designPattern.MementoPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录角色   记录每一步旗子的信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChessMemento {
    private String label;
    private int x;
    private int y;
}
